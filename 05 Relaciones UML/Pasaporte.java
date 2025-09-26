package tpsemana5;
public class Pasaporte {
   private int numero;
   private String fechaEmision;
   private Titular titular;
   private Foto foto;
   
   public Pasaporte(int numero, String fechaEmision, String imagen, String formato) {
       this.numero = numero;
       this.fechaEmision = fechaEmision;
       this.foto = new Foto(imagen,formato); // Composicion
   }
  

    public int getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Titular getTitular() {
        return titular;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setTitular(Titular titular) {
        this.titular = titular; // asociacion bidireccional
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
   }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", titular=" + titular + ", foto=" + foto + '}';
    }
   
   
}
