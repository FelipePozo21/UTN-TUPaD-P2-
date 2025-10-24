package tp8;
public class Cliente implements Notificable {
   public String nombre;
   
   public Cliente(String nombre, String estado) {
       this.nombre = nombre;
       notificarEstado(estado);
   }
   
   @Override
   public void notificarEstado(String estado){
       System.out.println("El pedido de " + nombre + " esta en " + estado);
   }
}
