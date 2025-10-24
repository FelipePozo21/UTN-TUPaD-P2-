package tp8;
public class Producto implements Pagable{
    private String nombre;
    private double precio;
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    @Override
    public void calcularTotal() {
        System.out.println("El producto: " + nombre + " tiene un precio de: " + precio);
    }
}
