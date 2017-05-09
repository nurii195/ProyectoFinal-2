package Controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Articulo;
import Vista.AltaArticuloUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ParaAltaArticuloUI extends AltaArticuloUI {


	public ParaAltaArticuloUI(GestorArticulo gArticulo) {
		super();
		btnGuardarAltaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestorArticulo alta = new GestorArticulo();
				Float precioConvertido = Float.valueOf(txtPrecioarticulo.getText());
				Articulo articulo = new Articulo(txtNombreArticulo.getText(), precioConvertido, txtDescripcionArticulo.getText());
				alta.alta(articulo);
				
			}
		});
	}

}
