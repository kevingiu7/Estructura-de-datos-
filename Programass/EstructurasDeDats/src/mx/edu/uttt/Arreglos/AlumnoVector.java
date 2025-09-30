package mx.edu.uttt.Arreglos;

import mx.edu.uttt.ED.Alumno;

import javax.swing.*;

public class AlumnoVector {
    public static void main(String[] args) {

        iniciar();

    }

    public static void iniciar(){
        int tamano = 0;

        tamano = solicitarTamaño();
        Alumno [] alumnos = new Alumno[tamano];
        menu(alumnos);
    }

    public static void menu( Alumno [] alumnos ){
    boolean sentinel = true;
        String menu= "==== Menu ==== \n"+
                "1) llenar Vector \n" +
                "2) Imprimir vecor \n" +
                "3) Salir \n" +
                "Eligir una opcion: ", opcion="";
        opcion = JOptionPane.showInputDialog(menu);
                do{

                  switch ( opcion) {
                      case "1" :
                          llenarAlumnos(alumnos);
                          break;
                      case "2" :
                          imprimir(alumnos);
                          break;
                      case "3":
                          sentinel = false;
                          break;

                      default:
                          JOptionPane.showMessageDialog(null, "opcion no valida");
                  }

                }while(sentinel);



    }

    public static int solicitarTamaño(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de alumnos"));
    }

    public static void llenarAlumnos(Alumno [] alus){
        for (int i = 0; i < alus.length; i++) {
            Alumno a1 = new Alumno();
            a1.setNombre(JOptionPane.showInputDialog("introduce el nombre"));
            a1.setSexo(JOptionPane.showInputDialog("introduce el sexo").charAt(0));
            a1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("introduce el edad")));
            a1.setColorPiel(JOptionPane.showInputDialog("introduce el color de piel"));
            alus[i] = a1;
        }
    }

    public static void imprimir(Alumno [] alumnos){
        if(alumnos[0] != null){
        String salida= "Datos de los alumnos:\n";
        for(Alumno alumno: alumnos) {
            salida += "Nombre: " + alumno.getNombre() +
                    "\nSexo: " + alumno.getSexo() +
                    "\nEdad: " + alumno.getEdad() +
                    "\nColor de Piel: " + alumno.getColorPiel() + "\n";

        }
            System.out.println(salida);
            return;
        }

        JOptionPane.showMessageDialog(null, "no existe");
    }



    public static void imprimir2(Alumno [] alumnos){
        String salida= "Datos de los alumnos:\n";
        for(Alumno alumno: alumnos) {
            salida+=alumno + "\n";
        }

        }
    }


