import java.util.Locale;
import java.util.Scanner;

public class T1_C3_Zambrano {

    // Proposito: calcular el volumen de un cubo (1 dato: lado).
    static double volumen(double lado) {
        return lado * lado * lado;
    }

    // Proposito: calcular el volumen de un cilindro (2 datos: radio y altura).
    static double volumen(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }

    // Proposito: calcular el volumen de un prisma rectangular (3 datos: largo,
    // ancho y alto).
    static double volumen(double largo, double ancho, double alto) {
        return largo * ancho * alto;
    }

    // Proposito: mostrar las opciones del menu.
    static void mostrarMenu() {
        System.out.println();
        System.out.println("===== CALCULO DE VOLUMENES =====");
        System.out.println("1. Cubo");
        System.out.println("2. Cilindro");
        System.out.println("3. Prisma rectangular");
        System.out.println("4. Salir");
        System.out.print("Elija una opcion: ");
    }

    // Proposito: pedir un numero mayor que 0 y repetir hasta que sea valido.
    static double leerPositivo(Scanner sc, String nombre) {
        double valor;
        do {
            System.out.print("Ingrese " + nombre + ": ");
            valor = sc.nextDouble();
            if (valor <= 0) {
                System.out.println("Error: debe ser mayor que 0.");
            }
        } while (valor <= 0);
        return valor;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // para que el punto sea el separador decimal
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            if (opcion == 1) {
                double lado = leerPositivo(sc, "el lado");
                System.out.printf("Volumen del cubo: %.2f%n", volumen(lado));
            } else if (opcion == 2) {
                double radio = leerPositivo(sc, "el radio");
                double altura = leerPositivo(sc, "la altura");
                System.out.printf("Volumen del cilindro: %.2f%n", volumen(radio, altura));
            } else if (opcion == 3) {
                double largo = leerPositivo(sc, "el largo");
                double ancho = leerPositivo(sc, "el ancho");
                double alto = leerPositivo(sc, "el alto");
                System.out.printf("Volumen del prisma: %.2f%n", volumen(largo, ancho, alto));
            } else if (opcion != 4) {
                System.out.println("Opcion no valida.");
            }
        } while (opcion != 4);

        System.out.println("Programa terminado.");
        sc.close();
    }
}
