import java.util.Scanner;

public class Codigo_07_01 {
    /**
     * Funcion factorial de manera recursiva.
     * 
     * @param n valor a obtener factorial
     * @return factorial de n
     */
    public static long factorial(long n) {
        long result = 1;
        if (n <= 1) {
            result = 1;
        } else {

            result = n * factorial(n - 1);
        }
        return result;
    }

    public static void ejecutarFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        long num = scanner.nextLong();
        if (num < 0) {
            System.out.println("Error: El factorial no está definido para números negativos.");
        } else {
            System.out.println("Factorial de " + num + " = " + factorial(num));
        }
    }

    public static void main(String[] args) {

        System.out.println("Factorial de 7 = " + factorial(7));
    }
}
