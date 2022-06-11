package dominio;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import excepciones.CadenaLargaExcepcion;
import excepciones.NumeroNegativoExcepcion;
import utilidad.*;

public class Curso{

	private int codigoCurso;
	private int cantHoras;
	private int cantMeses;
	private double costo;
	private String titulo;
	private LocalDate fechaInicio;

	//Constructor por defecto de la clase Curso, este inicializa las variables
	//miembro
	public Curso(){
		this.codigoCurso = -1;
		this.cantHoras = -1;
		this.cantMeses = -1;
		this.costo = -1;
		this.titulo = "";
		this.fechaInicio = null;
	}

	public Curso(int cantHoras, int cantMeses, double costo, String titulo, LocalDate fechaInicio){
		this.codigoCurso = Integer.parseInt(Generador.genNumberPassword());
		this.cantHoras = cantHoras;
		this.cantMeses = cantMeses;
		this.costo = costo;
		this.titulo = titulo;
		this.fechaInicio = fechaInicio;
	}

	public Curso(int codigoCurso, int cantHoras, int cantMeses, double costo, String titulo, LocalDate fechaInicio){
		this.codigoCurso = codigoCurso;
		this.cantHoras = cantHoras;
		this.cantMeses = cantMeses;
		this.costo = costo;
		this.titulo = titulo;
		this.fechaInicio = fechaInicio;
	}

	public void setCodigoCurso(int codigoCurso) throws NumeroNegativoExcepcion{
		if (codigoCurso < 0) {
			throw new NumeroNegativoExcepcion();
		}
		this.codigoCurso = codigoCurso;
	}

	public int getCodigoCurso(){
		return codigoCurso;
	}

	public void setCantHoras(int cantHoras) throws NumeroNegativoExcepcion{
		if (cantHoras < 0) {
			throw new NumeroNegativoExcepcion();
		}
		this.cantHoras = cantHoras;
	}

	public int getCantHoras(){
		return cantHoras;
	}

	public void setCantMeses(int cantMeses) throws NumeroNegativoExcepcion{
		if (cantMeses < 0) {
			throw new NumeroNegativoExcepcion();
		}
		this.cantMeses = cantMeses;
	}

	public int getCantMeses(){
		return cantMeses;
	}

	public void setCosto(double costo) throws NumeroNegativoExcepcion{
		if (costo < 0) {
			throw new NumeroNegativoExcepcion();
		}
		this.costo = costo;
	}

	public double getCosto(){
		return costo;
	}

	public void setTitulo(String titulo) throws CadenaLargaExcepcion{
		if (titulo.length() > 30) {
			throw new CadenaLargaExcepcion();
		}
		this.titulo = titulo.trim();
	}

	public String getTitulo(){
		return titulo;
	}

	public void setFechaInicio(LocalDate fechaInicio) throws NumeroNegativoExcepcion{
		if (fechaInicio.getDayOfMonth() < 0) {
			throw new NumeroNegativoExcepcion();
		} else if (fechaInicio.getMonthValue() < 0) {
			throw new NumeroNegativoExcepcion();
		} else if (fechaInicio.getYear() < 0) {
			throw new NumeroNegativoExcepcion();
		}
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaInicio(){
		return fechaInicio;
	}

	public void cargarDatosCurso(){
		cargarCodigoCurso();
		cargarCantHoras();
		cargarCantMeses();
		cargarCosto();
		cargarTitulo();
		cargarFechaInicio();
	}

	private void cargarCodigoCurso(){
		boolean flag = false;
		while (!flag) {
			try {
				int codAux = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo de Curso:"));
				setCodigoCurso(codAux);
				flag = true;
			} catch (NumberFormatException | NumeroNegativoExcepcion e) {
				JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
			}
		}
	}

	private void cargarCantHoras(){
		boolean flag = false;
		while (!flag) {
			try {
				int horAux = Integer.parseInt(JOptionPane.showInputDialog(null, "Horas Totales:"));
				setCantHoras(horAux);
				flag = true;
			} catch (NumberFormatException | NumeroNegativoExcepcion e) {
				JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
			}
		}
	}

	private void cargarCantMeses(){
		boolean flag = false;
		while (!flag) {
			try {
				int mesAux = Integer.parseInt(JOptionPane.showInputDialog(null, "Duracion en meses:"));
				setCantMeses(mesAux);
				flag = true;
			} catch (NumberFormatException | NumeroNegativoExcepcion e) {
				JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
			}
		}
	}

	private void cargarCosto(){
		boolean flag = false;
		while (!flag) {
			try {
				double cosAux = Double.parseDouble(JOptionPane.showInputDialog(null, "Costo:"));
				setCosto(cosAux);
				flag = true;
			} catch (NumberFormatException | NumeroNegativoExcepcion e) {
				JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
			}
		}
	}

	private void cargarTitulo(){
		boolean flag = false;
		while (!flag) {
			try {
				String titAux = JOptionPane.showInputDialog(null, "Titulo:");
				setTitulo(titAux);
				flag = true;
			} catch (CadenaLargaExcepcion e) {
				JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
			}
		}
	}

	private void cargarFechaInicio(){
		boolean flag = false;
		while (!flag) {
			try {
				int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Dia:"));
				int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Mes:"));
				int año = Integer.parseInt(JOptionPane.showInputDialog(null, "Año:"));
				LocalDate fecAux = LocalDate.of(año, mes, dia);
				setFechaInicio(fecAux);
				flag = true;
			} catch (NullPointerException | NumberFormatException | NumeroNegativoExcepcion e) {
				JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
			}
		}
	}

	public void mostrarDatosPantalla(){
		JOptionPane.showMessageDialog(null, toString());
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Curso:").append(titulo).append("\tCodigo:").append(codigoCurso).append("\n");
		sb.append("Duracion:").append(cantMeses).append(" meses").append("\n");
		sb.append("Carga Horaria:").append(cantHoras).append("\n");
		sb.append("Costo:").append(costo).append("\n");
		sb.append("Fecha Inicio:").append(fechaInicio.toString()).append("\n");
		return sb.toString();
	}

}
