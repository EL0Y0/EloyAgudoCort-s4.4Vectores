/**
 * programa que cree un array de 10 enteros y luego muestre el siguiente menú
 * con
 * distintas opciones:
 * a. Mostrar valores.
 * b. Introducir valor.
 * c. Salir.
 * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá
 * un valor V y una
 * posición P, luego escribirá V en la posición P del array. El menú se repetirá
 * indefinidamente
 * hasta que el usuario elija la opción ‘c’ que terminará el programa.
 * 
 * @author Eloy Agudo Cortés
 * 
 */
public class Vectores5 {
    public static void main(String[] args) {
        int[] array =new int[10];
        char opcion ='a';
        while (opcion != 'c') {
            System.out.println("");
            System.out.println("Elige una opción:");
            System.out.println("    a. Mostrar valores");
            System.out.println("    b. Introducir valores");
            System.out.println("    c. Salir");
            System.out.println("");
            opcion = System.console().readLine().charAt(0);
            if (opcion=='a') {
                System.out.println("");
                for (int posicion = 0; posicion<10; posicion++) {
                    System.out.println(array[posicion]);
                }
            } else if (opcion=='b') {
                System.out.println("");
                System.out.println("Introduce una posición (0-9).");
                int P = Integer.parseInt(System.console().readLine());
                System.out.println("");
                System.out.println("Inserte el valor de la posición " + P);
                int V = Integer.parseInt(System.console().readLine());
                array[P] = V;
            }
        }
    }
}
