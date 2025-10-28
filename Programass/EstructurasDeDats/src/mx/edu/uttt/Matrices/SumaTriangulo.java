package mx.edu.uttt.Matrices;

import java.util.Random;
import java.util.Scanner;

public class SumaTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la matriz cuadrada (N): ");
        int N = scanner.nextInt();

        if (N <= 1) {
            System.out.println("El tamaño debe ser mayor a 1 para formar triángulos.");
            scanner.close();
            return;
        }

        int[][] matriz = crearYllenarMatriz(N);

        System.out.println("\n--- Matriz Generada ---");
        imprimirMatriz(matriz);

        calcularYSumarTriangulos(matriz);

        scanner.close();
    }


    public static int[][] crearYllenarMatriz(int N) {
        int[][] matriz = new int[N][N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = random.nextInt(9) + 1;
            }
        }
        return matriz;
    }


    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) { // Bucle for-each para filas
            for (int elemento : fila) { // Bucle for-each para elementos
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }



    public static void calcularYSumarTriangulos(int[][] matriz) {
        long sumaSuperior = 0;
        long sumaInferior = 0;
        long sumaDiagonal = 0;

        int N = matriz.length;

        // Recorre la matriz
        for (int i = 0; i < N; i++) { // Filas
            for (int j = 0; j < N; j++) { // Columnas

                // La diagonal principal es donde el índice de fila (i) es igual al de columna (j)
                if (i == j) {
                    sumaDiagonal += matriz[i][j];
                }
                // La región superior (arriba) es donde el índice de fila (i) es menor que el de columna (j)
                else if (i < j) {
                    sumaSuperior += matriz[i][j];
                }
                // La región inferior (abajo) es donde el índice de fila (i) es mayor que el de columna (j)
                else if (i > j) {
                    sumaInferior += matriz[i][j];
                }
            }
        }

        System.out.println("\n--- Resultados de la Suma ---");
        System.out.println("Suma de la región SUPERIOR (Arriba de la diagonal): " + sumaSuperior);
        System.out.println("Suma de la región INFERIOR (Abajo de la diagonal): " + sumaInferior);
    }
}