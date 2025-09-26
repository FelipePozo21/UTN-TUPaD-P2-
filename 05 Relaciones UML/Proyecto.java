package tpsemana5;
public class Proyecto {
    private String nombre;
    private int duracion;
    
    public Proyecto(String nombre, int duracion){
        this.nombre = nombre;
        this.duracion = duracion;
    }    

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracion=" + duracion + '}';
    }
}
