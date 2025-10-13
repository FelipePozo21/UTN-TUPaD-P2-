package tp7;
public class EmpleadoPlanta extends Empleado {
    int sueldoBase;
    int bonificacion;
    
    public EmpleadoPlanta(String nombre, int sueldoBase, int bonificacion) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
    }
    
    public double calcularSueldo() {
        return sueldoBase + bonificacion;
    }
}

