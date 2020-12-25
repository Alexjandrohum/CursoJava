import java.util.*;
import java.util.ArrayList;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static Logistica logistica;
    static PanDulce panDulce;
    static PanMuerto panMuerto;

    public static void main(String args[]){
        LeerArchivo lectura = new LeerArchivo();
     
        lectura.lectura();
       ArrayList<Ingredientes> ingredientes = lectura.retornarIngredientes();
       panDulce = new PanDulce();
       panMuerto = new PanMuerto();

       System.out.println("************ BIENVENIDO A TU PANADERIA *******************");
        System.out.println("Elige una opcion: \n1. Pan de Dulce \n2. Pan de Muertos");
        int tipoPan = sc.nextInt();

        switch(tipoPan){
            case 1:
            System.out.println("Ingresa la cantidad de pan de burro que desea: ");
            int cantidadBurro = sc.nextInt();
            try{
                logistica = new Logistica(ingredientes, cantidadBurro, panDulce, tipoPan);
            }catch(PanException e){
                e.printStackTrace();
                System.out.println(e);
            }
            break;
            case 2:
            System.out.println("Ingresa la cantidad de pan de Muerto que desea: ");
            int cantidadMuerto = sc.nextInt();
            try{
                logistica = new Logistica(ingredientes, cantidadMuerto, panMuerto, tipoPan);
            }catch(PanException e){
                e.printStackTrace();
                System.out.println(e);
            }
            break;
            default:
            System.out.println("Opcion incorrecta");
        }
        
    }
}