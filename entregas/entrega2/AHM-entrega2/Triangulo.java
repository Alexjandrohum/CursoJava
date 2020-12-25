public class Triangulo implements Funcionalidades{
    public int alto;
    public int ancho;

    public double getArea(int a, int b){
        double operacion = (a * b)/2;
        return operacion;
    }

    public String getRotar(int val){
        String triangulo = "";
       int numFilas = val;
        System.out.println();
        triangulo = triangulo + "\n";
        for(int numBlancos = 0, numAsteriscos = (numFilas*2)-1; numAsteriscos>0; numBlancos++, numAsteriscos -= 2){

            for(int i=0; i < numBlancos; i++){
                System.out.print(" ");
                triangulo = triangulo + " ";
            }
             
            int aux=numFilas*2-1;
            for(int j=numAsteriscos; j > 0; j--){
            	if ((aux%2)==1) {
            		if ((j%2)==0) {
            			System.out.print(" ");
                        triangulo = triangulo + " ";	
            			
            		}else{
            			if (j==numAsteriscos||numAsteriscos==aux||j==1) {
            			System.out.print("*");
                        triangulo = triangulo + "*";					
            			}else{
            			System.out.print(" ");	
                        triangulo = triangulo + " ";
            			}
            		}
            	}
            }
            System.out.println();
            triangulo = triangulo + "\n";
        }
        return triangulo;
    }

    public String dibujar(int a){

        String triangulo = "";
		 int n=a;
        final char simbolo = '*';
        for (int i = 0; i < n; ++i) {
            System.out.println();
            triangulo = triangulo + "\n";
            for (int j = 0; j < n-i-1; ++j) {                      
                System.out.print(" ");   
                triangulo = triangulo + " ";        
            }
            for (int j = 0; j < 2*i+1; ++j){
                if ((i==0)||(i==n-1)||(j==0)||(j==2*i)) {
                    System.out.print(simbolo);
                    triangulo = triangulo + "*";  
                }
                else{
                   System.out.print(" ");  
                   triangulo = triangulo + " ";  
                }
            }
        }
        System.out.println();
        triangulo = triangulo + "\n";  

        return triangulo;

    }
}