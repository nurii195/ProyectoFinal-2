package comportamiento.pedido;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import comportamiento.articulo.ParaBajaArticuloUI;
import comportamiento.logica.GestorArticulo;
import comportamiento.logica.GestorCliente;
import comportamiento.logica.GestorPedido;
import modelo.Articulo;
import modelo.Cliente;
import modelo.LineaPedido;
import modelo.Pedido;
import vista.pedido.AltaPedidoUI;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ParaAltaPedidoUI extends AltaPedidoUI {

	private final GestorArticulo gestorArticulo;
	private final GestorCliente gestorCliente;
	int linea = 1;
	Articulo busquedaArt = null;
	Cliente busquedaCli = null;
	GestorPedido gPed = null;

	public ParaAltaPedidoUI(GestorArticulo gArticulo, GestorCliente gCliente, GestorPedido gPed) {
		super();
		this.gPed = gPed;
		gestorArticulo = gArticulo;
		gestorCliente = gCliente;
	
		btnGuardarAP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (busquedaCli != null) {
					DefaultTableModel model = (DefaultTableModel) table_1.getModel();
					ArrayList<LineaPedido> lineasPed = new ArrayList<>();
					int filas = model.getRowCount();
					for (int i = 0; i < filas; i++) {
						Object nombre = model.getValueAt(i, 1);
						Object cant = model.getValueAt(i, 2);
						Object consulta = gestorArticulo.consulta((String) nombre);

						if (consulta != null) {
							LineaPedido lineaPedido = new LineaPedido();
							lineaPedido.setIdLineaPedido(i + 1);
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
						lblIdAltaPedido.setText(String.valueOf(ped.getIdPedido()));

						JOptionPane.showMessageDialog(null, "Se ha dado de alta su pedido");
					} else {
						JOptionPane.showMessageDialog(null, "Error, no se ha dado de alta su pedido");
					}
				}
			}
		});

		btnEliminarLineaAP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table_1.getModel();

				int selectedRow = table_1.getSelectedRow();
				if (selectedRow > -1) {
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
					// Joptionpane blablabala
					return;
				}

			
					DefaultTableModel model = (DefaultTableModel) table_1.getModel();
					Object[] rowData = { linea, comboBoxAltaPedido.getSelectedItem().toString(), cantidad };

					model.addRow(rowData);
					linea++;
					textRefArticuloAP.setText("");
					textNombreArtAP.setText("");
					textPrecioAP.setText("");
					textCantidadAP.setText("");
				
				
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
		

		btnBuscarClienteAP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dniCliente = textDniClienteAP.getText();
				Object object = gestorCliente.consulta(dniCliente);
				if (object != null) {
					Cliente cliente = (Cliente) object;
					busquedaCli = cliente;
					textNombreClienteAP.setText(cliente.getNombre());
					textPrimerApeAP.setText(cliente.getPrimerApellido());
					textSegundoApeAP.setText(cliente.getSegundoApellido());
				} else {
					JOptionPane.showMessageDialog(null, "Cliente no esta dado de alta");
				}

			}
		});

		comboBoxAltaPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultComboBoxModel<Articulo> model = (DefaultComboBoxModel<Articulo>) comboBoxAltaPedido.getModel();
				Object selectedItem = comboBoxAltaPedido.getSelectedItem();
				if (selectedItem instanceof Articulo) {
					Articulo art = (Articulo) selectedItem;

					textRefArticuloAP.setText(String.valueOf(art.getIdArticulo()));
					textNombreArtAP.setText(art.getNombreArticulo());
					textPrecioAP.setText(String.valueOf(art.getPrecio()));
					textCantidadAP.setText(textCantidadAP.getText());

				}
			}
		});
		
		DefaultComboBoxModel<Articulo> model = (DefaultComboBoxModel<Articulo>) comboBoxAltaPedido.getModel();
		ArrayList<Object> lista = gestorArticulo.getLista();
		for (Object object : lista) {
			if (object instanceof Articulo) {
				model.addElement((Articulo) object);
			}
		}

	}

}
