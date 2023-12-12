/**
 * programa para realizar cálculos relacionados con la altura (en metros) de personas.
 * Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
 * mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
 * por debajo de la media.
 * @author Eloy Agudo Cortés
 */

public class Vectores3 {
    public static void main(String[] args) {
        System.out.println("¿Cuántas alturas quieres almacenar?");
        int N = Integer.parseInt(System.console().readLine());
        double[] listaDeAlturas = new double[N];
        double suma=0;
        double maxima=0;
        double minima=N;
        //Este for te pide por teclado las alturas y ya asigna cual es la máxima y la mínima
        //También va sumando los valores para calcular después la media
        for (int posicion = 0; posicion < N; posicion++) {
            System.out.println("");
            System.out.println("Introduce una altura ("+(posicion+1)+"/"+N+")");
            listaDeAlturas[posicion] = Double.parseDouble(System.console().readLine());
            suma=listaDeAlturas[posicion]+suma;
            if (listaDeAlturas[posicion]> maxima) {
                maxima = listaDeAlturas[posicion]; 
            }
            if (listaDeAlturas[posicion]<minima) {
                minima = listaDeAlturas[posicion];
            }
        }
        double media = suma/N;
        
        System.out.println("");
        System.out.println("La altura media es " + media);
        System.out.println("La altura maxima es " + maxima);
        System.out.println("La altura minima es " + minima);
        System.out.println("");
        System.out.println("Alturas por encima de la media: ");
        //Este for comprueba qué alturas están por encima de la media una vez ya calculada
        for (int posicion = 0; posicion < N; posicion++) {
            if (listaDeAlturas[posicion] > media) {
                System.out.println(listaDeAlturas[posicion]);
            }
        }
        System.out.println("");
        System.out.println("Alturas por debajo de la media: ");
        //Este for comprueba qué alturas están por debajo de la media 
        for (int posicion = 0; posicion < N; posicion++) {
            if (listaDeAlturas[posicion] < media) {
                System.out.println(listaDeAlturas[posicion]);
            }
        }
    }
}
