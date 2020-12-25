import java.util.ArrayList;

public class Logistica{

    ArrayList<Ingredientes> ingredientes;
    int cantidadPan;
    int cantidadHarina;
    int cantidadMasa;
    int cantidadAceite;
    PanDulce panDulce;
    PanMuerto panMuerto;
    Object object;
    int ingredienteArina;
    int ingredientePan;
    int ingredienteAceite;
    int tipoPan;

    public Logistica(ArrayList<Ingredientes> ingredientes, int cantidad, Object object, int tipoPan)throws PanException{
        this.ingredientes = ingredientes;
        this.cantidadPan = cantidad;
        this.object = object;
        this.tipoPan = tipoPan;
        validarTipoPan();
        validarPedido();
    }

    void validarTipoPan(){
        if(tipoPan == 1){
            panDulce = (PanDulce) object;
            ingredienteArina = panDulce.harina;
            ingredientePan = panDulce.masa;
            ingredienteAceite = panDulce.aceite;
        }else{
            panMuerto = (PanMuerto) object;
            ingredienteArina = panMuerto.harina;
            ingredientePan = panMuerto.masa;
            ingredienteAceite = panMuerto.aceite;
        }
    }

    void validarPedido() throws PanException{

        for(Ingredientes ingrediente : ingredientes){
            cantidadHarina = ingredientes.get(0).cantidad;
            cantidadMasa = ingredientes.get(1).cantidad;
            cantidadAceite = ingredientes.get(2).cantidad;
        }
 
        int contador = 1;
        int countArina = 0;
        int countPan = 0;
        int countAceite = 0;
        while(cantidadPan >= contador){
            if((cantidadHarina < countArina) || (cantidadMasa < countPan) || (cantidadMasa < countAceite)){
                throw new PanException("Se termino algun ingrediente");
            }
            System.out.println("No. de pan horneado: "+contador);
            contador++;
            countArina = countArina + ingredienteArina;
            countPan = countPan + ingredientePan;
            countAceite = countAceite +ingredienteAceite;
        }

    }

}