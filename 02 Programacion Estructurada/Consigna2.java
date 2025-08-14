package trabajopractico2;
import java.util.Scanner;

public class Consigna2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int maximoNumero = 0;
        
        for(int i = 0; i < 3; i++) {
            System.out.print("Ingresa un numero: ");
            int numero = input.nextInt();
            
            if (numero > maximoNumero) {
                maximoNumero = numero;
            }
        }
        
        System.out.println("El mayor es " + maximoNumero);
    }
}
