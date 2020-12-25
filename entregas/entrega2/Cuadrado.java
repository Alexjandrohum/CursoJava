public class Cuadrado implements Funcionalidades{
    public int lado;


    public double getArea(int a, int b){
        int operacion = a * b;
        return operacion;
    }

    public String getRotar(int n){
        String figura = "";
        final char simbolo = '*';
        for (int i = 0; i < n; ++i) {
            System.out.println();
            figura = figura + "\n";
            for (int j = 0; j < n-i-1; ++j) {                      
                System.out.print(" ");
                figura = figura + " ";           
            }
            for (int j = 0; j < 2*i+1; ++j){
                if ((i==0)||(j==0)||(j==2*i)) {
                    System.out.print(simbolo);
                    figura = figura + "*";
                } else {
                    System.out.print(" ");
                    figura = figura + " ";
                }                
            }            
        }
        for (int j = n-2; j >= 0; --j) {
            System.out.println();
            figura = figura + "\n";
            for (int i = 0; i < n-j-1; ++i) {                
                System.out.print(" ");
                figura = figura + " ";
            }
            for (int i = 0; i < 2*j+1; ++i) {
                if ((j==0)||(i==0)||(i==2*j)) {
                    System.out.print(simbolo);
                    figura = figura + "*";
                } else {
                    System.out.print(" ");
                    figura = figura +" ";
                }                
            }
        }
        System.out.println();
        figura = figura + "\n";
        return figura;

    }

    public String dibujar(int a){
        String figura = "";
        
            for(int row=1; row<=lado; row++){
                for(int col=1; col<=lado; col++){
                    if(row==1 || row==lado || col==1 || col==lado){
                        System.out.print("*");
                        figura = figura + "*";
                    }else{
                        System.out.print(" ");
                        figura = figura + " ";
                }
            }
            System.out.println();
            figura = figura + "\n";
        }
        return figura;    
    }
}