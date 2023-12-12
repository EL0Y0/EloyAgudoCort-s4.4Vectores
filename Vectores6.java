/**
 * programa que permita al usuario almacenar una secuencia aritmética en un array y
 * luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un
 * valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería
 * 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al
 * usuario V, I además de N (nº de valores a crear).
 * 
 * @author Eloy Agudo Cortés
 * 
 */

public class Vectores6 {
    public static void main(String[] args) {
        System.out.println("¿Cuántos valores quieres almacenar?");
        int N = Integer.parseInt(System.console().readLine());
        System.out.println("");
        System.out.println("Inserte un valor inicial: ");
        int V = Integer.parseInt(System.console().readLine());
        System.out.println("");
        System.out.println("Inserte el incremento: ");
        int I = Integer.parseInt(System.console().readLine());
        System.out.println("");
        int[] array = new int[N];
        array[0] = V;
        for (int posicion = 1; posicion < N; posicion++) {
            array[posicion] = V + I;
            V = V + I;
        }
        for (int posicion = 0; posicion < N; posicion++) {
            System.out.println(array[posicion]);
        }

    }
}
