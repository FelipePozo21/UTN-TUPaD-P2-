package tp.semana.pkg3;
public class NaveEspacial {
    public String nombre;
    public int combustible = 50;
    private int distancia = 0;
    
    public void despegar() {
        System.out.println("La nave " + nombre + " ah despegado!");
        mostrarEstado();
    }
    
    public void avanzar(int distancia) {
        if ( combustible > 0 ) {
            combustible = combustible - 10;
        }
    }
    
    public void recargarCombustible( int cantidad) {
        while (combustible != 50) {
            combustible = combustible + cantidad;
        }
    }
    
    private void mostrarEstado() {
        while (distancia <= 100) {
            if (combustible > 0) {
                System.out.println("La nave avanza 10 sistemas solares!");
                avanzar(10);
            } else if (combustible == 0) {
                System.out.println("Recargando nave...");
                recargarCombustible(10);
            }
            distancia = distancia + 10;
        }
        System.out.println("Viaje finalizado!");
    }
}
