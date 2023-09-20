import java.util.Scanner;

public class MinimoTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Hola! Vamos a encontrar el mínimo de tres números");
            
            System.out.print("Ingresa el primer número: ");
            int numUno = scanner.nextInt();

            System.out.print("Ingresa el segundo número: ");
            int numDos = scanner.nextInt();

            System.out.print("Ingresa el tercer número: ");
            int numTres = scanner.nextInt();

            int minimo = numUno;

            if (numDos < minimo) {
                minimo = numDos;
            }
            if (numTres < minimo) {
                minimo = numTres;
            }

            System.out.println("El mínimo de " + numUno + ", " + numDos + " y " + numTres + " es " + minimo);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Hubo un error, por favor ingresa un número entero.");
        } finally {
            scanner.close();
        }
    }
}
