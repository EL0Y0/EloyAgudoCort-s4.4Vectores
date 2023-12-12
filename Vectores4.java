/**
 * programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
 * primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
 * primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
 * @author Eloy Agudo Cortés
 */

public class Vectores4 {
    public static void main(String[] args) {
        int[] array1 = new int[100];
        int[] array2 = new int[100];
        for (int posicion = 0; posicion<100; posicion++) {
            array1[posicion] = posicion+1;
        }
        for (int posicion = 0; posicion<100; posicion++) {
            array2[posicion] = array1[99-posicion];
        }
        for (int posicion = 0; posicion<100; posicion++) {
            System.out.println(array1[posicion]);
        }
        System.out.println("");
        System.out.println("");
        for (int posicion = 0; posicion<100; posicion++) {
            System.out.println(array2[posicion]);
        }
    }
}
