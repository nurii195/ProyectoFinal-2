package comportamiento.pedido;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import comportamiento.logica.GestorArticulo;
import comportamiento.logica.GestorPedido;
import modelo.Articulo;
import modelo.LineaPedido;
import modelo.Pedido;
import vista.pedido.ModificarPedidoUI;

public class ParaModificarPedidoUI extends ModificarPedidoUI {

	private final GestorArticulo gestorArticulo;
	private final GestorPedido gestorPedido;
	private int linea = 1;
	private int cantidad=0;
	private Pedido pedidoTemporal=new Pedido();

	public ParaModificarPedidoUI(GestorArticulo gArticulo, GestorPedido gPedido) {
		super();
		gestorArticulo = gArticulo;
		gestorPedido = gPedido;
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pedidoTemporal != null) {
					Object selectedItem = comboBoxModPedido.getSelectedItem();
					if (selectedItem instanceof Pedido) {
						Pedido pedido = (Pedido) selectedItem;
						copiarPedido(pedidoTemporal, pedido);
						gestorPedido.modificacion(pedido);
					} 
				}
			}
		});
			
		btnEliminarLineaModPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				int selectedRow = table.getSelectedRow();
				if (selectedRow > -1) {
					model.removeRow(selectedRow);
					pedidoTemporal.getLineasPedidos().remove(selectedRow);
				}
			}
		});
		

		comboBoxModPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int contador=0;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				Object selectedItem = comboBoxModPedido.getSelectedItem();
				if (selectedItem instanceof Pedido) {
					Pedido pedido = (Pedido) selectedItem;
					copiarPedido(pedido, pedidoTemporal);
					ArrayList<LineaPedido> lineasPedidos = pedido.getLineasPedidos();
					model.setRowCount(0);
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
				//añadir a pedido temporal
				LineaPedido lineaPedido= new LineaPedido();
				lineaPedido.setArticulo((Articulo) comboBoxNombreArtModP.getSelectedItem());
				lineaPedido.setCantidad(cantidad);
				lineaPedido.setIdLineaPedido(linea);
				pedidoTemporal.getLineasPedidos().add(lineaPedido);
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
		
		DefaultTableModel modeloTabla = (DefaultTableModel) table.getModel();
		modeloTabla.addTableModelListener(new TableModelListener() {
			@Override
			public void tableChanged(TableModelEvent e) {
				int fila = e.getFirstRow();
				int columna = e.getColumn();
				String valor = (String) modeloTabla.getValueAt(fila, columna);
				try{
					int v = Integer.valueOf(valor);
					pedidoTemporal.getLineasPedidos().get(fila).setCantidad(v);
				}catch (Exception ex) {
					//Lo dejamos como estaba antes
					modeloTabla.setValueAt(String.valueOf(pedidoTemporal.getLineasPedidos().get(fila).getCantidad()), fila, columna);
				}
			}
		});
	}
	
	private void copiarPedido(Pedido uno, Pedido dos){
		
		ArrayList<LineaPedido>nuevasLP= new ArrayList<>();
		ArrayList<LineaPedido> lineasPedidos = uno.getLineasPedidos();
		
		
		for (LineaPedido lineaPedido : lineasPedidos) {
			LineaPedido x=new LineaPedido();
			x.setArticulo(lineaPedido.getArticulo());
			x.setCantidad(lineaPedido.getCantidad());
			x.setIdLineaPedido(lineaPedido.getIdLineaPedido());
			nuevasLP.add(x);
		}
		dos.setLineasPedidos(nuevasLP);	
	}
}
