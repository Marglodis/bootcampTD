package session4;

import java.util.Scanner;

public class Evaluacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auto auto = null;

        while (true) {
            // Menú
            System.out.println("\n *** Menú de Opciones ***");
            System.out.println("1. Crear Auto");
            System.out.println("2. Encender Auto");
            System.out.println("3. Apagar Auto");
            System.out.println("4. Acelerar Auto");
            System.out.println("5. Ver Datos del Auto");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Crear un nuevo auto
                    System.out.print("Introduce la marca del auto: ");
                    String marca = scanner.next();
                    System.out.print("Introduce el modelo del auto: ");
                    String modelo = scanner.next();
                    System.out.print("Introduce el color del auto: ");
                    String color = scanner.next();
                    System.out.print("Introduce la velocidad máxima del auto (km/h): ");
                    int velocidadMaxima = scanner.nextInt();

                    // Crear el objeto Auto
                    auto = new Auto(marca, modelo, color, velocidadMaxima);
                    System.out.println("\nFelicidades por su nuevo auto !!!");
                    auto.mostrarDatos();
                    break;

                case 2:
                    // Encender el auto
                    if (auto != null) {
                        auto.encender();
                    } else {
                        System.out.println("Primero debes crear un auto.");
                    }
                    break;

                case 3:
                    // Apagar el auto
                    if (auto != null) {
                        auto.apagar();
                    } else {
                        System.out.println("Primero debes crear un auto.");
                    }
                    break;

                case 4:
                    // Acelerar el auto
                    if (auto != null) {
                        auto.acelerar();
                    } else {
                        System.out.println("Primero debes crear un auto.");
                    }
                    break;

                case 5:
                    // Ver datos del auto
                    if (auto != null) {
                        auto.mostrarDatos();
                    } else {
                        System.out.println("Primero debes crear un auto.");
                    }
                    break;

                case 6:
                    // Salir
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
}
