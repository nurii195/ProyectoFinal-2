package control.comportamiento;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import comportamiento.logica.GestorArticulo;
import modelo.Articulo;
import vista.articulo.AltaArtiUI;

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
						JOptionPane.showMessageDialog(null, "Informacion incompleta, revise los campos");
					}

				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Precio numero separador numerico");
					// e1.printStackTrace();
				}

			}
		});
	}

}
