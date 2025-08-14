package trabajopractico2;
import java.util.Scanner;

public class Consigna11 {
    
    final static double DESCUENTO = 0.10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio dle producto: ");
        
        double precio = input.nextDouble();
        
        double precioFinal = calcularDescuentoEspecial(precio);
        
        System.out.println("El descuento especial aplicado es: " + (DESCUENTO * 100) + "%");
        
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    public static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * (1 - DESCUENTO);
        return descuentoAplicado;
    }
}
