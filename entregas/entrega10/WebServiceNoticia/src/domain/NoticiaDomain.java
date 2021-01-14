package domain;

import java.util.Calendar;
import java.util.Date;

public class NoticiaDomain {
	private int numero;
	private String titulo;
	private String descripcion;
	private Date fecha;

	public NoticiaDomain() {
		super();
	}

	public NoticiaDomain(int numero, String titulo, String descripcion, Date fecha) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "NoticiaDomain [numero=" + numero + ", titulo=" + titulo + ", descripcion=" + descripcion + ", fecha="
				+ fecha + "]";
	}

}
