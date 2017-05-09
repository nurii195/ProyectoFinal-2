package Controlador;
import java.awt.EventQueue;
import Vista.PrincipalUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ParaPrincipalUI extends PrincipalUI {
	
	private GestorCliente gCliente=new GestorCliente();
	private GestorArticulo gArticulo = new GestorArticulo();
	

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
		mntmConsult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaConsultaClienteUI consulta=new ParaConsultaClienteUI(gCliente);
				setContentPane(consulta);
				ParaPrincipalUI.this.revalidate();
			}
		});
		mntmAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaAltaClienteUI alta= new ParaAltaClienteUI(gCliente);
				setContentPane(alta);
				ParaPrincipalUI.this.revalidate();
				
			}
		});
		mntmArtiAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaAltaArticuloUI  alta = new ParaAltaArticuloUI(gArticulo);
				setContentPane(alta);
				ParaPrincipalUI.this.revalidate();
			}
		});
		
		
	}

}
