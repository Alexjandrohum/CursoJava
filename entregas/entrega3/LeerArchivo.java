import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo{

    public ArrayList<Ingredientes> ingredientes;

    public ArrayList<String> getCadena(){
        String line = "";
        ArrayList<String> valores = new ArrayList<>();
        try {
            Scanner input = new Scanner(new File(Constant.rutaArchivo));
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

    public void lectura(){
        ArrayList<String> elementos = new ArrayList<String>();
       BufferedReader objReader = null;
            try {
            String strCurrentLine;
            objReader = new BufferedReader(new FileReader(Constant.rutaArchivo));

            while ((strCurrentLine = objReader.readLine()) != null) {
                elementos.add(strCurrentLine);
            }

            delimitar(elementos);

            } catch (IOException e) {

            e.printStackTrace();

            } finally {

            try {
                if (objReader != null)
                objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            }
    }

    public void delimitar(ArrayList<String> elementos){
        int totalelementos  = elementos.size() * 2;
        ingredientes = new ArrayList<Ingredientes>();
        String[] parejas;

        for(int i = 0; i< elementos.size(); i++){
            String oracion = elementos.get(i);
            parejas = oracion.split(" ");
            String nombre = parejas[0];
            String cantidad = parejas[1];
            int precioConversion = Integer.valueOf(cantidad);
            ingredientes.add(new Ingredientes(nombre, precioConversion));
        }

    }

    public ArrayList<Ingredientes> retornarIngredientes(){
        return ingredientes;
    }

}