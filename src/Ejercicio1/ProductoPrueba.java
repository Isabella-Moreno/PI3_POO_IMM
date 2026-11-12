package Ejercicio1;

import java.util.Scanner;

public class ProductoPrueba {

    private Producto producto;
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        System.out.print("Stock inicial: ");
        int stock = sc.nextInt();

        producto = new Producto(nombre, precio, stock);
        producto.mostrarInfo();

        System.out.println("\nActualizando stock directamente (acceso de paquete)...");
        producto.stock += 10;
        producto.mostrarInfo();
    }
}