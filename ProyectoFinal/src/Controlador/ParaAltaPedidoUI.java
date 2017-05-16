package Controlador;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Modelo.Articulo;
import Modelo.Cliente;
import Vista.AltaPedidoUI;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class ParaAltaPedidoUI extends AltaPedidoUI {

	private final GestorArticulo gestorArticulo;
	private final GestorCliente gestorCliente;
	int linea = 1;
	Articulo busquedaArt = null;
	
	public ParaAltaPedidoUI(GestorArticulo gArticulo, GestorCliente gCliente) {
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
