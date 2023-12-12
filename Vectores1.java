/**
 * programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
 * utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
 * cuántos valores del array son igual o superiores a R
 * @author Eloy Agudo Cortés
 */

public class Vectores1 {
    public static void main(String[] args) {
        double[]  numerosAleatiorios = new double[100];
        for (int contador = 0; contador<100; contador++) {
            numerosAleatiorios[contador] = Math.random();
        }
        System.out.println(" Tengo una lista mágca de valores menores que 1. Introduce un valor real y te digo cuántos hay que sean mayores o iguales al que tu has dicho.");
        double R = Double.parseDouble(System.console().readLine());
        int superiorOIgual = 0;
        for (int posicion = 0; posicion<100; posicion++) {
            if (numerosAleatiorios[posicion]>= R) {
                superiorOIgual++;
            }
        }
        System.out.println("Número de valores superiores o iguales a " + R + ": " + superiorOIgual);
    }
}
 