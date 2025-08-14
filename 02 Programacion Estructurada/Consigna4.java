package trabajopractico2;
import java.util.Scanner;

public class Consigna4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        int precioPorducto = input.nextInt();
        input.nextLine();
      
        double descuento;
        
        System.out.print("Ingrese la categoria del producto (A,B o C): ");
        char categoria = input.nextLine().charAt(0);
        
        while (categoria != 'A' && categoria != 'B' && categoria != 'C') {
            System.out.println(categoria);
            System.out.print("Ingrese la categoria del producto (A,B o C): ");
            categoria = input.nextLine().toUpperCase().charAt(0);
        }
        switch (categoria) {
            case 'A':
                descuento = 10;
                System.out.println("Descuento de " + descuento + "%");
                System.out.println("Precio final: " + (precioPorducto * (1 - descuento / 100.0)));
                break;
            case 'B':
                descuento = 15;
                System.out.println("Descuento de " + descuento + "%");
                System.out.println("Precio final: " + (precioPorducto * (1 - descuento / 100.0)));
                break;
            default:
                descuento = 20;
                System.out.println("Descuento de " + descuento + "%");
                System.out.println("Precio final: " + (precioPorducto * (1 - descuento / 100.0)));
                break;
        }
        
    }
 }

