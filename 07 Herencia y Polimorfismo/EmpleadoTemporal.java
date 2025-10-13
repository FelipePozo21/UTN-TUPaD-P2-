package tp7;
public class EmpleadoTemporal extends Empleado {
    int sueldoBase;
    int bonificacion;
    
    public EmpleadoTemporal(String nombre, int sueldoBase, int bonificacion) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
    }
    
    public double calcularSueldo() {
        return sueldoBase + bonificacion;
    }
}
