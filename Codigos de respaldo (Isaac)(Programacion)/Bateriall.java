import java.util.Scanner;

public class Bateriall {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // Ejercicio1();
        // Ejercicio2();
        // Ejercicio3();
        // Ejercicio4();
        // Ejercicio5();
        // Ejercicio6();
        // Ejercicio7();
        // Ejercicio8();
        // Ejercicio9();
        // Ejercicio10();
        // Ejercicio11();
        // Ejercicio12();
        // Ejercicio13();
        // Ejercicio14();

        teclado.close();
    }
    /*
     * Realiza un programa que muestre por pantallalos 20 primeros números
     * naturales (1, 2, 3... 20).
     */

    public static void Ejercicio1() {

        int contador = 1;

        while (contador <= 20) {

            if (contador == 20) {

                System.out.println(contador + ".");

            } else {
                System.out.print(contador + ", ");
            }

            contador++;
        }
    } // Fin Ejercicio1.

    /*
     * Realiza un programa que muestre los números pares comprendidos entre el 1 y
     * el 200. Para ello
     * utiliza un contador y suma de 2 en 2.
     */
    public static void Ejercicio2() {

        int contador = 0;

        while (contador <= 200) {

            System.out.print(contador);

            contador = contador + 2;
        }
    } // Fin Ejercicio2.

    /*
     * Realiza un programa que muestre los números pares comprendidos entre el 1 y
     * el 200. Esta vez
     * utiliza un contador sumando de 1 en 1.
     */

    public static void Ejercicio3() {

        int contador = 0;

        while (contador <= 200) {

            System.out.println(contador);

            contador = contador + 1;
        }
    }// Fin Ejercicio3.

    /*
     * Realiza un programa que muestre los números desde el 1 hasta un número N que
     * se introducirá
     * por teclado.
     */
    public static void Ejercicio4() {

        int contador = 1;

        System.out.println(" Dime un numero para realizar la accion: ");

        double Numero = teclado.nextInt(); /* Hago que el usuario me de un numero */

        while (contador <= Numero) {

            System.out.println(contador);/* Me muestra por consola el contador */

            contador++;

        }

    }// Fin Ejercicio4

    /*
     * Realiza un programa que lea un número positivo N y calcule y visualice su
     * factorial N!
     * Siendo el factorial:
     * 0! = 1
     * 1! = 1
     * 2! = 2 * 1
     * 3! = 3 * 2* 1
     * N! = N * (N-1) * (N-2)........* 3*2*1
     */

    public static void Ejercicio5() {

        int factorial = 4;

        int resultado = 1;

        if (factorial > 0) {

            for (int contador = factorial; contador >= 1; contador--) {

                resultado = resultado * contador;
                if (contador == 1) {

                    System.out.println("El factorial " + factorial + " es igual " + resultado);

                }
            }
        }
    }

    /*
     * Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de
     * si ha leído
     * algún número negativo o no.
     */

    public static void Ejercicio6() {

        boolean hayNegativo = false;

        for (int i = 0; i < 10; i++) {

            System.out.println("Dime el numero " + (i + 1));

            int numero = teclado.nextInt();
            teclado.nextLine();

            if (numero < 0) {
                hayNegativo = true;
            }
        }
        if (hayNegativo) {

            System.out.println("Hay algún negativo");

        } else {
            System.out.println("No hay ningún numero negativo");

        }
    }

    /*
     * Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
     * indicando
     * cuántos son positivos y cuantos negativos.
     */

    public static void Ejercicio7() {

        boolean hayNegativo = false;

        for (int i = 0; i < 10; i++) {

            System.out.println("Dime el numero " + (i + 1));

            int numero = teclado.nextInt();
            teclado.nextLine();

            if (numero < 0) {
                hayNegativo = true;
            }
        }
        if (hayNegativo) {

            System.out.println("Hay algún negativo");

        } else {
            System.out.println("No hay ningún numero negativo");

        }
    }

    /*
     * Realiza un programa que lea una secuencia de números no nulos hasta que se
     * introduzca un 0, y
     * luego muestre si ha leído algún número negativo, cuantos positivos y cuantos
     * negativos.
     */
    public static void Ejercicio8() {

        boolean hayNegativo = false;

        for (int i = 0; i < 10; i++) {

            System.out.println("Dime el numero " + (i + 1));

            int numero = teclado.nextInt();
            teclado.nextLine();

            if (numero < 0) {
                hayNegativo = true;
            }
        }
        if (hayNegativo) {

            System.out.println("");

        } else {
            System.out.println("No se ha leido ningún numero negativo");

        }
    }

    /*
     * Realiza un programa que calcule y escriba la suma y el producto de los 10
     * primeros números
     * naturales.
     */

    public static void Ejercicio9() {

        int i = 1;

        int suma = 0;

        int producto = 1;

        for (i = 1; i <= 10; i++) {

            suma = suma + i;
            System.out.println(" La suma de " + i + " es " + suma);
            producto = producto * i;
        }

        System.out.println(" El producto de " + suma + " es " + producto);
    }

    /*
     * Realiza un programa que lea una secuencia de notas (con valores que van de 0
     * a 10) quetermina con el valor -1 y nos dice si hubo o no alguna nota con
     * valor 10
     */

   /* public static void Ejercicio10() {

        System.out.println("Dame las notas");

        int notas = teclado.nextInt();
        teclado.nextLine();


        boolean diez= false;

        boolean negativo = false;

        if (negativo){

            System.out.println("No has introducido ninguna nota valor 10");
            
        } else if (diez){

            System.out.println("HAY UN DIEZ");

        }
        


    } */

}
    