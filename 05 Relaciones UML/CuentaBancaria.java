package tpsemana5;
public class CuentaBancaria {
    private String cbu;
    private int saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular2 titular;
    
    public CuentaBancaria(String cbu, int saldo, ClaveSeguridad claveSeguridad) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = claveSeguridad;
    }

    public Titular2 getTitular() {
        return titular;
    }

    public void setTitular(Titular2 titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", claveSeguridad=" + claveSeguridad + ", titular=" + titular + '}';
    }
    
    
}
