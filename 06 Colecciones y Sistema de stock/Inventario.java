package tp6;
import java.util.ArrayList;
import java.util.List;
public class Inventario {
    private final ArrayList<Producto> productos;
    
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    private boolean productosIsEmpty() { // metodo privado que verifica si el array esta vacio y devuelve un booleanos, sirve para evitar errores en los bucles
        return productos.isEmpty();
    }
    
    public void agregarProductos(Producto p) {
        if (!productos.contains(p)) {
            productos.add(p);
        }
    }
    
    public void listarProductos() {
        if (productosIsEmpty()) {
            throw new IllegalArgumentException("El inventario esta vacio");
        }
        
        for(Producto p : productos) {
            p.mostrarInfo();
        }
    }
    
    public void buscarProductoPorID(String id) {
        if (productosIsEmpty()) {
            throw new IllegalArgumentException("El inventario esta vacio");
        }
        
        for(Producto p : productos) {
            if (p.getID().equals(id)) {  
               p.mostrarInfo();
            }
        }
    }
    
    public void eliminarProducto(String id) {
        if (productosIsEmpty()) {
            throw new IllegalArgumentException("El inventario esta vacio");
        }
        
        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getID().equals(id)) {
                productos.remove(i);
                return;
            }
        }
    }
    
    public void actualizarStock(String id, int nuevaCantidad) {
        if (productosIsEmpty()) {
            throw new IllegalArgumentException("El inventario esta vacio");
        }
        
        if (nuevaCantidad <= 0) {
            throw new IllegalArgumentException("La cantidad de stock ingresada no es un numero valido");
        }
        
        for (Producto p : productos) {
            if (p.getID().equals(id)) {
                p.actualizarStock(nuevaCantidad);
                System.out.println(p.getStock());
            }
        }
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        if (productosIsEmpty()) {
            throw new IllegalArgumentException("El inventario esta vacio");
        }
        
        for (Producto p : productos) {
            if (p.getCategoria().equals(categoria)) {
                p.mostrarInfo();
            }
        }
    }
    
    public void obtenerTotalStock() {
        if (productosIsEmpty()) {
            throw new IllegalArgumentException("El inventario esta vacio");
        }
        
       for (Producto p : productos) {
           System.out.println(p.getStock());
       }
    }
    
    public void obtenerProducotConMayorStock() {  
        if (productosIsEmpty()) {
            throw new IllegalArgumentException("El inventario esta vacio");
        }
       
       Producto productoConMayorStock = productos.get(0);

        for (Producto p : productos) {
            if (p.getStockINT() > productoConMayorStock.getStockINT()) {
                productoConMayorStock = p;
            }
        }
        System.out.println("El producto con mayor stock es: " + productoConMayorStock.getNombre() + " que tiene un stock de " + productoConMayorStock.getStockINT());
    }
    
    public List filtrarProductosPorPrecio(double min, double max) {
        if (productosIsEmpty()) {
            throw new IllegalArgumentException("El inventario esta vacio");
        }  
        
        List<String> productosFiltrados = new ArrayList<>();
        
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                productosFiltrados.add(p.getNombre() + " " + p.getPrecio());
            }
        }
        
        return productosFiltrados;
    }
    
    public void mostrarCategoriasDisponibles() {
        if (productosIsEmpty()) {
            System.out.println("No hay categorias disponibles");
            return;
        } 
        
        List<CategoriaProducto> categoriasDisponibles = new ArrayList<>();
        
        for (Producto p : productos) {
            CategoriaProducto categoria = p.getCategoria();
            if (!categoriasDisponibles.contains(categoria)) {
                categoriasDisponibles.add(categoria);
            }
        }
        
        for (CategoriaProducto p : categoriasDisponibles) {
            System.out.println("Categoria: " + p + ", Descripcion: " + p.getDescripcion());
        }
    }
} 
