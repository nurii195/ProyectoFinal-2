package Vista;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

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


	public PrincipalUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);
		
		mntmAlta = new JMenuItem("Alta");
		mnCliente.add(mntmAlta);
		
		mntmConsult = new JMenuItem("Consulta");
		mnCliente.add(mntmConsult);
		
		mntmMo = new JMenuItem("Modificacion");
		mnCliente.add(mntmMo);
		
		mntmBaja = new JMenuItem("Baja");
		mnCliente.add(mntmBaja);

		
		mnArticulo = new JMenu("Articulo");
		menuBar.add(mnArticulo);
		
		mntmArtiAlta = new JMenuItem("Alta");
		mnArticulo.add(mntmArtiAlta);
		
		mntmArtiConsulta = new JMenuItem("Consulta");
		mnArticulo.add(mntmArtiConsulta);
		
		mntmArtiBaja = new JMenuItem("Baja");
		mnArticulo.add(mntmArtiBaja);
		
		mntmArtiModif = new JMenuItem("Modificacion");
		mnArticulo.add(mntmArtiModif);
		
		
		mnPedido = new JMenu("Pedidos");
		menuBar.add(mnPedido);
		
		mntmPedidoAlta = new JMenuItem("Alta");
		mnPedido.add(mntmPedidoAlta);
		
		mntmPedidoConsulta = new JMenuItem("Consulta");
		mnPedido.add(mntmPedidoConsulta);
		
		mntmPedidoBaja = new JMenuItem("Baja");
		mnPedido.add(mntmPedidoBaja);
		
		mntmPedidoModif = new JMenuItem("Modificacion");
		mnPedido.add(mntmPedidoModif);
		

	}

}
