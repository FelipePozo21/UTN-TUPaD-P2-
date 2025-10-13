package tp7;
public class Auto extends Vehiculo {
    int cantidadPuertas;
    public Auto(int cantidadPuertas,String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("La marca del modelo es: " + marca + " Y el modelo es: " + modelo + " y tiene " + cantidadPuertas + " de puertas.");   
    }
}
