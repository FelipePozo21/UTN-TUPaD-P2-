package tpsemana5;
public class Reserva {
    private String fecha;
    private String hora;
    private Mesa mesa;
    private Cliente2 cliente;
    
    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public Cliente2 getCliente() {
        return cliente;
    }

    public void setCliente(Cliente2 cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", mesa=" + mesa + ", cliente=" + cliente.getNombre() + '}';
    }
    
    
}
