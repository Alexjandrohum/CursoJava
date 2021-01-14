package spring.domain;

public class Semanas {

	private int id;
	private String nombre;

	public Semanas() {
		super();
	}

	public Semanas(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Semanas [id=" + id + ", nombre=" + nombre + "]";
	}

}
