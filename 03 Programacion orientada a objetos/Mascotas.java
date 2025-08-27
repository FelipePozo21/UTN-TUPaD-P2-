package tp.semana.pkg3;
public class Mascotas {
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + "Especie: " + especie + " " + "Edad: " + edad);
    }
            
    int cumplirAnios(int edadActualizada) {
        edad = edad + edadActualizada;
        return edad;
    }
}
