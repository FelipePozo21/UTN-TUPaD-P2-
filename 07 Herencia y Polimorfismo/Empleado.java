package tp7;
abstract class Empleado {
    String nombre;
    Empleado(String nombre) {
       this.nombre = nombre;
    }
    abstract double  calcularSueldo();
}
