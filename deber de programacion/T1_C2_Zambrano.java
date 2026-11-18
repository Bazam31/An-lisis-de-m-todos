import java.util.Locale;
import java.util.Scanner;

public class T1_C2_Zambrano {

    // Proposito: pedir una nota entre 0 y 20 y repetir hasta que sea valida.
    static double leerNota(Scanner sc, String nombre) {
        double nota;
        do {
            System.out.print("Ingrese " + nombre + " (0 a 20): ");
            nota = sc.nextDouble();
            if (nota < 0 || nota > 20) {
                System.out.println("Error: la nota debe estar entre 0 y 20.");
            }
        } while (nota < 0 || nota > 20);
        return nota;
    }

    // Proposito: calcular el promedio de tres notas.
    static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    // Proposito: decidir el estado: APROBADO (>= 14), SUPLETORIO (>= 8 y < 14) o
    // REPROBADO (< 8).
    static String determinarEstado(double promedio) {
        String estado;
        if (promedio >= 14) {
            estado = "APROBADO";
        } else if (promedio >= 8) {
            estado = "SUPLETORIO";
        } else {
            estado = "REPROBADO";
        }
        return estado;
    }

    // Proposito: calcular la nota minima del supletorio para aprobar.
    // Regla: (promedio + supletorio) / 2 debe ser >= 14, entonces supletorio >= 28
    // - promedio.
    static double notaMinimaSupletorio(double promedio) {
        return 28 - promedio;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // para que el punto sea el separador decimal
        Scanner sc = new Scanner(System.in);

        double n1 = leerNota(sc, "nota 1");
        double n2 = leerNota(sc, "nota 2");
        double n3 = leerNota(sc, "nota 3");

        double promedio = calcularPromedio(n1, n2, n3);
        String estado = determinarEstado(promedio);

        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Estado: " + estado);

        if (estado.equals("SUPLETORIO")) {
            double minima = notaMinimaSupletorio(promedio);
            System.out.printf("Nota minima en el supletorio para aprobar: %.2f%n", minima);
        }

        sc.close();
    }
}
