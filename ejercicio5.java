//Ejercicio 5: Escribe un programa que pida 10 números por teclado y que luego muestre los números
// introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.

import java.util.Scanner;   //importamos la clase Scanner para poder introducir datos por teclado

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] tabla = new int[10];  //Creamos una tabla de enteros que almacenará 10 valores

        // Pedir 10 números por teclado con un bucle for que recorre todas las posiciones de la tabla
        System.out.println("Te voy a pedir 10 números.");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tabla[i] = teclado.nextInt();   //Se introduce cada valor desde consola en una posición de la tabla
        }


        int maximo = tabla[0];  //Es inicializan dos variables de entero con la posición 0 de la tabla
        int minimo = tabla[0];

        for (int i = 1; i < 10; i++) {  //Se recorre la tabla comparando cada posición con la 0 para hallar el mínimo y el máximo
            if (tabla[i] > maximo) {
                maximo = tabla[i];
            }
            if (tabla[i] < minimo) {
                minimo = tabla[i];
            }
        }

        // Mostrar los números introducidos con las palabras "máximo" y "mínimo"
        System.out.println("Números introducidos:");
        for (int i = 0; i < 10; i++) {
            System.out.print(tabla[i]);         //con print para imprimir "máximo" y "mínimo" junto al valor
            if (tabla[i] == maximo) {
                System.out.print(" (máximo)");
            }
            else if (tabla[i] == minimo) {
                System.out.print(" (mínimo)");
            }
            System.out.println();   //println para que cada número se muestre debajo del anterior
        }

    }
}
