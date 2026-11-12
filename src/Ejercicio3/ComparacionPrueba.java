package Ejercicio3;

public class ComparacionPrueba {

    public void iniciar() {
        Persona p = new Persona("Isabella", 19);


        p.edad = 20;
        System.out.println("Edad (acceso directo default): " + p.edad);

        p.setNombre("Isabella Moreno");
        System.out.println("Nombre (acceso mediante getter): " + p.getNombre());

        System.out.println("\n--- DISCUSIÓN: PRIVATE VS DEFAULT ---");
        System.out.println("- private: Limita el acceso exclusivamente a la propia clase donde se declara. "
                + "Obliga a usar getters/setters incluso dentro del mismo paquete, garantizando encapsulamiento.");
        System.out.println("- default: Permite acceso directo desde cualquier clase que pertenezca al mismo paquete, "
                + "pero bloquea el acceso desde paquetes externos.");
    }
}