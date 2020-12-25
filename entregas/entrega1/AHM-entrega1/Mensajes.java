import java.util.Scanner;
public  class Mensajes{
    public static void getBienvenida(){
        System.out.println("********* BIENVENIDO A SU RESTAURANTE *************+");
        
    }
    public static void getTipo(){
        System.out.println("¿Eres Adulto o Niño? \n 1. Adulto \n 2. Niño");
    }

    public static void getDefault(){
        System.out.println("Opción incorrecta");
    }

    public static void getNombre(){
        System.out.println("Ingresa tu nombre: ");
    }
    public static void getEdad(){
        System.out.println("Ingresa tu edad: ");
    }

    public static void getSuperheroe(){
        System.out.println("Ingresa tu Superheroe: ");
    }
    public static void getHobies(String dato){
        System.out.println("Ingresa el número de "+dato+" favoritas: ");
    }

    public static void getDato(int contador){
        System.out.println("Dato "+contador+ ":");
    }

    public static void getProfesion(){
        System.out.println("Ingresa el nombre de tu profesion: ");
    }


    public static void getPasatiempo(){
        System.out.println("Ingresa el nombre de tu pasatiempo ");
    }

    public static void getColorArroz(){
        System.out.println("Ingresa el color del arroz: ");
    }

    public static void getPiezasPollo(){
        System.out.println("Tipo de pieza: ");
    }

    public static void getStatusMilaneza(){
        System.out.println("Termino de cocimiento: ");
    }

    public static void getTipoHamburgesa(){
        System.out.println("Tipo de hamburgesa: ");
    }
    
    public static void getConbinacionPizza(){
        System.out.println("Convinación de la pizza: ");
    }

    public static void getPapas(){
        System.out.println("Forma de las papas: ");
    }

    public static void getTituloTicket(){
        System.out.println("*********TICKET******** ");
    }

    public static void setTicketNino(String jugete, String comida){
        System.out.println(" ******** Ticket Niño ************ \nEsta jugando con el: "+ jugete +"\nEstá comiendo: "+ comida);

    }

    public static void getMenuAdulto(){
        System.out.println(" ******** Menu de comidas ************");
        System.out.println("1. Arroz \n2. Pollo \n3. Milaneza");
        System.out.println("Eleige una opción: ");
    }

    public static void getMenuNino(){
        System.out.println(" ******** Menu de comidas ************");
        System.out.println("1. Hamburgesa \n2. Pizza \n3. Papas");
        System.out.println("Eleige una opción: ");
    }

}