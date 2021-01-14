package domain;

public class Registro {

	private String nombre;
	private String nacimiento;
	private String rfc;
	private int domicilio;
	private int estado;
	private int banco;
	private String apellidos;
	private String sexo;
	private String calle;
	private String colonia;
	private String estadodireccion;
	private int postal;
	private int estadodomicilio;

	public Registro() {
		super();
	}

	public Registro(String nombre, String nacimiento, String rfc, int domicilio, int estado, int banco,
			String apellidos, String sexo, String calle, String colonia, String estadodireccion, int postal,
			int estadodomicilio) {
		super();
		this.nombre = nombre;
		this.nacimiento = nacimiento;
		this.rfc = rfc;
		this.domicilio = domicilio;
		this.estado = estado;
		this.banco = banco;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.calle = calle;
		this.colonia = colonia;
		this.estadodireccion = estadodireccion;
		this.postal = postal;
		this.estadodomicilio = estadodomicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public int getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(int domicilio) {
		this.domicilio = domicilio;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getBanco() {
		return banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getEstadodireccion() {
		return estadodireccion;
	}

	public void setEstadodireccion(String estadodireccion) {
		this.estadodireccion = estadodireccion;
	}

	public int getPostal() {
		return postal;
	}

	public void setPostal(int postal) {
		this.postal = postal;
	}

	public int getEstadodomicilio() {
		return estadodomicilio;
	}

	public void setEstadodomicilio(int estadodomicilio) {
		this.estadodomicilio = estadodomicilio;
	}

}
