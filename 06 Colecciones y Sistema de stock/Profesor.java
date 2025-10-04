package tp6;
import java.util.List;
import java.util.ArrayList;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;
    
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            c.setProfesor(this);
        }
    }
    
    public void eliminarCurso(Curso c) {
        if(cursos.contains(c)) {
            cursos.remove(c);
        }
    }
    
    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso.getNombre());
        }
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    public void mostrarInfo() {
        System.out.println("El profesor " + getNombre() + " esta especialiazo en " + getEspecialidad() + " e imparte los cursos ");
        listarCursos();
        System.out.println("");
    }
}
