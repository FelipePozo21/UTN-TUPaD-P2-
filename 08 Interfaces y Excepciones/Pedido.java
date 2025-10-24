package tp8;
import java.util.ArrayList;
public class Pedido implements Pagable, Notificable {
    ArrayList<Producto> listaProductos;
    
    public Pedido() {
        listaProductos = new ArrayList();
    }
    
    public void setProductos(Producto producto) {
        listaProductos.add(producto);
    }
    
    public double getTotal() {
        int total = 0;
        
        for (Producto producto : listaProductos) {
            total += producto.getPrecio();
        }
        
        notificarEstado("Completado");
        return total;
    }
    
    @Override
    public void calcularTotal() {
        System.out.println("El total de la suma del precio de los productos es de: " + getTotal());
    }
    @Override
    public void notificarEstado(String estado) {
    System.out.println("El pedido esta " + estado);
    }
}
