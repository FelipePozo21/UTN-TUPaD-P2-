package tp8;
public class Paypal implements PagoDescuento {
    double pago;
    double pagoConDescuento;
    
    public Paypal(double pago) {
        this.pago = pago;
    }
    
    @Override
    public double aplicarDescuento() {
        return pagoConDescuento = pago - (pago * 0.15);
    } 
    
    public void procesarPago() {
        System.out.println("Se ha aplicado el descuento del 15% a " + pago + " , El nuevo total a pagar es de " + aplicarDescuento());
    };
}
