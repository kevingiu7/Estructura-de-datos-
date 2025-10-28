package mx.edu.uttt.Matrices;

import java.util.Random;

public class Calificaciones {

    // Constantes para hacer el código más legible
    private static final int ALUMNOS = 3;
    private static final int MATERIAS = 3;

    public static void main(String[] args) {

        // Nombres para las filas y columnas para mejor visualización
        String[] nombresAlumnos = {"Ana", "Beto", "Carlos"};
        String[] nombresMaterias = {"Matemáticas", "Historia", "Física"};

        // 1. Declaración de la Matriz y Vectores
        int[][] calificaciones = new int[ALUMNOS][MATERIAS];
        double[] promedioAlumnos = new double[ALUMNOS]; // Vector para promedios de alumnos
        double[] promedioMaterias = new double[MATERIAS]; // Vector para promedios de materias

        // 2. Llenar la matriz aleatoriamente (Método RANDOM)
        llenarMatrizAleatoria(calificaciones);

        // 3. Calcular promedios y almacenarlos en los vectores
        calcularPromedios(calificaciones, promedioAlumnos, promedioMaterias);

        // 4. Mostrar todo en formato de tabla
        mostrarResultado(calificaciones, promedioAlumnos, promedioMaterias, nombresAlumnos, nombresMaterias);
    }

    // --------------------------------------------------------------------------
    // MÉTODOS DE LLENADO Y CÁLCULO
    // --------------------------------------------------------------------------

    /**
     * Llena la matriz con números aleatorios enteros del 1 al 10.
     */
    public static void llenarMatrizAleatoria(int[][] matriz) {
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Genera un número del 1 (incluido) al 11 (excluido)
                matriz[i][j] = rand.nextInt(10) + 1;
            }
        }
    }

    /**
     * Calcula los promedios de cada alumno y cada materia, almacenándolos en sus
     * respectivos vectores.
     */
    public static void calcularPromedios(int[][] calificaciones, double[] promAlum, double[] promMat) {

        // I. Cálculo del promedio de cada Alumno (Recorrido por filas)
        for (int i = 0; i < ALUMNOS; i++) {
            double sumaFila = 0;
            for (int j = 0; j < MATERIAS; j++) {
                sumaFila += calificaciones[i][j];
            }
            // Almacena el promedio de la fila (Alumno i) en el vector
            promAlum[i] = sumaFila / MATERIAS;
        }

        // II. Cálculo del promedio de cada Materia (Recorrido por columnas)
        for (int j = 0; j < MATERIAS; j++) {
            double sumaColumna = 0;
            for (int i = 0; i < ALUMNOS; i++) {
                sumaColumna += calificaciones[i][j];
            }
            // Almacena el promedio de la columna (Materia j) en el vector
            promMat[j] = sumaColumna / ALUMNOS;
        }
    }

    // --------------------------------------------------------------------------
    // MÉTODO DE VISUALIZACIÓN
    // --------------------------------------------------------------------------

    /**
     * Muestra la tabla completa de resultados, incluyendo la matriz y los vectores
     * de promedios.
     */
    public static void mostrarResultado(
            int[][] calificaciones, double[] promAlum, double[] promMat,
            String[] alumnos, String[] materias) {

        // Encabezado de la tabla
        System.out.println("\n-------------------------------------------------------------");
        System.out.print("ALUMNO\t\t|");
        for (String materia : materias) {
            System.out.printf("%-10s|", materia.substring(0, 3) + "."); // Acortar nombre de materia
        }
        System.out.printf("%-10s\n", "PROMEDIO");
        System.out.println("-------------------------------------------------------------");

        // Datos de la Matriz y Promedio de Alumnos (Filas)
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.printf("%-15s|", alumnos[i]); // Nombre del Alumno

            for (int j = 0; j < MATERIAS; j++) {
                System.out.printf("%-10d|", calificaciones[i][j]); // Calificación
            }

            // Promedio del Alumno (sacado del vector promedioAlumnos)
            System.out.printf("%-10.2f\n", promAlum[i]);
        }

        System.out.println("-------------------------------------------------------------");

        // Promedio de Materias (Vector)
        System.out.print("PROMEDIO MAT.|");
        for (int j = 0; j < MATERIAS; j++) {
            // Promedio de Materia (sacado del vector promedioMaterias)
            System.out.printf("%-10.2f|", promMat[j]);
        }
        System.out.printf("%-10s\n", "---"); // No hay promedio para el promedio total
        System.out.println("-------------------------------------------------------------");
    }
}
