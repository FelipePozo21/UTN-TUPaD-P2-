package trabajo.practico4;
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        Empleado.totalEmpleados += 1;
    }
    
    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        
        Empleado.totalEmpleados += 1;
        this.id = totalEmpleados;
        this.salario = 1200.0;
    }
    
    public double actualizarSalario(double porcentaje) {
        salario = salario + (salario * porcentaje) / 100;
        return salario;
    }
    public double actualizarSalario(int precioFijo) {
        salario = salario + precioFijo;
        return salario;
    }
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
}
