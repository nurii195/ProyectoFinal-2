package comportamiento.articulo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import comportamiento.logica.GestorArticulo;
import modelo.Articulo;
import vista.articulo.ConsultaArtiUI;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ParaConsultaArticuloUI extends ConsultaArtiUI {

	GestorArticulo gestorArticulo;

	public ParaConsultaArticuloUI(GestorArticulo gArticulo) {
		super();

		this.gestorArticulo = gArticulo;

		textPrecioConsulta.setEnabled(false);

		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String campoNombre = textNombreConsultar.getText();
				Object articulo = gArticulo.consulta(campoNombre);
				Articulo articuloUno = (Articulo) articulo;
				if (!campoNombre.isEmpty() && articulo != null) {
					textPrecioConsulta.setText(String.valueOf(articuloUno.getPrecio()));
					textIdArticulo.setText(String.valueOf(articuloUno.getIdArticulo()));
					textCampoRespuestaDescripcion.setText(articuloUno.getDescripcion());
					textRespuesta.setText("El articulo ya existe");

				} else {
					textRespuesta.setText("El articulo no existe");
				}

			}
		});
	}

}
