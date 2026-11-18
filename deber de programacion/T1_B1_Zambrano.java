public class T1_B1_Zambrano {

    static void cambiarEntero(int n) {
        n = n + 10;
        System.out.println("  Dentro de cambiarEntero: n = " + n);
    }

    static void cambiarArreglo(int[] datos) {
        datos[0] = datos[0] + 10;
        System.out.println("  Dentro de cambiarArreglo: datos[0] = " + datos[0]);
    }

    public static void main(String[] args) {
        int numero = 5;
        int[] notas = { 5, 20, 30 };

        System.out.println("Antes:   numero = " + numero + ", notas[0] = " + notas[0]);
        cambiarEntero(numero);
        cambiarArreglo(notas);
        System.out.println("Despues: numero = " + numero + ", notas[0] = " + notas[0]);
    }
}
