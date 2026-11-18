import java.util.Scanner;

public class T1_Reto_Zambrano {

    static int contarDigitos(int n) {
        int cantidad = 0;
        do {
            cantidad++;
            n = n / 10;
        } while (n > 0);
        return cantidad;
    }

    // Proposito: calcular base elevada a exponente usando un ciclo
    static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }

    // Proposito: decir si un numero es de Armstrong
    static boolean esArmstrong(int n) {
        int cantidad = contarDigitos(n);
        int suma = 0;
        int copia = n;
        while (copia > 0) {
            int digito = copia % 10;
            suma = suma + potencia(digito, cantidad);
            copia = copia / 10;
        }
        return suma == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int numero = sc.nextInt();

        if (esArmstrong(numero)) {
            System.out.println(numero + " SI es un numero de Armstrong.");
        } else {
            System.out.println(numero + " NO es un numero de Armstrong.");
        }
        sc.close();
    }
}
