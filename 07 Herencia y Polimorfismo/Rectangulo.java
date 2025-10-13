package tp7;
public class Rectangulo extends Figura {
    int base;
    int altura;
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void calcularArea() {
        System.out.println("El area del rectangulo es de: " + (base * altura));
    }
}
