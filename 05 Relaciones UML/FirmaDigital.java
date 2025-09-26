package tpsemana5;
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario2 usuario2;
    
    public FirmaDigital(String codigoHash, String fecha, Usuario2 usuario2) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario2 = usuario2;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public Usuario2 getUsuario2() {
        return usuario2;
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario2=" + usuario2 + '}';
    }
}
