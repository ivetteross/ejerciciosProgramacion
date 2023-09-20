import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner inNumero = new Scanner(System.in);

        try {
            System.out.println("Ahora vamos a verificar si un número es positivo, negativo o cero");
            System.out.print("Ingresa el número a verificar: ");
            double m = inNumero.nextDouble();

            if (m > 0) {
                System.out.println(m + " es un número positivo.");
            } else if (m < 0) {
                System.out.println(m + " es un número negativo.");
            } else {
                System.out.println(m + " es igual a cero.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Hubo un error, por favor ingresa un número válido.");
        } finally {
            inNumero.close();
        }
    }
}
