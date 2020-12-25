import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFechas{
 
    public FechaFormato[] fechas;
    ArrayList<String> cadenasFechas = new ArrayList<String>();

    public ArrayList<String> getCadena(){
        String line = "";
        ArrayList<String> valores = new ArrayList<>();
        try {
            Scanner input = new Scanner(new File("fechas.txt"));
            while (input.hasNextLine()) {
                line =  input.nextLine();
                valores.add(line);
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return valores;
    }

    public void delimitar(ArrayList<String> elementos){
        fechas = new FechaFormato[10];
        String datos[];
        for(int i = 0; i< elementos.size(); i++){
            String oracion = elementos.get(i);
            datos = oracion.split("-");
        }
    }


    public ArrayList<String> retornarFechas(){
        return cadenasFechas;
    }

    
    
}