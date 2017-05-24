package vista.principal;
import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Frame;
import java.awt.Dialog.ModalExclusionType;

public class PrincipalUI extends JFrame {

	protected JPanel contentPane;
	protected JMenuItem mntmConsult;
	protected JMenuItem mntmMo;
	protected JMenuItem mntmBaja;
	protected JMenuItem mntmAlta;
	protected JMenu mnCliente;
	protected JMenu mnArticulo;
	protected JMenuItem mntmArtiAlta;
	protected JMenuItem mntmArtiConsulta;
	protected JMenuItem mntmArtiBaja;
	protected JMenuItem mntmArtiModif;
	protected JMenu mnPedido;
	protected JMenuItem mntmPedidoAlta;
	protected JMenuItem mntmPedidoConsulta;
	protected JMenuItem mntmPedidoBaja;
	protected JMenuItem mntmPedidoModif;
	
	  ImageIcon iconoAnadir = new ImageIcon("iconoAñadir.jpg");
	  ImageIcon iconoLupa = new ImageIcon("lupa.jpg");
	  ImageIcon iconoModif= new ImageIcon("modificar.gif");
	  ImageIcon iconoBorrar = new ImageIcon("borrar.jpg");
	  ImageIcon iconoCarrito = new ImageIcon("carrito.jpg");
	  


	public PrincipalUI() {
		rellenoDePanel();
			
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		
		mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);

		mntmAlta = new JMenuItem("Alta");
		mnCliente.add(mntmAlta);
		mntmAlta.setIcon(iconoAnadir);

		mntmConsult = new JMenuItem("Consulta");
		mnCliente.add(mntmConsult);
		mntmConsult.setIcon(iconoLupa);
		
		mntmMo = new JMenuItem("Modificacion");
		mnCliente.add(mntmMo);
		mntmMo.setIcon(iconoModif);
		
		mntmBaja = new JMenuItem("Baja");
		mnCliente.add(mntmBaja);
		mntmBaja.setIcon(iconoBorrar);
		
		
		mnArticulo = new JMenu("Articulo");
		menuBar.add(mnArticulo);
		
		mntmArtiAlta = new JMenuItem("Alta");
		mnArticulo.add(mntmArtiAlta);
		mntmArtiAlta.setIcon(iconoAnadir);
		
		mntmArtiConsulta = new JMenuItem("Consulta");
		mnArticulo.add(mntmArtiConsulta);
		mntmArtiConsulta.setIcon(iconoLupa);
		
		mntmArtiModif = new JMenuItem("Modificacion");
		mnArticulo.add(mntmArtiModif);
		mntmArtiModif.setIcon(iconoModif);
		
		mntmArtiBaja = new JMenuItem("Baja");
		mnArticulo.add(mntmArtiBaja);
		mntmArtiBaja.setIcon(iconoBorrar);
		
		
		mnPedido = new JMenu("Pedidos");
		menuBar.add(mnPedido);
		
		mntmPedidoAlta = new JMenuItem("Alta");
		mnPedido.add(mntmPedidoAlta);
		mntmPedidoAlta.setIcon(iconoAnadir);
		
		mntmPedidoConsulta = new JMenuItem("Consulta");
		mnPedido.add(mntmPedidoConsulta);
		mntmPedidoConsulta.setIcon(iconoLupa);
		
		mntmPedidoModif = new JMenuItem("Modificacion");
		mnPedido.add(mntmPedidoModif);
		mntmPedidoModif.setIcon(iconoModif);
		
		mntmPedidoBaja = new JMenuItem("Baja");
		mnPedido.add(mntmPedidoBaja);
		mntmPedidoBaja.setIcon(iconoBorrar);
		

	}



	private void rellenoDePanel() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(128, 0, 128));
		setFont(new Font("Andalus", Font.PLAIN, 12));
		setTitle("El armario de Alicia\u202A");
		setIconImage(Toolkit.getDefaultToolkit().getImage("clothes-hanger.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanelBackground p = new JPanelBackground();
		p.setBackground("logotipo.jpg");
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		p.setLayout(new BorderLayout(0, 0));
		setContentPane(p);
	}

}
