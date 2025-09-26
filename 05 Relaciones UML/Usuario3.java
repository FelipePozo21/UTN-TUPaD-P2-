package tpsemana5;
public class Usuario3 {
    private String nombre;
    private String email;
    
    public Usuario3(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario3{" + "nombre=" + nombre + ", email=" + email + '}';
    }
}
