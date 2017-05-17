package Controlador;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.LineaPedido;
import Modelo.Pedido;
import Vista.AltaPedidoUI;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class ParaAltaPedidoUI extends AltaPedidoUI {

	private final GestorArticulo gestorArticulo;
	private final GestorCliente gestorCliente;
	int linea = 1;
	Articulo busquedaArt = null;
	Cliente busquedaCli = null;
	GestorPedido gPed=null;
	
	public ParaAltaPedidoUI(GestorArticulo gArticulo, GestorCliente gCliente, GestorPedido gPed) {
		this.gPed = gPed;
		btnGuardarAP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(busquedaCli != null){
					DefaultTableModel model = (DefaultTableModel) table_1.getModel();
					ArrayList<LineaPedido> lineasPed = new ArrayList<>();
					int filas = model.getRowCount();
					for (int i = 0; i < filas; i++) {
						Object nombre = model.getValueAt(i, 1);
						Object cant = model.getValueAt(i, 2);
						Object consulta = gestorArticulo.consulta((String) nombre);
						
						
						if (consulta != null) {
							LineaPedido lineaPedido = new LineaPedido();
							lineaPedido.setIdLineaPedido(i+1);
							lineaPedido.setCantidad((int) cant);
							lineaPedido.setArticulo((Articulo) consulta);
							lineasPed.add(lineaPedido);
						}
					}
					Pedido ped = new Pedido();
					ped.setCliente(busquedaCli);
					ped.setLineasPedidos(lineasPed);
					ped.setFecha("Hoy");
					
					boolean alta = gPed.alta(ped);
					if (alta) {
						JOptionPane.showMessageDialog(null, "message");
					}
				}
			}
		});
		
		
		btnEliminarLineaAP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table_1.getModel();
				
				int selectedRow = table_1.getSelectedRow();
				if(selectedRow > -1){
					model.removeRow(selectedRow);
				}
			}
		});
		
		btnAñadirAP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int cantidad = 0;
				try {
					cantidad = Integer.valueOf(textCantidadAP.getText());
				} catch (NumberFormatException e1) {
					//Joptionpane blablabala
					return;
				}
				
				if (busquedaArt != null) {
					DefaultTableModel model = (DefaultTableModel) table_1.getModel();
					Object[] rowData = { 
							linea,
							busquedaArt.getNombreArticulo(),
							cantidad
					};
					
					model.addRow(rowData);
					linea++;
					textRefArticuloAP.setText("");
					textNombreArtAP.setText("");
					textPrecioAP.setText("");
					textCantidadAP.setText("");
					busquedaArt = null;
				}
			}
		});
		
		btnLimpiarAP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textNombreArtAP.setText("");
				textRefArticuloAP.setText("");
				textCantidadAP.setText("");
				textPrecioAP.setText("");
				
			}
		});
		gestorArticulo=gArticulo;
		gestorCliente=gCliente;
		
		textRefArticuloAP.setEnabled(false);
		textNombreArtAP.setEnabled(false);
		textPrecioAP.setEnabled(false);
		
		
		btnBuscarClienteAP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dniCliente = textDniClienteAP.getText();
				Object object = gestorCliente.consulta(dniCliente);
				if (object!=null) {
					Cliente cliente=(Cliente)object;
					busquedaCli = cliente;
					textNombreClienteAP.setText(cliente.getNombre());
					textPrimerApeAP.setText(cliente.getPrimerApellido());
					textSegundoApeAP.setText(cliente.getSegundoApellido());				
				}else{
					JOptionPane.showMessageDialog(null, "Cliente no esta dado de alta");
				}
				
				
			}
		});
		
		
		
		btnBuscarArticuloAP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String nombreArticulo = textNombreArticuloAP.getText();
			
			Object object = gestorArticulo.consulta(nombreArticulo);
			if (object!=null) {
				Articulo articulo=(Articulo)object;
				busquedaArt = articulo;
				textRefArticuloAP.setText(String.valueOf(articulo.getIdArticulo()));
				textNombreArtAP.setText(articulo.getNombreArticulo());
				textPrecioAP.setText(String.valueOf(articulo.getPrecio()));
				textCantidadAP.setText(textCantidadAP.getText());
			}else{
				JOptionPane.showMessageDialog(null, "Articulo no esta dado de alta");
			}		
				
			}
		});
		

	}

}
