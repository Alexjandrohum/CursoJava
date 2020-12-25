import java.util.Scanner;
public class FiguraGeometrica{

    Scanner sc = new Scanner(System.in);
    Archivo archivoFigura = new Archivo();
    private Cuadrado cuadrado;
    private Triangulo triangulo;

    public void init(){
        cuadrado = new Cuadrado();
        triangulo = new Triangulo();
        entradas();
    }

    public void entradas(){
        System.out.println("Elige una figura: \n1. Cuadrado \n2. Triangulo");
        int tipo = sc.nextInt();
    
        System.out.println("Ingresa el alto: ");
        int alto = sc.nextInt();
        System.out.println("Ingresa el ancho: ");
        int ancho = sc.nextInt();

        switch(tipo){
            case 1:
            String cuadradoCadena = cuadrado.dibujar(alto);
            archivoFigura.mandarFigura(cuadradoCadena);
            break;
            case 2:
            String trianguloCadena = triangulo.dibujar(alto);
            archivoFigura.mandarFigura(trianguloCadena);
            break;
            default:
            System.out.println("Opcion incortrecta");
        }

        System.out.println("Operación \n1. Rotar \n2. Area: ");
        int operacion = sc.nextInt();
            if(tipo == 1){
                switch(operacion){
                case 1:
                String cuadradoRotado = cuadrado.getRotar(alto);
                archivoFigura.mandarFigura(cuadradoRotado);
                break;
                case 2:
                double areaCuadrado = cuadrado.getArea(alto, ancho);
                System.out.println("Su area es: "+areaCuadrado);
                break;
                default:
                System.out.println("Opcion incortrecta");
            }
            
        }
        if(tipo == 2){
                switch(operacion){
                case 1:
                String trianguloRotado = triangulo.getRotar(alto);
                archivoFigura.mandarFigura(trianguloRotado);
                break;
                case 2:
                double areaTriangulo = triangulo.getArea(alto, ancho);
                System.out.println("Su area es: "+areaTriangulo);
                break;
                default:
                System.out.println("Opcion incortrecta");
            }
        }
        
    }
}