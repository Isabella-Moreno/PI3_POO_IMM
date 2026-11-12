package vehiculos;

public class Moto extends Vehiculo {

    int cilindraje;

    public Moto(String tipo, int cilindraje) {
        super(tipo);
        this.cilindraje = cilindraje;
    }

    void mostrarDetallesMoto() {
        System.out.println("Tipo: " + tipo + " | Cilindraje: " + cilindraje + " cc");
    }
}