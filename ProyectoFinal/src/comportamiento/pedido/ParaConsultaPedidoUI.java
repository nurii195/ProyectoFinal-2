package comportamiento.pedido;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import comportamiento.logica.IGestorABMC;
import modelo.Cliente;
import modelo.LineaPedido;
import modelo.Pedido;
import vista.pedido.ConsultaPedidoUI;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ParaConsultaPedidoUI extends ConsultaPedidoUI {

	private IGestorABMC gPedido;

	public ParaConsultaPedidoUI(IGestorABMC gestor) {
		this.gPedido = gestor;
		btnConsultarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String idPedido = textIdPedido.getText();
				Object pedido = gPedido.consulta(idPedido);

				if (!idPedido.isEmpty() && pedido != null) {
					if (pedido instanceof Pedido) {
						Pedido nuevoPedido = (Pedido) pedido;
						Cliente cliente = nuevoPedido.getCliente();
						textClientePedido.setText(cliente.getNombre());
						textApellidosPedido.setText(cliente.getPrimerApellido() + " " + cliente.getSegundoApellido());
						rellenarTabla(nuevoPedido);

					}

				} else {
					JOptionPane.showMessageDialog(null, "El numero del pedido no existe");

				}

			}

		});

	}

	private void rellenarTabla(Pedido pedido) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		
		ArrayList<LineaPedido> lineasPedidos = pedido.getLineasPedidos();
		for (int i = 0; i < lineasPedidos.size(); i++) {
			LineaPedido lineaPedido = lineasPedidos.get(i);
			Object[] datos = new Object[3];
			datos[0]=lineaPedido.getIdLineaPedido();
			datos[1]=lineaPedido.getArticulo().getNombreArticulo();
			datos[2]=lineaPedido.getCantidad();
			model.addRow(datos);

		}

	}
}
