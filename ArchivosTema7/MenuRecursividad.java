import java.util.Scanner;

public class MenuRecursividadCompleto {
    
    // Métodos para factorial
    public static long factorial(long n) {
        return n <= 1 ? 1 : n * factorial(n - 1);
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

    // Métodos para Fibonacci
    public static long fibonacci(long n) {
        return n <= 1 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

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

    // Métodos para suma de dígitos
    public static int sumaDigitos(int numero) {
        return numero < 10 ? numero : (numero % 10) + sumaDigitos(numero / 10);
    }

    public static void ejecutarSumaDigitos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== SUMA DE DÍGITOS ===");
        System.out.print("Ingrese un número entero positivo: ");
        
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            
            if (numero < 0) {
                System.out.println("Error: El número debe ser positivo.");
            } else {
                int resultado = sumaDigitos(numero);
                System.out.println("sumaDigitos(" + numero + ") -> " + resultado);
            }
        } else {
            System.out.println("Error: Ingrese un número válido.");
            scanner.next();
        }
    }

    // Métodos para inversión de cadena (CORREGIDO)
    public static String invertirCadena(String cadena) {
        if (cadena == null || cadena.length() <= 1) {
            return cadena;
        }
        return cadena.charAt(cadena.length() - 1) + 
               invertirCadena(cadena.substring(0, cadena.length() - 1));
    }

    public static void ejecutarInversionCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== INVERSIÓN DE CADENA ===");
        System.out.print("Ingresa una cadena de texto: ");
        
        // Limpiar el buffer del scanner antes de leer la cadena
        scanner.nextLine(); // Consumir el salto de línea pendiente
        
        String texto = scanner.nextLine();
        
        if (texto.isEmpty()) {
            System.out.println("Error: No se ingresó ninguna cadena.");
        } else {
            String textoInvertido = invertirCadena(texto);
            System.out.println("Texto original: " + texto);
            System.out.println("Texto invertido: " + textoInvertido);
        }
    }

    // Menú principal con recursión
    public static void mostrarMenu(Scanner scanner) {
        System.out.println("\n=== MENÚ DE RECURSIVIDAD ===");
        System.out.println("1. Calcular factorial");
        System.out.println("2. Calcular número de Fibonacci");
        System.out.println("3. Sumar dígitos");
        System.out.println("4. Inversión de cadena");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");

        if (scanner.hasNextInt()) {
            int opcion = scanner.nextInt();
            procesarOpcion(opcion, scanner);
        } else {
            System.out.println("Error: Ingrese un número válido.");
            scanner.next();
            mostrarMenu(scanner);
        }
    }

    public static void procesarOpcion(int opcion, Scanner scanner) {
        switch (opcion) {
            case 1:
                ejecutarFactorial();
                mostrarMenu(scanner);
                break;
            case 2:
                ejecutarFibonacci();
                mostrarMenu(scanner);
                break;
            case 3:
                ejecutarSumaDigitos();
                mostrarMenu(scanner);
                break;
            case 4:
                ejecutarInversionCadena();
                mostrarMenu(scanner);
                break;
            case 5:
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione 1, 2, 3, 4 o 5.");
                mostrarMenu(scanner);
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mostrarMenu(scanner);
        scanner.close();
    }
}
