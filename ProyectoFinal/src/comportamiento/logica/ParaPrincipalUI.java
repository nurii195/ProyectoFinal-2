package comportamiento.logica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;

import comportamiento.articulo.ParaAltaArticuloUI;
import comportamiento.articulo.ParaBajaArticuloUI;
import comportamiento.articulo.ParaConsultaArticuloUI;
import comportamiento.articulo.ParaModificacionArticuloUI;
import comportamiento.cliente.ParaAltaClienteUI;
import comportamiento.cliente.ParaBajaClienteUI;
import comportamiento.cliente.ParaConsultaClienteUI;
import comportamiento.cliente.ParaModificacionClienteUI;
import comportamiento.pedido.ParaAltaPedidoUI;
import comportamiento.pedido.ParaBajaPedidoUI;
import comportamiento.pedido.ParaConsultaPedidoUI;
import comportamiento.pedido.ParaModificarPedidoUI;
import modelo.GestorObjetos;
import modelo.IObjeto;
import rutas.RutasFicheros;
import vista.principal.JPanelBackground;
import vista.principal.PrincipalUI;

import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.event.ActionEvent;

public class ParaPrincipalUI extends PrincipalUI {

	private IObjeto gestorArchivoCliente;
	private IObjeto gestorArchivoArticulo;
	private GestorCliente gCliente;
	private GestorArticulo gArticulo;
	private GestorPedido gPedido;
	private GestorObjetos gestorArchivoPed;

	
	public ParaPrincipalUI() {
		super();
	
		gestorArchivoCliente = new GestorObjetos(RutasFicheros.rutaCliente);
		gestorArchivoArticulo = new GestorObjetos(RutasFicheros.rutaArticulo);
		gCliente = new GestorCliente(gestorArchivoCliente);
		gArticulo = new GestorArticulo(gestorArchivoArticulo);
		
		gestorArchivoPed = new GestorObjetos(RutasFicheros.rutaPedido);
		gPedido = new GestorPedido(gestorArchivoPed);

		mntmConsult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaConsultaClienteUI consulta = new ParaConsultaClienteUI(gCliente);
				cambiarPanel(consulta);
				
			}
		});
		mntmAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaAltaClienteUI alta = new ParaAltaClienteUI(gCliente);
				cambiarPanel(alta);

			}
		});
		mntmBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaBajaClienteUI baja = new ParaBajaClienteUI(gCliente);
				cambiarPanel(baja);

			}
		});
		
		mntmMo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaModificacionClienteUI modifi = new ParaModificacionClienteUI(gCliente);
				cambiarPanel(modifi);

			}
		});
		mntmArtiAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaAltaArticuloUI alta = new ParaAltaArticuloUI(gArticulo);
				cambiarPanel(alta);
			}
		});
		mntmArtiConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaConsultaArticuloUI consulta = new ParaConsultaArticuloUI(gArticulo);
				cambiarPanel(consulta);
			}
		});

		mntmArtiBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaBajaArticuloUI baja = new ParaBajaArticuloUI(gArticulo);
				cambiarPanel(baja);
			}
		});
		mntmArtiModif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaModificacionArticuloUI modificacion = new ParaModificacionArticuloUI(gArticulo);
				cambiarPanel(modificacion);
			}
		});
		mntmPedidoAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaAltaPedidoUI alta= new ParaAltaPedidoUI(gArticulo, gCliente, gPedido);
				cambiarPanel(alta);
			}
		});
		
		mntmPedidoConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaConsultaPedidoUI consulta = new ParaConsultaPedidoUI(gPedido);
				cambiarPanel(consulta);
			}
		});
		mntmPedidoBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaBajaPedidoUI baja = new ParaBajaPedidoUI(gPedido);
				cambiarPanel(baja);
			}
		});
		mntmPedidoModif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaModificarPedidoUI modificacion = new ParaModificarPedidoUI(gArticulo,gPedido);
				cambiarPanel(modificacion);
				
			}
		});
	}
	
	private void cambiarPanel(JPanel panel){
		JPanel p = new JPanel();
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{20, 0, 20, 0};
		gridBagLayout.rowHeights = new int[]{20, 0, 20, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		p.setLayout(gridBagLayout);
		
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		p.add(panel, gbc_panel);
		

		setContentPane(p);
		this.revalidate();
	}

}
