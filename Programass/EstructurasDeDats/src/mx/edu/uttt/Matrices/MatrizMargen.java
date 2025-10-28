package mx.edu.uttt.Matrices;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MatrizMargen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la matriz (N): ");
        int N = scanner.nextInt();

        int[][] matriz = crearYllenarMatriz(N);

        System.out.println("\n--- Matriz Original (Relleno Aleatorio) ---");
        imprimirMatriz(matriz);

        // Convertir el margen a 1
        convertirMargenAUno(matriz);

        System.out.println("\n--- Matriz Final (Margen Convertido a 1) ---");
        imprimirMatriz(matriz);

        scanner.close();
    }


    public static int[][] crearYllenarMatriz(int N) {
        int[][] matriz = new int[N][N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Genera un número aleatorio entre 0 (incluido) y 10 (excluido)
                matriz[i][j] = random.nextInt(10);
            }
        }
        return matriz;
    }


    public static void convertirMargenAUno(int[][] matriz) {
        int N = matriz.length;

        // Un caso especial si N es 0 o 1, para evitar errores o bucles innecesarios
        if (N <= 1) {
            if (N == 1) matriz[0][0] = 1;
            return;
        }

        // Bucle para recorrer la matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    matriz[i][j] = 1;
                }
            }
        }
    }


    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
