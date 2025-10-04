package tp6;
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }
    
    public void setProfesor(Profesor p) {
        // verifico 2 veces si profesor o p es null, con el unico fin de que siempre que se setee un profesor
        // se reinserte, para evitar errores o marcar al curos como sin profesor asignado
        if (profesor == p) {
            return;
        }
        
        if(profesor != null ) {
            profesor = null;
        } else if(p != profesor && p != null) {
            profesor = p;
            profesor.agregarCurso(this);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void mostrarInfo() {
        System.out.println(getCodigo());
        System.out.println(getNombre());
        if (profesor != null) {
            System.out.println(getProfesor());
        }
    }
}
