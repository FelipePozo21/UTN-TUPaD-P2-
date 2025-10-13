package tp7;
public class Vehiculo {
    public String marca;
    public String modelo;
    
    public Vehiculo (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarInfo() {
        System.out.println("La marca del modelo es: " + marca + " Y el modelo es: " + modelo);
    }
}
