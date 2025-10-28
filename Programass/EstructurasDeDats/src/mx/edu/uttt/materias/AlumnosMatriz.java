package mx.edu.uttt.materias;

import mx.edu.uttt.Matrices.operacionesMatrices;

import javax.swing.*;

public class AlumnosMatriz {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar(){
        int fila = obtenerFilas();
        int columnas = obtenerColumnas();
        operacionesAlumnos oper = new operacionesAlumnos(fila, columnas);
        double [][] Calificaciones= new double[fila] [columnas];

    }

    public static int obtenerFilas(){
        int filas = 0;
        boolean sentinel = true;
        do {


            try {
                filas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de estudiantes"));
                if (filas > 0){
                    sentinel=false;
                }else {
                    JOptionPane.showMessageDialog(null, "el valor debe ser mayor que 0");
                }
            } catch (NumberFormatException ex) {
                System.out.println("El valor debe ser un numero");

            }
        }while (sentinel);
        return filas;
    }

    public static int obtenerColumnas(){
        int Columnas = 0;
        boolean sentinel = true;
        do {


            try {
                Columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de materias"));
                if (Columnas > 0){
                    sentinel=false;
                }else {
                    JOptionPane.showMessageDialog(null, "el valor debe ser mayor que 0");
                }
            } catch (NumberFormatException ex) {
                System.out.println("El valor debe ser un numero");

            }
        }while (sentinel);
        return Columnas;
    }


}
