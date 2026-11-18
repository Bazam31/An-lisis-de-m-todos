public class T1_A_Zambrano {

    // Recibe un numero y devuelve el doble
    static int duplicar(int x) {
        System.out.println("    duplicar recibe " + x);
        return x * 2;
    }

    // Duplica a y b, y devuelve la suma de los dobles
    static int sumarDuplicados(int a, int b) {
        System.out.println("  sumarDuplicados inicia con a=" + a + " y b=" + b);
        int da = duplicar(a);
        int db = duplicar(b);
        int total = da + db;
        System.out.println("  sumarDuplicados termina con total=" + total);
        return total;
    }

    // Muestra un valor en pantalla (no devuelve nada)
    static void mostrar(int valor) {
        System.out.println("  mostrar: el valor es " + valor);
    }

    public static void main(String[] args) {
        System.out.println("main inicia");
        int r = sumarDuplicados(3, 5);
        mostrar(r);
        mostrar(duplicar(r));
        System.out.println("main termina");
    }
}
