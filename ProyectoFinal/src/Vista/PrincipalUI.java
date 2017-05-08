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
	protected  JMenu mnCliente;
	private JMenu mnArticulo;
	private JMenuItem mntmArtiAlta;
	private JMenuItem mntmArtiConsulta;
	private JMenuItem mntmArtiBaja;
	private JMenuItem menuItem_3;

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
		
		mntmArtiBaja = new JMenuItem("Modificacion");
		mnArticulo.add(mntmArtiBaja);
		
		menuItem_3 = new JMenuItem("Baja");
		mnArticulo.add(menuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
