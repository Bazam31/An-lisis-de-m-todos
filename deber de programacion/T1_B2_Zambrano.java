public class T1_B2_Zambrano {

    // Correccion 1: base llega como parametro (antes era local de main)
    static void calcularDoble(int base) {
        int resultado = base * 2;
        System.out.println("Doble de base: " + resultado);
    }

    public static void main(String[] args) {
        int base = 4;
        calcularDoble(base);

        // Correccion 2: i se declara ANTES del for para poder usarla despues
        int i;
        for (i = 1; i <= 3; i++) {
            int cuadrado = i * i;
            System.out.println("Cuadrado de " + i + ": " + cuadrado);
        }
        System.out.println("Ultimo i: " + i);

        // Correccion 3: mensaje se declara ANTES del if
        int mensaje = 0;
        if (base > 2) {
            mensaje = 100;
        }
        System.out.println("Mensaje: " + mensaje);
    }
}
