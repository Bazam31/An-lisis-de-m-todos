import java.util.Locale;
import java.util.Scanner;

public class T1_C1_Zambrano {

    static final double CARGO_FIJO = 2.00;

    // Proposito: pedir el consumo en m3 y repetir hasta que sea mayor o igual a 0.
    static int leerConsumo(Scanner sc) {
        int consumo;
        do {
            System.out.print("Consumo del mes (m3): ");
            consumo = sc.nextInt();
            if (consumo < 0) {
                System.out.println("Error: el consumo no puede ser negativo.");
            }
        } while (consumo < 0);
        return consumo;
    }

    // Proposito: calcular el valor del agua por tramos (sin cargo fijo).
    // Tramo 1: 1 a 15 m3 -> $0.40 | Tramo 2: 16 a 30 m3 -> $0.60 | Tramo 3: mas de
    // 30 m3 -> $0.90
    static double calcularValorAgua(int m3) {
        double valor;
        if (m3 <= 15) {
            valor = m3 * 0.40;
        } else if (m3 <= 30) {
            valor = 15 * 0.40 + (m3 - 15) * 0.60;
        } else {
            valor = 15 * 0.40 + 15 * 0.60 + (m3 - 30) * 0.90;
        }
        return valor;
    }

    // Proposito: sumar el cargo fijo al valor del agua y devolver el total a pagar.
    static double calcularTotal(double valorAgua) {
        return valorAgua + CARGO_FIJO;
    }

    // Proposito: mostrar la planilla completa en pantalla.
    static void mostrarPlanilla(int m3, double valorAgua, double total) {
        System.out.println("----- PLANILLA DE AGUA -----");
        System.out.println("Consumo:      " + m3 + " m3");
        System.out.printf("Valor agua:   $%.2f%n", valorAgua);
        System.out.printf("Cargo fijo:   $%.2f%n", CARGO_FIJO);
        System.out.printf("TOTAL A PAGAR: $%.2f%n", total);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m3 = leerConsumo(sc);
        double valorAgua = calcularValorAgua(m3);
        double total = calcularTotal(valorAgua);
        mostrarPlanilla(m3, valorAgua, total);

        sc.close();
    }
}
