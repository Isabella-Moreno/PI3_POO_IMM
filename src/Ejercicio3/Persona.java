package Ejercicio3;

public class Persona {

    private String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        setNombre(nombre);
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }
}