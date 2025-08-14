package trabajopractico2;
import java.util.Scanner;

public class Consigna5 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int suma = 0;
       
       int numeroUsuario = 1;
       
       while (numeroUsuario != 0) {
           System.out.print("Ingrese un numero (0 para terminar): ");
           numeroUsuario = input.nextInt();
           
           if (numeroUsuario % 2 == 0) {
            suma += numeroUsuario;
           }
       }
        System.out.println("La suma de los numeros pares es: " + suma);
    }
}
