package tp.semana.pkg3;
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion = 50;
    
   void mostrarInfo() {
       System.out.println("El estudiante " + nombre + " " + apellido + " " + "pertenece al curso " + curso + " " + " y su nota es de " + calificacion);
   }
   
   double subirCalificacion(int puntos) {
       if (calificacion < 100 && puntos > 0 && puntos <= 100) {
           if (calificacion + puntos < 100) {
               calificacion = calificacion + puntos;
           } else {
               calificacion = 100;
           }
       }
       return calificacion;
   }
   
   double  bajarCalificacion(int puntos) {
       if (calificacion < 100 && puntos > 0 && puntos <= 100) {
           if (calificacion - puntos > 0) {
               calificacion = calificacion - puntos;
           } else {
               calificacion = 0;
           }
       }
       return calificacion;
   }
}
