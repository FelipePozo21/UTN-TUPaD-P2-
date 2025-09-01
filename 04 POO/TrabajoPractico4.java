package trabajo.practico4;

public class TrabajoPractico4 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "felipe", "atencion al publico", 1234.0);
        Empleado empleado2 = new Empleado("agustin", "encargado");
        Empleado empleado3 = new Empleado(3, "gonzalo", "jefe", 5400);
        
        System.out.println(empleado1);
        System.out.println(" ");
        System.out.println(empleado2);
        System.out.println(" ");
        System.out.println(empleado3);
        
        System.out.println(" ");
        
        empleado1.actualizarSalario(12.0);
        empleado2.actualizarSalario(1400);
        empleado3.actualizarSalario(56.4);
        
        System.out.println(empleado1);
        System.out.println(" ");
        System.out.println(empleado2);
        System.out.println(" ");
        System.out.println(empleado3);
        
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
