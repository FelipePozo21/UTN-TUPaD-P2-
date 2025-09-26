package tpsemana5;
public class Usuario {
    private String nombre;
    private int dni;
    private Celular celular;
    
    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public Celular getCelular() {
        return celular;
    }
    
    public void setCelular(Celular celular) {
        this.celular = celular; // Asociación bidireccional
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + celular.getMarca() + '}';
    }
    
    
}
