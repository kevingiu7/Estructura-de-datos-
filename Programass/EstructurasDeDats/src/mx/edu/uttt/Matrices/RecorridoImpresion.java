package mx.edu.uttt.Matrices;

import javax.swing.*;

public class RecorridoImpresion {
    public static void main(String[] args) {
        int[][] matri = new int[solicitarNumeroFilas()][solicitarNumeroColumnas()];
        iniciar();
        imprimir4(matri);
    }

    public static void iniciar() {
        int[][] matri = new int[solicitarNumeroFilas()][solicitarNumeroColumnas()];
        llenar(matri);
        imprimir(matri);
    }

    public static int solicitarNumeroFilas() {
        boolean sentinel = true;
        int numFilas = 0;
        do {
            try {
                numFilas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de filas"));
                if (numFilas > 0) {
                    sentinel = false;
                } else {
                    JOptionPane.showMessageDialog(null, "el valor debe ser mayor a 0");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El valor debe ser un entero");
            }
        } while (sentinel);
        return numFilas;
    }

    public static int solicitarNumeroColumnas() {
        boolean sentinel = true;
        int numColumnas = 0;
        do {
            try {
                numColumnas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de filas"));
                if (numColumnas > 0) {
                    sentinel = false;
                } else {
                    JOptionPane.showMessageDialog(null, "el valor debe ser mayor a 0");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El valor debe ser un entero");
            }
        } while (sentinel);
        return numColumnas;

    }

    public static int solicitarValor() {
        int valor = 0;
        boolean sentinel = true;
        do {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El valor debe ser un numero");
            }
        } while (sentinel);
        return valor;
    }

    public static void llenar(int[][] ma) {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                ma[i][j] = solicitarValor();
            }
        }
    }

    public static void imprimir(int[][] matrix) {

        int i = 0;
        int j = 0;
        String salida = "";
        while (i < matrix.length) {
            j = 0;
            while (j < matrix[i].length) {
                salida += matrix[i][j] + "  ";
                j++;
            }
            salida += "\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, salida);

    }

    public void imprimir2(int[][] matrix) {
        int i = 0;
        int j = 0;
        String salida = "";
        do {
            do {
                salida += matrix[i][j] + "";
                j++;

            } while (j < matrix.length);
            salida += "";
            i++;
        } while (i < matrix.length);
        JOptionPane.showMessageDialog(null, salida);
    }

    public static void imprimir3(int[][] matrix) {
        String salida = "";
        int j = 0;

        for (int i = 0; i < matrix.length; i++) {
            while (j < matrix[i].length) {
                salida += matrix[i][j] + "";
                j++;

            }
            j = 0;
        }
        JOptionPane.showMessageDialog(null, salida);
    }

    public static void imprimir4(int[][] kiss) {
        //En una matriz cada fila es un arreglo unidimensional
        String salida = "";
        for (int[] fila : kiss) {
            for (int valor : fila) {
                salida+= valor + "";


            }
            salida+="\n";

        }
        JOptionPane.showMessageDialog(null, salida);

    }
}
