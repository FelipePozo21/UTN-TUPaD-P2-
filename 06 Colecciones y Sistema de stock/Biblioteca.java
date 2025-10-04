package tp6;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<>();
    }
    
    private boolean librosIsEmpty() {
        return libros.isEmpty();
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libroNuevo = new Libro(isbn, titulo, anioPublicacion, autor);
        if (!libros.contains(libroNuevo)) {
            libros.add(libroNuevo);
        }
    }
    
    public void listarLibros() {
        for (Libro libro: libros) {
            System.out.println(libro.mostrarInfo());
        }
    }
    
    public void buscarLibroPorIsbn(String isbn) {
        if (librosIsEmpty()) { 
            throw new IllegalArgumentException("No hay libros listados");
        }
        
        for (Libro libro : libros) {
            if (libro.getISBN().equals(isbn)) {
                System.out.println(libro.mostrarInfo());
                return;
            }
        }
    }
    
    public void eliminarLibro(String isbn) {
        if (librosIsEmpty()) {
            throw new IllegalArgumentException("No hay libros listados");
        }

        for (int i = 0; i < libros.size(); i++) {
            if(libros.get(i).getISBN().equals(isbn)) {
                libros.remove(i);
            }
        }        
        
        listarLibros();
    }
    
    public void obtenerCantidadLibros() {
        System.out.println(libros.size());
    }
    
    public void filtrarLibrosPorAnio(int anio) {
        List anioFiltrado = new ArrayList<>();
        
        for (Libro libro : libros) {
            if ( libro.getAnio() == anio) {
                anioFiltrado.add(libro.mostrarInfo());
            }
        }
        
        for ( int i = 0; i < anioFiltrado.size(); i++ ) {
            System.out.println(anioFiltrado.get(i));
        }
    }
    
    public void mostrarAutoresDisponibles() {
        List<Autor> autoresDisponibles = new ArrayList<>();
        
        for ( Libro libro : libros ) {
            if ( !autoresDisponibles.contains(libro.getAutor())) {
                autoresDisponibles.add(libro.getAutor());
            }
        } 
        
        for ( int i = 0; i < autoresDisponibles.size(); i++) {
            System.out.println(autoresDisponibles.get(i).mostrarInfo());
        }
    }
}
