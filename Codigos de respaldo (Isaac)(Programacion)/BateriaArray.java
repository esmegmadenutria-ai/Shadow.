import java.util.Scanner;

public class BateriaArray {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // Ejercicio1();
        // Ejercicio2();
        Ejercicio3();
    }

    /*
     * Crea un programa que pida diez números reales por teclado, los almacene en un
     * array, y
     * luego muestre todos sus valores.
     */
    public static void Ejercicio1() {

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Dime el numero " + (i + 1));

            numeros[i] = teclado.nextInt();

        }

        System.out.println("\nLos valores introducidos son:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i] + " ");
        }
        System.out.println();

    }

    /*
     * Crea un programa que pida diez números reales por teclado, los almacene en un
     * array, y
     * luego muestre la suma de todos los valores.
     */

    public static void Ejercicio2() {

        int[] numeros = new int[10];

        int suma = 0; // Declaro la suma

        // Pido los numeros

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Dame el numero " + (i + 1) + " que quieres que sume ");

            numeros[i] = teclado.nextInt();
        }
        System.out.println("\nLos numeros que se han sumado son : ");

        // Hago la suma y la muestro por pantalla

        for (int i = 0; i < numeros.length; i++) {

            suma = suma + numeros[i];
        }
        System.out.println("La suma es: " + suma);
    }

    public static void Ejercicio3() {

    }

}
