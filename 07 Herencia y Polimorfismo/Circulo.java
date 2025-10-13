package tp7;
public class Circulo extends Figura {
    int radio;
    public Circulo(int radio) {
        this.radio = radio;
    }
    
    public void calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        
        // %.2f%n indica que se redondee los decimales y que salte de linea
        System.out.printf("El área del círculo es: %.2f%n", area);
    };
}
