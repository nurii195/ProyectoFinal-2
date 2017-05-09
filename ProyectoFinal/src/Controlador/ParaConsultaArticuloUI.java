package Controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Articulo;
import Vista.ConsultaArtiUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ParaConsultaArticuloUI extends ConsultaArtiUI {


	public ParaConsultaArticuloUI(GestorArticulo gArticulo) {
		super();
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GestorArticulo consulta = new GestorArticulo();
				Object articulo=consulta.consulta(textNombreConsultar.getText());
				if (articulo!=null) {
					textCampoRespuesta.setText("Articulo dado de alta");
				}else {
					textCampoRespuesta.setText("El articulo no existe");
				}
			}
		});
	}

}
