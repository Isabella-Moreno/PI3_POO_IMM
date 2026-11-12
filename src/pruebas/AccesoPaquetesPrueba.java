package pruebas;

import vehiculos.Moto;
import vehiculos.Vehiculo;

public class AccesoPaquetesPrueba {

    public void iniciar() {
        Moto moto = new Moto("Deportiva", 250);

        // --- PRUEBA DE ERRORES DE COMPILACIÓN (DESCOMENTAR PARA OBSERVAR) ---
        // Error: 'Vehiculo(java.lang.String)' is not public in 'vehiculos.Vehiculo'. Cannot be accessed from outside package
        // Vehiculo v = new Vehiculo("Automóvil");

        // Error: 'tipo' is not public in 'vehiculos.Vehiculo'. Cannot be accessed from outside package
        // System.out.println(moto.tipo);

        // Error: 'cilindraje' is not public in 'vehiculos.Moto'. Cannot be accessed from outside package
        // System.out.println(moto.cilindraje);

        // Error: 'mostrarDetallesMoto()' is not public in 'vehiculos.Moto'. Cannot be accessed from outside package
        // moto.mostrarDetallesMoto();
        
        System.out.println("--- DISCUSIÓN EJERCICIO 2 ---");
        System.out.println("Aunque Vehiculo y Moto son clases public y se importaron correctamente, "
                + "sus atributos (tipo, cilindraje), el constructor de Vehiculo y sus métodos tienen modificador default.");
        System.out.println("Java restringe el acceso default estrictamente al mismo paquete ('vehiculos'), "
                + "por lo que cualquier acceso desde el paquete 'pruebas' genera error de compilación.");
    }
}