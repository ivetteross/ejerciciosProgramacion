import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inLongitud = new Scanner(System.in);

        try {
            System.out.println("Hola! Vamos a generar una secuencia de Fibonacci");
            System.out.print("Por favor, indica la longitud que deseas que tenga la secuencia de Fibonacci: ");
            int n = inLongitud.nextInt();

            int primerNumero = 0;
            int segundoNumero = 1;

            for (int i = 0; i < n; i++) {
                System.out.print(primerNumero + " ");

                int siguienteNumero = primerNumero + segundoNumero;
                primerNumero = segundoNumero;
                segundoNumero = siguienteNumero;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Hubo un error, por favor ingresa un número entero.");
        } finally {
            inLongitud.close();
        }
    }
}

