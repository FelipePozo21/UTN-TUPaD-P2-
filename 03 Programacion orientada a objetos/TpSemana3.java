package tp.semana.pkg3;
public class TpSemana3 {

    public static void main(String[] args) { 
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Felipe";
        estudiante1.apellido = "Pozo";
        estudiante1.curso = "12";
        estudiante1.calificacion = 50;
        
        estudiante1.mostrarInfo();
        
        estudiante1.subirCalificacion(30);
        
        estudiante1.mostrarInfo();
        
        estudiante1.bajarCalificacion(50);
        
        estudiante1.mostrarInfo();
        
        
        Mascotas mascota1 = new Mascotas();
        mascota1.nombre = "Canela";
        mascota1.especie = "Perro";
        mascota1.edad = 2;
        
        mascota1.mostrarInfo();
        
        System.out.println("2 años despues...");
        
        mascota1.cumplirAnios(2);
        
        mascota1.mostrarInfo();

        
        
        Libro libro1 = new Libro();
        libro1.getTitulo();
        libro1.getAutor();
        libro1.getAnioPublicado();
        
        libro1.setAnioPublicado(-1);
        libro1.setAnioPublicado(2003);
        libro1.getAnioPublicado();
        
        
       Gallina gallina1 = new Gallina();
       Gallina gallina2 = new Gallina();
       
       gallina1.idGallina = 1;
       gallina1.edad = 2;
       gallina1.huevosPuestos = 2;
       gallina1.mostrarEstado();
       
       gallina2.idGallina = 2;
       gallina2.edad = 3;
       gallina2.huevosPuestos = 1;
       gallina2.mostrarEstado();
       
        
        NaveEspacial nave1 = new NaveEspacial();
        
        nave1.despegar();
    }
    
}
