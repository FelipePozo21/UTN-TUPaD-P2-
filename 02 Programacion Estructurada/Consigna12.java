package trabajopractico2;
import java.util.Scanner;

public class Consigna12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        for(int i = 0; i < precios.length; i++){
            System.out.println("Precio: $" + precios[i]);
        }
        
        System.out.print("Eliga que precio queres cambiar (1 - 5): ");
        int index = input.nextInt();
        
        System.out.print("Elige el nuevo precio: ");
        double nuevoPrecio = input.nextDouble();
        
        precios[index - 1] = nuevoPrecio;
        
        System.out.println("Precios modificados: ");
        
        for(int i = 0; i < precios.length; i++){
            System.out.println("Precio: $" + precios[i]);
        }
    }
}
