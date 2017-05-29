package comportamiento.pedido;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import comportamiento.logica.GestorArticulo;
import comportamiento.logica.GestorPedido;
import modelo.Articulo;
import modelo.LineaPedido;
import modelo.Pedido;
import vista.pedido.ModificarPedidoUI;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class ParaModificarPedidoUI extends ModificarPedidoUI {

	private final GestorArticulo gestorArticulo;
	private final GestorPedido gestorPedido;
	private int linea = 1;

	public ParaModificarPedidoUI(GestorArticulo gArticulo, GestorPedido gPedido) {
		super();
		gestorArticulo = gArticulo;
		gestorPedido = gPedido;
		
		
		btnEliminarLineaModPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				int selectedRow = table.getSelectedRow();
				if (selectedRow > -1) {
					model.removeRow(selectedRow);
				}
			}
		});
		

		comboBoxModPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				Object selectedItem = comboBoxModPedido.getSelectedItem().toString();
				if (selectedItem instanceof Pedido) {
					Pedido pedido = (Pedido) selectedItem;

					ArrayList<LineaPedido> lineasPedidos = pedido.getLineasPedidos();

					for (LineaPedido lineaPedido : lineasPedidos) {
						Object[] rowData = { lineaPedido.getIdLineaPedido(), lineaPedido.getArticulo(),
								lineaPedido.getCantidad() };
						model.addRow(rowData);
									
					}
				}
			}
		});

		DefaultComboBoxModel<Pedido> modelPedido = (DefaultComboBoxModel<Pedido>) comboBoxModPedido.getModel();
		ArrayList<Object> listaPedido = gestorPedido.getLista();
		for (Object object : listaPedido) {
			if (object instanceof Pedido) {
				modelPedido.addElement((Pedido) object);
			}
		}

		btnAñadirModP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cantidad = 0;
				try {
					cantidad = Integer.valueOf(textCantidad.getText());
				} catch (NumberFormatException e1) {
					// Joptionpane blablabala
					return;
				}

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				Object[] rowData = { linea, comboBoxNombreArtModP.getSelectedItem().toString(), cantidad };

				model.addRow(rowData);
				linea++;
				textNombreArtModP.setText("");
				textRefArtModP.setText("");
				textCantidad.setText("");
				textPrecioModP.setText("");
			}
		});

		btnLimpiarModP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNombreArtModP.setText("");
				textRefArtModP.setText("");
				textCantidad.setText("");
				textPrecioModP.setText("");

			}
		});

		comboBoxNombreArtModP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultComboBoxModel<Articulo> model = (DefaultComboBoxModel<Articulo>) comboBoxNombreArtModP
						.getModel();
				Object selectedItem = comboBoxNombreArtModP.getSelectedItem();
				if (selectedItem instanceof Articulo) {
					Articulo art = (Articulo) selectedItem;

					textRefArtModP.setText(String.valueOf(art.getIdArticulo()));
					textNombreArtModP.setText(art.getNombreArticulo());
					textPrecioModP.setText(String.valueOf(art.getPrecio()));
					textCantidad.setText(textCantidad.getText());

				}

			}
		});

		DefaultComboBoxModel<Articulo> model = (DefaultComboBoxModel<Articulo>) comboBoxNombreArtModP.getModel();
		ArrayList<Object> lista = gestorArticulo.getLista();
		for (Object object : lista) {
			if (object instanceof Articulo) {
				model.addElement((Articulo) object);
			}
		}
	}

}
