package mx.edu.uttt.Recursividad;

import javax.swing.*;

public class MetodoRecursivos {
    public static void main(String[] args) {
        try {
            int n=Integer.parseInt(JOptionPane.showInputDialog("introduce n"));
            JOptionPane.showMessageDialog(null, "El factorial de: "+ n + " Es: " +  fact(n));
        }catch (IllegalArgumentException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }



    }

    public static long fact(int n) throws IllegalArgumentException{
    //caso base
        if (n<0){
            throw new IllegalArgumentException("El valor no puede ser negativo");
        }
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        //CAso General
        return n*fact(n-1);
    }

    public static int sumaNumeros (int n){
        return n;
    }
}


