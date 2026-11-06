import java.util.Scanner;

public class EjerciciosNOV {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer datos del teclado
        Scanner teclado = new Scanner(System.in);
        
        // Captura del número por teclado
        System.out.print("Introduce el número del que deseas practicar la tabla: ");
        int numero = teclado.nextInt();
        
        System.out.println("\n¡Comenzamos con la tabla del " + numero + "!");
        System.out.println("---------------------------------------");
        
        // Bucle para recorrer la tabla del 1 al 10
        for (int i = 1; i <= 10; i++) {
            // Calcular el resultado real
            int resultadoCorrecto = numero * i;
            
            // Hacer la pregunta al usuario
            System.out.print("¿Cuánto es " + numero + " x " + i + "? ");
            int respuestaUsuario = teclado.nextInt();
            
            // Validar si la respuesta es correcta
            if (respuestaUsuario == resultadoCorrecto) {
                System.out.println("¡Correcto! ¡Muy bien!");
            } else {
                System.out.println("Incorrecto. El resultado real es: " + resultadoCorrecto);
            }
            
            System.out.println("---------------------------------------");
        }
        
        System.out.println("¡Has terminado de practicar la tabla del " + numero + "!");
        
        // Cerrar el scanner para liberar recursos
        teclado.close();
    }
}
