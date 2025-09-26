package tpsemana5;
public class Usuario2 {
    private String nombre;
    private String email;
    
    public Usuario2(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Usuario2{" + "nombre=" + nombre + ", email=" + email + '}';
    }
    
    
}
