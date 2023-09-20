import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner inEntero = new Scanner(System.in);

        try {
            System.out.println("Ahora estamos por calcular la suma de los dígitos de un número");
            System.out.println("Por favor, ingresa un número entero: ");
            int numEntrada = inEntero.nextInt();

            int suma = 0;
            int numeroAbsoluto = Math.abs(numEntrada);

            while (numeroAbsoluto > 0) {
                int digito = numeroAbsoluto % 10;
                suma += digito;
                numeroAbsoluto /= 10;
            }

            System.out.println("La suma de los dígitos de " + numEntrada + " es " + suma);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Hubo un error, por favor ingresa un número entero.");
        } finally {
            inEntero.close();
        }
    }
}

