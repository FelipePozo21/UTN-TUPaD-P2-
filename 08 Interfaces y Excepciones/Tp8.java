package tp8;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Tp8 {
    public static void main(String[] args) {
//        Pedido pedidos = new Pedido();
//        pedidos.setProductos(new Producto("Mesa", 350000));
//        pedidos.setProductos(new Producto("Computadora", 100000));
//        pedidos.setProductos(new Producto("Campera", 25000));
//        
//        Cliente juana = new Cliente("Juana", "Pendiente");
//        
//        double total = pedidos.getTotal(); 
//        
//        TarjetaCredito pagoConTarjeta = new TarjetaCredito(total);
//        pagoConTarjeta.procesarPago();
//
//        Paypal pagoConPaypal = new Paypal(total);
//        pagoConPaypal.procesarPago();


        // 1. Division 
//           int dividendo, divisor;
           Scanner scanner = new Scanner(System.in);
//           
//           System.out.println("Ingrese dos numeros para dividirlos");
//           System.out.print("Primer numero: ");
//           dividendo = scanner.nextInt();
//           
//           System.out.print("Segundo numero: ");
//           divisor = scanner.nextInt();
//           try {
//                double result = dividendo / divisor;
//                System.out.println("El resultado de " + dividendo + "/" + divisor + " es: " + result);
//               
//           } catch(ArithmeticException err) {
//               System.out.println("Error: " + err.getMessage());
//           }

        // 2. Conversion 
        
//            System.out.print("Ingrese el numero a convertir a int: ");
//            
//            try {
//                int text = Integer.parseInt(scanner.nextLine());
//                System.out.println("Texto convertido a int: " + text);
//            } catch (NumberFormatException err) {
//                System.out.println("Error: " + err.getMessage());
//            }

       // 3. Lectura de archivo
//            System.out.println("Ingrese el nombre del archivo(sin .txt)");
//            String archivo1 = scanner.nextLine() + ".txt";
//            
//            try {
//                File archivo = new File(archivo1);
//                BufferedReader buffer = new BufferedReader(new FileReader(archivo));
//                System.out.println("Contenido: " + buffer.readLine());
//                
//            } catch(FileNotFoundException err) {
//                System.out.println("Error: " + err);
//            } catch(IOException err) {
//                System.out.println("Error: " + err);
//            }
            
       // 4. Excepcion personalizada

                try {
                    System.out.print("Ingrese su edad: ");
                    int edad = Integer.parseInt(scanner.nextLine());

                    if(edad < 0) {
                        throw new EdadInvalidaException("Error: Edad negativa");
                    } else if( edad > 120) {
                        throw new EdadInvalidaException("Error: La edad no puede ser mayor a 120");
                    }
                    System.out.println("Edad valida: " + edad);
                } catch(EdadInvalidaException err) {
                    System.out.println("Error: " + err.getMessage());
                }
       
        // 5. Lectura de archivo try-with
//            System.out.println("Ingrese el nombre del archivo(sin .txt)");
//            String archivo2 = scanner.nextLine() + ".txt";
//            try (FileReader archivoLeer = new FileReader(archivo)){
//                BufferedReader verificarArchivo = new BufferedReader(archivoLeer);
//                
//                System.out.println("Contenido del archivo");
//                
//                String linea;
//                
//                while((linea = verificarArchivo.readLine()) != null) {
//                    System.out.println(linea);
//                }
//            } catch (FileNotFoundException err) {
//                System.out.println("Error: " + err.getMessage());
//            } catch (IOException err) {
//                System.out.println("Error: "+ err.getMessage());
//            }


    }
}
