package trabajo.practico.pkg1.felipe.pozo;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, ingresa un numero entero");
        int numeroA = input.nextInt();
        
        System.out.println("Por favor, ingresa otro numero entero");
        int numeroB = input.nextInt();
        
        System.out.println("Suma: " + (numeroA + numeroB));
        System.out.println("Resta: " + (numeroA - numeroB));
        System.out.println("Multiplicacion: " + (numeroA * numeroB));
        System.out.println("Division: " + (numeroA / numeroB));
    }
}
