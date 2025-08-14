package trabajopractico2;
import java.util.Scanner;

public class Consigna8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%: ");
        double impuesto = input.nextDouble();
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%: ");
        double descuento = input.nextDouble();
        
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        System.out.println("El precio final del producto es: " + precioFinal);
    }
    // Agrese precioBase como param por que sino no se podria sacar el precio final, a menos que sea con una variable global
    public static double calcularPrecioFinal( double precioBase,double impuesto, double descuento) { 
        impuesto = impuesto / 100;
        descuento = descuento / 100;
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
}
