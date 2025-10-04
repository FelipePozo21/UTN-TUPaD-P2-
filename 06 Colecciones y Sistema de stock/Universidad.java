package tp6;
import java.util.List;
import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) {
            profesores.add(p);
        } else {
           return;
        }
    }
    
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            }
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        
        if (c != null && p != null ) {
            c.setProfesor(p);
        } else {
            throw new IllegalArgumentException("No se pudo asignar correctamente");
        }
    }
    
    public void listarProfesores() {
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }
    
    public void listarCursos() {
        for (Curso c : cursos) {
            c.getNombre();
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
    
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
    return null;
    }
    
    public void eliminarCurso(String codigo) {
        for (int i = 0; i < cursos.size(); i++) {
            Curso c = cursos.get(i);
            if (c.getCodigo().equals(codigo)) {
                Profesor p = c.getProfesor();
                p.eliminarCurso(c);
                cursos.remove(c);
            }
        }
    }
    
    public void eliminarProfesor(String id) {
        for (int i = 0; i < profesores.size(); i++) {
            Profesor p = profesores.get(i);
            if (p.getId().equals(id)) {
                for (Curso c : cursos) {
                    c.setProfesor(p); // esto haria que todos los cursos dictados por ese profesor, esten sin uno asignado
                }
                profesores.remove(p);
            }
        }
    }
    
    public void reporte() {
        for (Profesor p : profesores) {
            p.listarCursos();
        }
    }
}
