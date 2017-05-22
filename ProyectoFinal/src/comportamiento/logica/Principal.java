package comportamiento.logica;

import java.awt.EventQueue;

import control.comportamiento.ParaPrincipalUI;

public class Principal {
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

}
