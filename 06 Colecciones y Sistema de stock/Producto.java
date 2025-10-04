package tp6;
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoriaProducto;
    
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoriaProducto) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;     
        this.categoriaProducto = categoriaProducto;
    }
    
    public String getID() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public CategoriaProducto getCategoria() {
        return categoriaProducto;
    }
    
    public String getStock() {
        return "El producto: " + nombre + " tiene un stock de: " + cantidad;
    }
    
    public int getStockINT() {
        return cantidad;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public String actualizarStock(int nuevoStock) {
        if (nuevoStock > 0 && nuevoStock != cantidad) {
            cantidad = nuevoStock;
        }
        
        return "El nuevo stock es de: " + cantidad;
    }
    
    public CategoriaProducto mostrarCategoria() {
        return categoriaProducto;
    }
    
    public void mostrarInfo() {
        System.out.println("Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoriaProducto=" + categoriaProducto + '}');
    }    
    
}
