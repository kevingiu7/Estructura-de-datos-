package mx.edu.uttt.Arreglos;

import javax.swing.*;

public class operacionesVectores {

    private double [] vector ;
    private final int TAMANO = 5;

    public operacionesVectores (){
        vector = new double[TAMANO];


    }


    public operacionesVectores(double [] vector){
        this.vector = new double[vector.length];
        llenarVector(vector);
    }

    public void llenarVector(double [] vector){
        for (int i=0; i<vector.length; i++){
            this.vector[i] = vector[i];

        }
    }

    public void  llenarVector(){
        int i=0;
        do {
            this.vector[i] = Integer.parseInt((JOptionPane.showInputDialog("introduce el valo de posicion [" + (i+1) + "]")));
            i++;
        }while(i<this.vector.length);
    }

    public void imprimir(){
        this.toString();
    }

    public double sumarElementos(){
        double suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return suma;

    }

    public double obtenerMaximoValor(){
        int i=0;
        double maximo = 0.0;
        while (i < this.vector[i]){

            if(maximo<this.vector[i]){
                maximo = vector[i];
            }
            i++;
        }
        return maximo;

    }

    public double obtenerMinimoValor(){
        int i=0;
        double minimo = 0.0;
        while (i > this.vector[i]){

            if(minimo>this.vector[i]){
                minimo = vector[i];
            }
            i++;
        }
        return minimo;

    }

    public double cambiarTamanoArreglo(int tamanio){
        if (vector.length >= tamanio) {
            double temp[] = new double[tamanio];
            for (int i = 0; i <= this.vector.length; i++) {
                temp[i] = vector[i];
            }
            temp = null;


        }
        System.out.println("no se puede crear un arreglo");
        return tamanio;
    }

    public boolean compararArreglos(double [] vector){
        boolean isEqual = true;

        if (this.vector.length != vector.length){
            isEqual = false;

        }else {
            for (int i = 0; i < this.vector.length && isEqual; i++) {
                if (vector[i] != this.vector[i]){
                    isEqual = false;

                }
            }
        }
        return isEqual;

    }

    @Override
    public String toString() {
     String salida ="";
        for(double valor: vector){
            salida+="| " + valor + "|";
        }
        return salida;
    }


}
