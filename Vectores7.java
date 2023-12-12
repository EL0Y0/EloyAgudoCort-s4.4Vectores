/**
 * programa que cree un array de enteros e introduzca la siguiente secuencia de
 * valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
 * muestre por pantalla.
 */

public class Vectores7 {
    public static void main(String[] args) {
        int[] secuencia = new int[55];
        int valor = 0;
        int posicion = 0;
        System.out.println("");
        System.out.println("");
        for (int numero = 0; numero < 11; numero++) {
            for (int contador = 0; contador<numero; contador++) {
                secuencia[posicion] = valor;
                posicion++;
            }
            valor++;
        }
        for (int contador = 0; contador < 55; contador++) {
            System.out.print(secuencia[contador] + " ");
        }
        System.out.println("");
        System.out.println("");
    }
}
