package domain;

public class Direccion {
	
	private int finumero;
	private String fccalle;
	private String fccolonia;
	private String fcestado;
	private int ficodigopostal;
	private int fiestadodomicilio;
	public Direccion() {
		super();
	}
	public Direccion(int finumero, String fccalle, String fccolonia, String fcestado, int ficodigopostal,
			int fiestadodomicilio) {
		super();
		this.finumero = finumero;
		this.fccalle = fccalle;
		this.fccolonia = fccolonia;
		this.fcestado = fcestado;
		this.ficodigopostal = ficodigopostal;
		this.fiestadodomicilio = fiestadodomicilio;
	}
	public int getFinumero() {
		return finumero;
	}
	public void setFinumero(int finumero) {
		this.finumero = finumero;
	}
	public String getFccalle() {
		return fccalle;
	}
	public void setFccalle(String fccalle) {
		this.fccalle = fccalle;
	}
	public String getFccolonia() {
		return fccolonia;
	}
	public void setFccolonia(String fccolonia) {
		this.fccolonia = fccolonia;
	}
	public String getFcestado() {
		return fcestado;
	}
	public void setFcestado(String fcestado) {
		this.fcestado = fcestado;
	}
	public int getFicodigopostal() {
		return ficodigopostal;
	}
	public void setFicodigopostal(int ficodigopostal) {
		this.ficodigopostal = ficodigopostal;
	}
	public int getFiestadodomicilio() {
		return fiestadodomicilio;
	}
	public void setFiestadodomicilio(int fiestadodomicilio) {
		this.fiestadodomicilio = fiestadodomicilio;
	}
	@Override
	public String toString() {
		return "Direccion [finumero=" + finumero + ", fccalle=" + fccalle + ", fccolonia=" + fccolonia + ", fcestado="
				+ fcestado + ", ficodigopostal=" + ficodigopostal + ", fiestadodomicilio=" + fiestadodomicilio + "]";
	}
	
	

}
