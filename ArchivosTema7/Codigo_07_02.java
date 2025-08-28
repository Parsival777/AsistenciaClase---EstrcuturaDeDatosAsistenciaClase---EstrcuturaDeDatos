import java.util.Scanner;

public class Codigo_07_02 {
    /**
     * Función de Fibonacci de manera recursiva.
     * 
     * @param n la posición de número fibonacci a buscar
     * @return el n-ésimo número de Fibonacci
     */
    public static long fibonacci(long n) {
        long result = 1;
        if (n <= 1) {
            result = n;
        } else {

            result = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return result;
    }

    /**
     * Método para ejecutar el cálculo de Fibonacci desde menú
     */
    public static void ejecutarFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición del número de Fibonacci: ");
        long num = scanner.nextLong();
        if (num < 0) {
            System.out.println("Error: La posición debe ser un número no negativo.");
        } else {
            System.out.println("Fibonacci en posición " + num + " = " + fibonacci(num));
        }
    }

    public static void main(String[] args) {

        System.out.println("Fibonacci de 12 = " + fibonacci(12));
    }
}