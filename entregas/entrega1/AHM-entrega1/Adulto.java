public class Adulto extends Persona{

	public String profesion;
	public String[] pasatiempos;

	public void setTamano(int x){
		pasatiempos = new String[x];
	}

	public void pagar(){
		System.out.println("Paga: "+comida.precio);
	}

	public void postre(){
		System.out.println("Postre: "+ Constants.postre);
	}

	
}