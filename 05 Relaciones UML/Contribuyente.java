package tpsemana5;
public class Contribuyente {
    private String nombre;
    private int monto;
    
    public Contribuyente(String nombre, int monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Contribuyente{" + "nombre=" + nombre + ", monto=" + monto + '}';
    }
    
    
}
