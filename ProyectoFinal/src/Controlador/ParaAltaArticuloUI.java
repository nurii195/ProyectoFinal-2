package Controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Articulo;
import Vista.AltaArtiUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ParaAltaArticuloUI extends AltaArtiUI {
	GestorArticulo gestorArticulo;

	public ParaAltaArticuloUI(GestorArticulo gArticulo) {
		super();
		this.gestorArticulo = gArticulo;

		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Float precioConvertido = Float.valueOf(textPrecioArticulo.getText());
					String nombre = txtNombreArticulo.getText();
					String descripcion = textDescripcionArticulo.getText();
					
					if (!nombre.isEmpty() && precioConvertido > 0) {
						Articulo articulo = new Articulo();
						articulo.setNombreArticulo(nombre);
						articulo.setPrecio(precioConvertido);
						articulo.setDescripcion(descripcion);
			
						boolean alta = gestorArticulo.alta(articulo);
						if (alta) {
							textIdArticulo.setText(String.valueOf(articulo.getIdArticulo()));
							JOptionPane.showMessageDialog(null, "Articulo dado de alta correctamente");
						}else {
							JOptionPane.showMessageDialog(null, "Artculo no se ha dado de alta correctamente");
						}

					} else {
						JOptionPane.showMessageDialog(null, "Revise los campos algo falla");
					}

				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "El precio tiene que ir formato numero");
					// e1.printStackTrace();
				}

			}
		});
	}

}
