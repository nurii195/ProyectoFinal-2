package Controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Articulo;
import Vista.AltaArtiUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ParaAltaArticuloUI extends AltaArtiUI {

	public ParaAltaArticuloUI(GestorArticulo gArticulo) {
		super();
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestorArticulo alta = new GestorArticulo();
				Float precioConvertido = Float.valueOf(textPrecioArticulo.getText());
				Articulo articulo = new Articulo(txtNombreArticulo.getText(), precioConvertido, textDescripcionArticulo.getText());
				alta.alta(articulo);
				
			}
		});
	}

}
