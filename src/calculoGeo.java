import java.util.Scanner;
import static java.lang.Math.pow;
public class calculoGeo {
    Scanner entrada = new Scanner(System.in);
    figurasGeo cuadrado = new figurasGeo();
    private double PI = 3.1416;
    public void menuDatos(int op){
        double lado;
        double peri;
        double area;
        double radio;
        double volumen;
        double altura;
        double base;
        double lado1;
        double lado2;
        switch(op){
            case 1:
            {
                System.out.println("--CUADRADO--");
                System.out.println("Ingrese el valor del lado: ");
                lado = entrada.nextDouble();
                cuadrado.setLado(lado);
                peri = lado + lado + lado + lado;
                area = (float) pow(lado,2);
                cuadrado.setPerimetro(peri);
                cuadrado.setArea(area);
                System.out.println("El area es: "+ cuadrado.getArea());
                System.out.println("El perimetro es:"+ cuadrado.getPerimetro());
            }
            break;
            case 2:
            {
                System.out.println("--CIRCULO--");
                System.out.println("Ingrese el valor del radio: ");
                radio = entrada.nextDouble();
                volumen = ((0.75)*PI*pow(radio,3));
                figurasGeo circulo = new figurasGeo(radio,volumen);
                peri = 2*PI*radio;
                area =  (PI*pow(radio,2));
                circulo.setPerimetro(peri);
                circulo.setArea(area);
                //circulo.setVolumen(volumen);
                System.out.println(volumen);
                System.out.println("El area es: "+ circulo.getArea());
                System.out.println("El perimetro es:"+ circulo.getPerimetro());
                System.out.println("El volumen es:"+ circulo.getVolumen());
            }
            break;
            case 3:
            {
                System.out.println("--TRIANGULO--");
                System.out.println("Ingrese el valor de altura: ");
                altura = entrada.nextDouble();
                System.out.println("Ingrese el valor de la base: ");
                base = entrada.nextDouble();
                System.out.println("Ingresa el valor del lado 1: ");
                lado1 = entrada.nextDouble();
                System.out.println("Ingresa el valor del lado 2: ");
                lado2 = entrada.nextDouble();
                figurasGeo triangulo = new figurasGeo(altura, base,lado1,lado2);
                peri = base + lado1 + lado2;
                area = (base * altura)/2;
                triangulo.setArea(area);
                triangulo.setPerimetro(peri);
                System.out.println("El area es: "+ triangulo.getArea());
                System.out.println("El perimetro es:"+ triangulo.getPerimetro());
            }
            break;
        }
    }
}
