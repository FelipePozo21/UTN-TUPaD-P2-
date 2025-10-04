package tp6;
public class Tp6 {
    public static void main(String[] args) {
      
    // Consigna 1
        
    Inventario inventario = new Inventario();    
        
    Producto fideos = new Producto("1","Fideos", 1000.00, 10, CategoriaProducto.ALIMENTOS);
    Producto monitor = new Producto("2","Monitor generico", 35000.00, 4, CategoriaProducto.ELECTRONICA);
    Producto remera = new Producto("3","Remera de hombre", 15000.00, 21, CategoriaProducto.ROPA);
    Producto collar = new Producto("4","Collar para perros", 3500.00, 10, CategoriaProducto.ANIMALES);
    Producto mantel = new Producto("5","Mantel gris", 25000.00, 10, CategoriaProducto.HOGAR);
    
    
    inventario.agregarProductos(fideos);
    inventario.agregarProductos(monitor);
    inventario.agregarProductos(remera);
    inventario.agregarProductos(collar);
    inventario.agregarProductos(mantel);
    
    inventario.listarProductos();
    
    System.out.println("-------------");
    
    inventario.buscarProductoPorID("2");
    
    System.out.println("-------------");
    
    inventario.actualizarStock("5", 11);
    
    System.out.println("-------------");
    
    collar.mostrarInfo();
    
    System.out.println("-------------");
    
    inventario.filtrarPorCategoria(CategoriaProducto.HOGAR);
    
    System.out.println("-------------");
    
    inventario.obtenerTotalStock();
   
    System.out.println("-------------");

    inventario.obtenerProducotConMayorStock();

    System.out.println("-------------");

    inventario.filtrarProductosPorPrecio(3000.00,30000.00)
            .forEach(System.out::println);
    
    System.out.println("-------------");
    
    inventario.eliminarProducto("3");
    
    inventario.mostrarCategoriasDisponibles();
    
    System.out.println("Aca se ve como se borro la remera");

    // Consigna 2
    
    Biblioteca biblioteca = new Biblioteca("Biblioteca lujan");
    Autor walsh = new Autor("1", "Maria Elena Walsh", "Argentina");
    
    biblioteca.agregarLibro("1", "La reina Batata", 1964, walsh);
    biblioteca.agregarLibro("2", "Manuelita la tortuga", 1963, walsh);
    biblioteca.agregarLibro("3", "El reino del reves", 1964, walsh);
    biblioteca.agregarLibro("4", "La mona Jacinta", 1964, walsh);
    biblioteca.agregarLibro("5", "El adivinador", 1966, walsh);
    
    Autor borges = new Autor("2", "Jorge Luis Borges", "Argentina");
    
    biblioteca.agregarLibro("6", "Ficciones", 1944, borges);
    biblioteca.agregarLibro("7", "La biblioteca de Babel", 1941, borges);
    biblioteca.agregarLibro("8", "El Aleph", 1945, borges);
    biblioteca.agregarLibro("9", "La casa de Asterion", 1947, borges);
    biblioteca.agregarLibro("10", "El Sur", 1953, borges);
    
    Autor cortazar = new Autor("3", "Julio Florencio Cortazar", "Argentina");
    
    biblioteca.agregarLibro("11", "Rayuela", 1963, cortazar);
    biblioteca.agregarLibro("12", "Casa tomada", 1946, cortazar);
    biblioteca.agregarLibro("13", "El perseguidor", 1959, cortazar);
    biblioteca.agregarLibro("14", "Final del juego", 1956, cortazar);
    biblioteca.agregarLibro("15", "La noche boca arriba", 1956, cortazar);
    
    
    biblioteca.listarLibros();
    System.out.println("-------------------------------");
    System.out.println("");
    
    biblioteca.buscarLibroPorIsbn("4");
    System.out.println("-------------------------------");
    System.out.println("");
    
    biblioteca.filtrarLibrosPorAnio(1963);
    System.out.println("-------------------------------");
    System.out.println("");
    
    biblioteca.eliminarLibro("2");
    System.out.println("-------------------------------");
    System.out.println("");
    
    biblioteca.obtenerCantidadLibros();
    System.out.println("-------------------------------");
    System.out.println("");
    
    biblioteca.mostrarAutoresDisponibles();
    System.out.println("-------------------------------");
    System.out.println("");

    // Consigna 3
    
    Universidad UTN = new Universidad("UTN");
    Profesor profesorA = new Profesor("1", "Profesor A", "Matematicas");
    Profesor profesorB = new Profesor("2", "Profesor B", "Ingles");
    Profesor profesorC = new Profesor("3", "Profesor C", "Programacion");
    
    UTN.agregarProfesor(profesorA);
    UTN.agregarProfesor(profesorB);
    UTN.agregarProfesor(profesorC);
    
    Curso cursoA = new Curso("1", "ingles");
    Curso cursoB = new Curso("2", "matematicas");
    Curso cursoC = new Curso("3", "programacion");
    Curso cursoD = new Curso("4", "base de datos");
    Curso cursoE = new Curso("5", "organizaicon empresarial");
    
    UTN.agregarCurso(cursoA);
    UTN.agregarCurso(cursoB);
    UTN.agregarCurso(cursoC);
    UTN.agregarCurso(cursoD);
    UTN.agregarCurso(cursoE);
    
    UTN.asignarProfesorACurso("1", "1");
    UTN.asignarProfesorACurso("2", "1");
    UTN.asignarProfesorACurso("3", "2");
    UTN.asignarProfesorACurso("4", "2");
    UTN.asignarProfesorACurso("5", "3");
    
    UTN.listarProfesores();
    UTN.listarCursos();
    
    UTN.asignarProfesorACurso("1", "2");
    cursoA.getProfesor();
    profesorB.listarCursos();
    
    UTN.eliminarCurso("4");
    UTN.eliminarProfesor("3");
    
    UTN.listarProfesores();
    UTN.listarCursos();
    
    UTN.reporte();
    }   
}
