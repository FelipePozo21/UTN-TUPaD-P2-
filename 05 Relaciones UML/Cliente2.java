package tpsemana5;
public class Cliente2 {
    private String nombre;
    private int telefono;
    
    public Cliente2(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente2{" + "nombre=" + nombre + ", telefono=" + telefono + ", reserva=" + '}';
    }
    
    
}
