package app;

import javax.swing.JOptionPane;
import dominio.*;

public class App {

	public static void main(String[] args) {

		int p = 0;

		do {
			Curso cur = new Curso();
			cur.cargarDatosCurso();
			cur.mostrarDatosPantalla();

			p = JOptionPane.showConfirmDialog(null, "¿Continuar ingresando datos?", "Confirmacion",
					JOptionPane.YES_NO_OPTION);

			if (p == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Se continuara con la carga de datos");
			} else if (p == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Se cancela la carga de datos");
			}
		} while (p == JOptionPane.YES_OPTION);

	}

}