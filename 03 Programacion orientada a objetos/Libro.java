package tp.semana.pkg3;
public class Libro {
    private String titulo = "libro ejemplo";
    private String autor = "autor ejemplo";
    private int anioPublicacion = 2004;
    
    public void getTitulo() {
        System.out.println(titulo);
    };
    public void getAutor() {
        System.out.println(autor);
    };
    public void getAnioPublicado() {
        System.out.println(anioPublicacion);
    };
    
    public int setAnioPublicado(int anio) {
        if(anio < 2025 && anio > 0) {
            anioPublicacion = anio;
        }
        else {
            System.out.println("Año invalido");
        }
        return anioPublicacion;
    }
}
