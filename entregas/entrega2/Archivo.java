import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo{
    private String figura;

    public  void mandarFigura(String figura){
        this.figura = figura;
        agregarfigura();
    }

    public void agregarfigura() {
		FileWriter flwriter = null;
        
		try {
			flwriter = new FileWriter("archivo/figura.txt", true);
            
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			if(figura != ""){
                bfwriter.write(figura + "\n");
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