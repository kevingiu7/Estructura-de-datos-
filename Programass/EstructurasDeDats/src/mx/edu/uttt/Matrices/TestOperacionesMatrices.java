package mx.edu.uttt.Matrices;

import javax.swing.*;

public class TestOperacionesMatrices {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar(){
        // Obtener tamaño para filas y columnas por separado
        int filas = obtenerTamanio("filas");
        int columnas = obtenerTamanio("columnas");

        // Crear instancia de la clase de operaciones
        operacionesMatrices oper = new operacionesMatrices(filas, columnas);

        // Crear y llenar la matriz
        double [][] m = new double[filas][columnas];
        llenarMatriz(m);
        oper.setM(m); // Establecer la matriz en el objeto OperacionesMatrices

        // Imprimir la matriz
        oper.imprimir();

        // Realizar las operaciones y mostrar resultados
        try {
            // Verificar si es cuadrada para operaciones de diagonal
            if (filas == columnas) {
                JOptionPane.showMessageDialog(null, "Suma Diagonal Principal: " + oper.sumarDiagonal());
                JOptionPane.showMessageDialog(null, "Suma Diagonal Inversa: " + oper.sumarDiagonalInversa());
            } else {
                JOptionPane.showMessageDialog(null, "La matriz NO es cuadrada. No se calculan las diagonales.");
            }

            // Suma de filas y columnas (válida para cualquier matriz)
            JOptionPane.showMessageDialog(null, oper.imprimirSumaColumnasFilas());

        }catch (Exception e) {
            // En caso de que ocurra una excepción (ej: no cuadrada para diagonales)
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage());
            System.out.println(e);
        }
    }

    // Método para obtener el tamaño (filas o columnas)
    public static int obtenerTamanio(String dimension){
        int valor=0;
        boolean sentinel = true;
        do{
            try {
                String input = JOptionPane.showInputDialog("Ingresa el número de " + dimension + " (debe ser > 0):");
                if (input == null) return 1; // Manejar cancelación, tamaño por defecto

                valor= Integer.parseInt(input);
                if (valor > 0){
                    sentinel=false;
                }else {
                    JOptionPane.showMessageDialog(null,"El valor debe ser mayor que 0");
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"El valor debe ser un número entero.");
                System.out.println("Error de formato: El valor debe ser un numero");
            }
        }while (sentinel);
        return valor;
    }

    // Método para llenar la matriz
    public static void llenarMatriz (double [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                boolean sentinel = true; // Reiniciar sentinel en cada celda
                do {
                    try {
                        String input = JOptionPane.showInputDialog("Ingresa el valor para [" + i + "][" + j + "]:");
                        if (input == null) input = "0"; // Tratar cancelación como 0

                        matrix[i][j]= Double.parseDouble(input);
                        sentinel=false; // Valor válido, salir del bucle interno
                    }catch (NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "El valor debe ser un número decimal (ej: 1.0, 5, -3.5).");
                    }
                }while (sentinel);
            }
        }
    }


}