import java.util.ArrayList;

public class ProgramaEjecucion{

    Fecha[] arregloFechas;
    FechaFormato[] arregloFecchaFormato;
    Archivo archivo;
    LeerFechas lectura;
    ArrayList<String> cadenas;
    FechaFormato fechaFormato;
    Fecha fechaOriginal;


    public ProgramaEjecucion(){
        archivo = new Archivo();
        lectura = new LeerFechas();
        cadenas =  new ArrayList<String>();
        System.out.println("*********** NORMALES ***********");
        initArreglo();
        System.out.println("*********** CON FORMATO ***********");
        createFormat();
        archivo.saveArreglo(arregloFecchaFormato);
        cadenas = lectura.getCadena();
        lectura.delimitar(cadenas);
        cadenas = lectura.retornarFechas();
    }

    private void initArreglo(){
        arregloFechas = new Fecha[10];
        arregloFecchaFormato = new FechaFormato[10];
        arregloFechas[0] = new Fecha(1,12,1997);
        arregloFechas[1] = new Fecha(2,1,2020);
        arregloFechas[2] = new Fecha(3,1,1934);
        arregloFechas[3] = new Fecha(4,2,1997);
        arregloFechas[4] = new Fecha(5,3,2017);
        arregloFechas[5] = new Fecha(6,4,1997);
        arregloFechas[6] = new Fecha(7,6,1989);
        arregloFechas[7] = new Fecha(8,7,1999);
        arregloFechas[8] = new Fecha(19,11,1967);
        arregloFechas[9] = new Fecha(13,12,1912);
        for(int i = 0; i < arregloFechas.length; i++){
            fechaOriginal = arregloFechas[i];
            System.out.println("Fecha normal: "+fechaOriginal.dia + " "+fechaOriginal.mes + " " + fechaOriginal.anio);
        }
    }

    public void createFormat(){
        Fecha date;
        FechaFormato formatoFecha;
        int i;
        for(i = 0; i< arregloFechas.length; i++){
            date = arregloFechas[i];
            String diaFormat = diaFormato(date.dia);
            String mesFormt = mesFormat(date.mes);
            arregloFecchaFormato[i] = new FechaFormato(diaFormat,mesFormt, date.anio);
            formatoFecha = arregloFecchaFormato[i];
            System.out.println("Fecha formato: "+formatoFecha.dia + " "+formatoFecha.mes + " "+formatoFecha.anio);

        }

        
    }

    public String diaFormato(int dia){
        String d = "";
        switch(dia){
            case 1:
            return d = dia+"ro";
            case 2:
            return d = dia+"do";
            case 3:
            return d = dia+"ro";
            case 4:
            return d = dia+"to";
            case 5:
            return d = dia+"to";
            case 6:
            return d = dia+"to";
            case 7:
            return d = dia+"mo";
            case 8:
            return d = dia+"vo";
            case 9:
            return d = dia+"vo";
            case 10:
            return d = dia+"mo";
            case 11:
            return d = dia+"vo";
            case 12:
            return d = dia+"vo";
            case 13:
            return d = dia+"vo";
            case 14:
            return d = dia+"vo";
            case 15:
            return d = dia+"vo";
            case 16:
            return d = dia+"vo";
            case 17:
            return d = dia+"vo";
            case 18:
            return d = dia+"vo";
            case 19:
            return d = dia+"vo";
            case 20:
            return d = dia+"vo";
            case 21:
            return d = dia+"vo";
            case 22:
            return d = dia+"vo";
            case 23:
            return d = dia+"vo";
            case 24:
            return d = dia+"vo";
            case 25:
            return d = dia+"vo";
            case 26:
            return d = dia+"vo";
            case 27:
            return d = dia+"vo";
            case 28:
            return d = dia+"vo";
            case 29:
            return d = dia+"vo";
            case 30:
            return d = dia+"vo";
            case 31:
            return d = dia+"vo";

        }
        return d;
    }



    public String mesFormat(int mes){
        String d = "";
        switch(mes){
            case 1:
            return d = "Enero";
            case 2:
            return d = "Febrero";
            case 3:
            return d = "Marzo";
            case 4:
            return d = "Abril";
            case 5:
            return d = "Mayo";
            case 6:
            return d = "Junio";
            case 7:
            return d = "Julio";
            case 8:
            return d = "Agosto";
            case 9:
            return d = "Septiembre";
            case 10:
            return d = "Octubre";
            case 11:
            return d = "Noviembre";
            case 12:
            return d = "Diciembre";

        }
        return d;
    }

}