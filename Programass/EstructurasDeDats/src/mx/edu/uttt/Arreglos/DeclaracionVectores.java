package mx.edu.uttt.Arreglos;

import mx.edu.uttt.ED.Alumno;

public class DeclaracionVectores {
    public static void main(String[] args) {
        //Declaracion de vectores

        int v1[];
        double v2[], v3[];
        boolean v4[];
        char v5[];
        String v6[];
        // Alumno v7[];

        //Crear el objeto en memoria
        v1 = new int[4];
        v2 = new double[3];
        v3 = new double[3];
        v4 = new boolean[4];
        v5 = new char[5];
        v6 = new String[4];
        Alumno[] v7 = new Alumno[3];

        //Decalracion de vector coon valores iniciales

        double [] v8 = {3.2,8.5,8.9,7.4};

        int tamaño = v1.length;
        System.out.println(tamaño);

        //Imprimir el valor de un arreglo
        try {
            System.out.println(v3[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arreglo se desbordo");
        }


        System.out.println(esTamaño(v1));

    }//Cierra el main

    public static int esTamaño(int [] vector){
        return vector.length;
    }

//    public static void imprimir (int [] vector){
//        for (int i = 0; i < vector.length; i++) {
//            System.out.print(" | " + vector[i] + " | ");
//        }
//
//        System.out.println();
//
//        int i = 0;
//        do{
//            System.out.print(" | " + vector[i] + " | ");
//            i++;
//        }while (i<vector.length);
//
//        System.out.println();
//
//        i=0;
//        while (i< vector.length){
//            System.out.print(" | " + vector[i] + " | ");
//            i++;
//        }
//
//        for (int valor: vector) {
//            System.out.print(" | " + valor + " | ");
//        }
//
//    }

}//Cierre de clase
