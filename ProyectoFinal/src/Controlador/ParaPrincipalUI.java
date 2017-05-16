package Controlador;

import java.awt.EventQueue;
import Vista.PrincipalUI;
import rutas.rutasFicheros;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ParaPrincipalUI extends PrincipalUI {

	private IObjeto gestorArchivoCliente;
	private IObjeto gestorArchivoArticulo;
	private GestorCliente gCliente;
	private GestorArticulo gArticulo;
	private GestorPedido gPedido;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaPrincipalUI frame = new ParaPrincipalUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ParaPrincipalUI() {
		super();
		gestorArchivoCliente = new GestorObjetos(rutasFicheros.rutaCliente);
		gestorArchivoArticulo = new GestorObjetos(rutasFicheros.rutaArticulo);
		gCliente = new GestorCliente(gestorArchivoCliente);
		gArticulo = new GestorArticulo(gestorArchivoArticulo);

		mntmConsult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaConsultaClienteUI consulta = new ParaConsultaClienteUI(gCliente);
				setContentPane(consulta);
				ParaPrincipalUI.this.revalidate();
			}
		});
		mntmAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaAltaClienteUI alta = new ParaAltaClienteUI(gCliente);
				setContentPane(alta);
				ParaPrincipalUI.this.revalidate();

			}
		});
		mntmArtiAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaAltaArticuloUI alta = new ParaAltaArticuloUI(gArticulo);
				setContentPane(alta);
				ParaPrincipalUI.this.revalidate();
			}
		});
		mntmArtiConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaConsultaArticuloUI consulta = new ParaConsultaArticuloUI(gArticulo);
				setContentPane(consulta);
				ParaPrincipalUI.this.revalidate();
			}
		});

		mntmArtiBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaBajaArticuloUI baja = new ParaBajaArticuloUI(gArticulo);
				setContentPane(baja);
				ParaPrincipalUI.this.revalidate();
			}
		});
		mntmArtiModif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaModificacionArticuloUI modificacion = new ParaModificacionArticuloUI(gArticulo);
				setContentPane(modificacion);
				ParaPrincipalUI.this.revalidate();
			}
		});
		mntmPedidoAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		mntmPedidoConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaConsultaPedidoUI consulta = new ParaConsultaPedidoUI(gPedido);
				setContentPane(consulta);
				ParaPrincipalUI.this.revalidate();

			}
		});

	}

}
