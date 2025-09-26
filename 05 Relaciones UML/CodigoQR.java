package tpsemana5;
public class CodigoQR {
    private String valor;
    private Usuario3 usuario;
    
    public CodigoQR(String valor) {
        this.valor = valor;
    }
    
    public void setUsuario(Usuario3 usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario + '}';
    }
}
