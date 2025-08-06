package trabajo.practico.pkg1.felipe.pozo;
import java.util.Scanner;


public class ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese su nombre: ");
        String nombre = input.nextLine();
        
        System.out.println("Por favor, ingrese su edad: ");
        int edad = input.nextInt(); 
        
        System.out.println("Hola " + nombre);
        System.out.println("Tenes " + edad + " anios");
    }
}
