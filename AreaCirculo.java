import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        // Ejercicio 1: Calcular el área de un círculo
        System.out.println("Hola! Vamos a calcular el área de un círculo");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("¿Cuántos cm mide el radio del círculo? ");
            double radio = scanner.nextDouble();

            double pi = Math.PI;

            double area = pi * Math.pow(radio, 2);
            System.out.println("El círculo tiene un radio de " + radio + " cm , por lo tanto su área es de " + area + " cm².");
        } catch (Exception err) {
            System.out.println("Hubo un error, introduce un número válido.");
        } finally {
            scanner.close();
        }
    }
}