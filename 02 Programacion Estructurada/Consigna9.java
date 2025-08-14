package trabajopractico2;
import java.util.Scanner;

public class Consigna9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();
        input.nextLine();
        
        System.out.print("Ingrese la zona de envioa(Nacional/Internacional): ");
        String zona = input.nextLine().toLowerCase();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envio es: " + costoEnvio);
        
        System.out.println("El total a pagar es: " + totalCompra);
    }
    
    public static double calcularCostoEnvio(double peso, String zona){
        return zona.equals("nacional") ? peso * 5 : peso * 10;
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
       return precioProducto + costoEnvio;
    }
}
