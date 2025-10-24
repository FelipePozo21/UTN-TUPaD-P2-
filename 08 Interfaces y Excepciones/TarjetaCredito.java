package tp8;
public class TarjetaCredito implements Pago{
    double pago;
    
    public TarjetaCredito(double pago) {
        this.pago = pago;
    }
    
    @Override
    public void procesarPago() {
        System.out.println("Se ha procesado el pago de: " + pago);
    }
}
