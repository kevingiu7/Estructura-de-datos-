package mx.edu.uttt.appEstructuraDatos.materias;

import mx.edu.uttt.appEstructuraDatos.Menus;

import javax.swing.*;

public class Inicio {
    public static void main(String[] args) {
    iniciar();
    }
    public static void iniciar(){
        String opcion = "";
        boolean sentinel = true;
        do {
            opcion = JOptionPane.showInputDialog(Menus.obtenerMenuPrincipal());
            switch (opcion) {
                case "1":
                    JOptionPane.showMessageDialog(null, "opcion1");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "opcion2");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "opcion3");
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "opcion4");
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "opcion5");
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "salio");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor no valido");
            }
        }while(sentinel);
    }
}

