import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try{
        int op = -1;
        while(op != 0){
            System.out.println("***FIGURAS GEOMETRICAS***");
            System.out.println("1.- CUADRADO");
            System.out.println("2.- CIRCULO");
            System.out.println("3.- TRIANGULO");
            System.out.print("Ingrese su opcion: ");
            op = entrada.nextInt();
            calculoGeo d1 = new calculoGeo();
            d1.menuDatos(op);
        }
    }catch(Exception Ex){
            System.out.println("Datos erroneos!");
        }
    }
}