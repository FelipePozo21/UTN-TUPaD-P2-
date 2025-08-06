package trabajo.practico.pkg1.felipe.pozo;
import java.util.Scanner;
        
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        
        // consigna A
        System.out.println("Ingrese un numero entero");
        int numeroA = input.nextInt();
        
        System.out.println("Ingrese otro numero entero");
        int numeroB = input.nextInt();
        
        
        // Consigna B
        System.out.println("Ingrese un numero entero");
        double numeroC = input.nextInt();
        
        System.out.println("Ingrese otro numero entero");
        double numeroD = input.nextInt();
        
        
        System.out.println("La division de " + numeroA + " y " + numeroB + " es: " + (numeroA / numeroB));
        System.out.println("La division de " + numeroC + " y " + numeroD + " es: " + (numeroC / numeroD));
    }
}
