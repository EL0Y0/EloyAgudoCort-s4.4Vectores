/**
 * programa que cree un array de enteros de tamaño 100 y lo rellene con valores
 * enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
 * mostrará en qué posiciones del array aparece N
 * @author Eloy Agudo Cortés
 */

public class Vectores2 {
    public static void main(String[] args) {
        int[] arrayDeEnteros = new int[100];
        for (int valor=0; valor<100; valor++) {
            (arrayDeEnteros[valor]) = (int)(1+Math.random()*10);
        } 
        System.out.println("Introduce un número");
        System.out.println("");
        int N = Integer.parseInt(System.console().readLine());
        System.out.println("Posiciones del array en los que aparece tu número: ");
        for (int posicion = 0; posicion<100; posicion++) {
            if (arrayDeEnteros[posicion] == N) {
                System.out.println(posicion);
            }
        }
    }
}
