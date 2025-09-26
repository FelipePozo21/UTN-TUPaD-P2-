package tpsemana5;
public class TpSemana5 {
  public static void main(String[] args) {
       // 1. Pasaporte - Foto - Titular
        Titular titular = new Titular("Felipe", 44377556);
        Pasaporte pasaporte = new Pasaporte(123, "20/2/2002", "foto.png", "png");
        pasaporte.setTitular(titular);
       
       System.out.println("Titular: " + titular);
       System.out.println(titular.getPasaporte());
       System.out.println("Pasaporte: " + pasaporte);

      // 2. Celular - Bateria - Foro
        Bateria bateria = new Bateria("Bateria generica", 5000);
        Celular celular = new Celular(123123123, "Galaxy", "s21", bateria);
        Usuario usuario = new Usuario("Felipe", 44377556);    
        celular.setUsuario(usuario);
      
      System.out.println("Usuario: " + usuario);
      System.out.println("Celular: " + celular);
        
        // 3. Libro - Autor - Editorial
        
        Autor autor = new Autor("JK", "britanica");
        Editorial editorial = new Editorial("editorial generica", "calle ejemplo 123");
        Libro libro = new Libro("Harry potter", 123123, editorial);
        libro.setAutor(autor);
        
        System.out.println("Libro: " + libro);
        System.out.println("Autor:" + libro.getAutor());
        System.out.println("Editorial: " + libro.getEditorial());

        // 4. TarjetaDeCredito - Cliente - Banco
        
        Banco banco = new Banco("banco generico", 223344222);
        Cliente cliente = new Cliente("Felipe", 44377556);
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito(123123123, "25/05/2028", banco);
        tarjetaDeCredito.setCliente(cliente);
        
        System.out.println("Banco: " + tarjetaDeCredito.getBanco());
        System.out.println("Cliente: " + tarjetaDeCredito.getCliente());
        System.out.println("Tarjeta de credito: " + tarjetaDeCredito);

        // 5. Computadora - PlacaMadre - Propietario
        
        Propietario propieratio = new Propietario("Felipe", 44377556);
        Computadora computadora = new Computadora("dell", 123, "modelo placa generica", "L117");
        computadora.setPropietario(propieratio);
        
        System.out.println("Computadora: " + computadora);
        System.out.println("Propietario: " + computadora.getPropietario());
        System.out.println("Placa madre: " + computadora.getPlacaMadre());
        

        // 6. Reserva - Cliente2 - Mesa 
        Mesa mesa = new Mesa(123, 2);
        Cliente2 cliente2 = new Cliente2("Felipe", 228422222);
        Reserva reserva = new Reserva("22/01/2023", "12:42", mesa);
        reserva.setCliente(cliente2);
//        
        System.out.println("Cliente: " + reserva.getCliente());
        System.out.println("Mesa: " + reserva.getMesa());
        System.out.println("Reserva: " + reserva);

        // 7. Vehiculo - Motor - Conductor
        
        Motor motor = new Motor("v8", 123);
        Conductor conductor = new Conductor("Felipe", "Valida");
        Vehiculo vehiculo = new Vehiculo("asd123", "corolla", motor);
        vehiculo.setConductor(conductor);
        
        System.out.println("Motor: " + vehiculo.getMotor());
        System.out.println("Conductor: " + vehiculo.getConductor());
        System.out.println("Vehiculo: " + vehiculo);

        // 8. Documento - FirmaDigital - Usuario
            Usuario2 usuario2 = new Usuario2("Felipe", "Felipe@email.com");
            Documento documento = new Documento("documento generico", "Lorem ipsum","asdj2", "2002", usuario2);
            
            System.out.println("Documento: " + documento);
            System.out.println("Usuario: " + usuario2);
            System.out.println("Firma digital: " + documento.getFirmaDigital());
            
            
        // 9. CitaMedica - Paciente - Profesional    
            CitaMedica citaMedica = new CitaMedica("21/7/2021", "12:40");
            Paciente paciente = new Paciente("Bautista", "Osecac");
            Profesional profesional = new Profesional("Felipe", "Medico general");
            
            citaMedica.setPaciente(paciente);
            citaMedica.setProfesional(profesional);
            
            System.out.println("Cita medica " + citaMedica);

        // 10. CuentaBancaria - ClaveSeguridad - Titular
        
            ClaveSeguridad claveSeguridad = new ClaveSeguridad(222, "22/04,2016");
            Titular2 titular2 = new Titular2("Felipe", 44377556);
            CuentaBancaria cuentaBancaria = new CuentaBancaria("123123123", 1200, claveSeguridad);
            
            cuentaBancaria.setTitular(titular2);
            
            System.out.println("CuentaBancaria: " + cuentaBancaria);

        // 11. Reproductor - Cancion - Artista
        
            Reproductor reproductor = new Reproductor();
            Cancion cancion = new Cancion("Puente");
            Artista artista = new Artista("Gustavo Cerati", "Rock");
            
            cancion.setArtista(artista);
            
            reproductor.reproducir(cancion);
            
        // 12. Impuesto - Contribuyente - Calculadora
        
            Impuesto impuesto = new Impuesto(1200);
            Contribuyente contribuyente = new Contribuyente("Felipe", 123123123);
            Calculadora calculadora = new Calculadora();
            
            impuesto.setContribuyente(contribuyente);
            
            calculadora.calcular(impuesto);

        // 13. GeneradorQR - Usuario - CodigoQR
            
            CodigoQR codigoQR = new CodigoQR("asd");
            GeneradorQR generadorQR = new GeneradorQR(codigoQR);
            
            generadorQR.generar("Felipe", "email@example.com");
//            
            System.out.println(generadorQR);

        // 14. EditorVideo - Proyecto - Render
        
            Render render = new Render("mp4");
            EditorVideo editorVideo = new EditorVideo(render);
            
            editorVideo.exportar(render);
            
            System.out.println(editorVideo);
    }
}
