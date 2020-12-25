public class Nino extends Persona{

	public String superheroe;
	public String[] caricaturas;


	public void setTamano(int x){
		caricaturas = new String[x];
	}

	public void jugar(){
		System.out.println("Juega con "+ Constants.jugete);
	}
}