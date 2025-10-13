package tp7;
import java.util.ArrayList;

public class Tp7 {
    public static void main(String[] args) {
        
        // consigna 1 
        Auto auto = new Auto(4, "ford", "2009");
        
        auto.mostrarInfo();

        // consigna 2     
        Figura[] figuras = new Figura[4];
        figuras[0] = new Circulo(4);
        figuras[1] = new Rectangulo(8,4);
        figuras[2] = new Circulo(8);
        figuras[3] = new Rectangulo(2,4);
        
        for (Figura f : figuras) {
            f.calcularArea();
        }
        // consigna 3
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta("Morena",50000, 8000));
        empleados.add(new EmpleadoPlanta("Felipe",50000, 4000));
        empleados.add(new EmpleadoTemporal("Gonzalo",25000, 2000));
        empleados.add(new EmpleadoTemporal("Bruno",25000, 10000));
        
        for (Empleado e : empleados) {
            System.out.printf("%s gana: $%.2f%n", e.nombre, e.calcularSueldo());
            
            if (e instanceof EmpleadoPlanta) {
                System.out.println(" y es un empleado de planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(" y es un empleado temporal");
            }
        }

//        Consigna 4
        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(new Perro());
        animal.add(new Gato());
        animal.add(new Vaca());
        animal.add(new Perro());
        animal.add(new Gato());
        animal.add(new Vaca());
        
        for (Animal a : animal) {
            a.hacerSonido();
        }
    }
    
}
