import java.util.Scanner;

public class Main{
	private static Persona persona;
	private static Adulto adulto;
	private static Scanner teclado = new Scanner(System.in);
	private static Nino nino;

	public static void main(String args[]){

		
		Mensajes.getTipo();
		int tipo = Integer.parseInt(teclado.nextLine());
		Archivo registro = new Archivo();

		Mensajes.getBienvenida();
		int opcion;
		int cantidad;
		switch(tipo){
			case Constants.adulto:
				persona = new Adulto();
				adulto = (Adulto)persona;
				getInfoPersona();
				Mensajes.getProfesion();
				adulto.profesion = teclado.nextLine();
				Mensajes.getHobies(Constants.pasatiempo);
				cantidad = Integer.parseInt(teclado.nextLine());
				adulto.setTamano(cantidad);
				llenarHobies(cantidad,1);
				registro.datoAdulto(adulto);
				Mensajes.getMenuAdulto();
				opcion = Integer.parseInt(teclado.nextLine());			
				menuComidaAdulto(opcion);
				
				break;
			case Constants.nino:
				persona = new Nino();	
				getInfoPersona();
				nino = (Nino)persona;
				Mensajes.getSuperheroe();
				nino.superheroe = teclado.nextLine();
				Mensajes.getHobies(Constants.caricaturas);
				cantidad = Integer.parseInt(teclado.nextLine());
				nino.setTamano(cantidad);
				llenarHobies(cantidad,2);
				registro.datoNino(nino);
				Mensajes.getMenuNino();
				opcion = Integer.parseInt(teclado.nextLine());			
				menuComidaNino(opcion);
				break;
			default:
				Mensajes.getDefault();
		
		}
		
	}
	public static void menuComidaNino(int opcion){
		switch(opcion){
			case Constants.hamburgesa:
			Comida comida = new Comida(Constants.hamburguesaName, Constants.hamburgesaPrecio);
				Mensajes.getTipoHamburgesa();
				comida.detalle = teclado.nextLine();
				persona.comida = comida;
				Mensajes.getTituloTicket();
				nino.jugar();
				nino.comer();
				break;
			case Constants.pizza:
				comida = new Comida(Constants.pizzaName, Constants.pizzaPrecio);
				Mensajes.getConbinacionPizza();
				comida.detalle = teclado.nextLine();
				persona.comida = comida;
				Mensajes.getTituloTicket();
				nino.jugar();
				nino.comer();
				break;
			case Constants.papas:
				comida = new Comida(Constants.papasName, Constants.papasPrecio);
				Mensajes.getPapas();
				comida.detalle = teclado.nextLine();
				persona.comida = comida;
				Mensajes.getTituloTicket();
				nino.jugar();
				nino.comer();
				break;
			default:
				Mensajes.getDefault();
		}
	}

	public static void menuComidaAdulto(int opcion){
				switch(opcion){
					case Constants.arroz:
						Comida comida = new Comida(Constants.arrozName, Constants.arrozPrecio);
						Mensajes.getColorArroz();
						comida.detalle = teclado.nextLine();
						persona.comida = comida;
						Mensajes.getTituloTicket();
						adulto.pagar();
						adulto.comer();
						adulto.postre();
					break;
					case Constants.pollo:
						comida = new Comida(Constants.polloName, Constants.polloPrecio);
						Mensajes.getPiezasPollo();
						comida.detalle = teclado.nextLine();
						persona.comida = comida;
						Mensajes.getTituloTicket();
						adulto.pagar();
						adulto.comer();
						adulto.postre();
					break;
					case Constants.milaneza:
						comida = new Comida(Constants.milanesaName, Constants.milanezaPrecio);
						Mensajes.getStatusMilaneza();
						comida.detalle = teclado.nextLine();
						persona.comida = comida;
						Mensajes.getTituloTicket();
						adulto.pagar();
						adulto.comer();
						adulto.postre();
					break;
					default:
						Mensajes.getDefault();
				
				}
	}

	public static void getInfoPersona(){
		Mensajes.getNombre();
		persona.nombre = teclado.nextLine();
		Mensajes.getEdad();
		persona.edad = Integer.parseInt(teclado.nextLine());
	}

	
	public static void llenarHobies(int limite, int tipo){
		if(tipo == 1){
			for(int i = 0; i < limite; i++){
            	Mensajes.getDato(i+1);
				adulto.pasatiempos[i] = teclado.nextLine();
        	}
		}else{
			for(int i = 0; i < limite; ++i){
				Mensajes.getDato(i+1);
				nino.caricaturas[i] = teclado.nextLine();
			}
		}
        
    }

}