import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo{

	private FechaFormato[] fechas;
	private FechaFormato objectFecha;


	public void saveArreglo(FechaFormato[] fechas){
		this.fechas = fechas;
		aniadirArchivo();
	}

	public void aniadirArchivo() {
		FileWriter flwriter = null;
		try {
			flwriter = new FileWriter("fechas.txt", true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			
					for(int i = 0; i < fechas.length; ++i){
						objectFecha = fechas[i];
						bfwriter.write("-");
						bfwriter.write(objectFecha.dia + " " + objectFecha.mes + " " +objectFecha.anio);
						bfwriter.write("\n");
					}

			bfwriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
			}
		}
	}

}