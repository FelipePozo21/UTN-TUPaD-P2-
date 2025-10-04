package tp6;
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    public String getISBN() {
        return isbn;
    }
    
    public int getAnio() {
        return anioPublicacion;
    }
    
    public Autor getAutor() {
        return autor;
    }
    
    public String mostrarInfo() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + ", autor=" + autor.mostrarInfo() + '}';
    }
}
