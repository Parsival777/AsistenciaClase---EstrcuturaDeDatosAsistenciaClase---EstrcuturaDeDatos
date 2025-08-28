import java.util.Scanner;

public class MenuRecursividad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n=== MENÚ DE RECURSIVIDAD ===");
            System.out.println("1. Calcular factorial");
            System.out.println("2. Calcular número de Fibonacci");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Codigo_07_01.ejecutarFactorial();
                    break;

                case 2:
                    Codigo_07_02.ejecutarFibonacci();
                    break;

                case 3:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione 1, 2 o 3.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}