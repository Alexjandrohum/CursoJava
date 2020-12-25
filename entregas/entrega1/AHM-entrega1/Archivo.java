import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo{
	private Adulto adulto;
	private Nino nino;

	public void  datoAdulto(Adulto adulto){
		this.adulto = adulto;
		aniadirArchivo();
	}
	public void datoNino(Nino nino){
		this.nino = nino;
		aniadirArchivo();
	}

	public void aniadirArchivo() {
		FileWriter flwriter = null;
		try {
			flwriter = new FileWriter("archivo/clientes.txt", true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			
				if(adulto != null){
					bfwriter.write(adulto.nombre + "," + adulto.edad + ", "+adulto.profesion);
					for(int i = 0; i < adulto.pasatiempos.length; ++i){
						bfwriter.write(", "+adulto.pasatiempos[i]);
					}
					bfwriter.write("\n");
				}

				if(nino != null){
					bfwriter.write(nino.nombre + "," + nino.edad + ", "+nino.superheroe);
					for(int i = 0; i < nino.caricaturas.length; ++i){
						bfwriter.write(", "+nino.caricaturas[i]);
					}
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