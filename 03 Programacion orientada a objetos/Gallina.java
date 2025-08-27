package tp.semana.pkg3;
public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
    private int setSumarHuevo() {
        huevosPuestos = huevosPuestos + 1;
        return huevosPuestos;
    }
    
    public void ponerHuevo() {
        System.out.println("Ah puesto un huevo");
        setSumarHuevo();
    }
    
    public int envejecer() {
        edad = edad + 1;
        return edad;
    }
    
    public void mostrarEstado() {
        System.out.println("La gallina con el id " + idGallina + " tiene " + edad + " y ah puesto un total de " + huevosPuestos + " de huevos");
    }
}
