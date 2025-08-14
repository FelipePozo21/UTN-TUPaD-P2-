package trabajopractico2;
import java.util.Scanner;
public class Consigna13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        metodoRecursivo(precios,0,0,0,false);
        
        System.out.print("Ingrese que precio quieres cambiar(1 - 5): ");
        int indexNuevoPrecio = input.nextInt();
        System.out.print("Ingrese cual es el nuevo precio: ");
        double nuevoPrecio = input.nextDouble();
        
        System.out.println("Precios modificados: ");
        
        metodoRecursivo(precios,0,nuevoPrecio,indexNuevoPrecio - 1,true);

    }
    
    public static void metodoRecursivo(double[] precios, int index, double nuevoPrecio, int indexNuevoPrecio, boolean cambiarPrecio) {
        if (index >= precios.length) return;
                
        if (cambiarPrecio) {
            if(index == indexNuevoPrecio) {
                precios[index] = nuevoPrecio;
            }
            
            System.out.println("Precio: $" + precios[index]);
            metodoRecursivo(precios, index + 1, nuevoPrecio, indexNuevoPrecio, cambiarPrecio);
        }
        else {
            System.out.println("Precio: $" + precios[index]);
            metodoRecursivo(precios, index + 1, nuevoPrecio, indexNuevoPrecio, cambiarPrecio);
        }
    }
}
