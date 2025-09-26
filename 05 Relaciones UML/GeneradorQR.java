package tpsemana5;
public class GeneradorQR {
    private CodigoQR codigoQR;
    
    public GeneradorQR(CodigoQR codigoQR) {
        this.codigoQR = codigoQR;
    }
    
    public void generar(String nombre, String email) {
        Usuario3 usuario3 = new Usuario3(nombre, email);
        
        codigoQR.setUsuario(usuario3);
    }

    @Override
    public String toString() {
        return "GeneradorQR{" + "codigoQR=" + codigoQR + '}';
    }
}
