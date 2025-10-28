package mx.edu.uttt.materias;

public class operacionesAlumnos {
    private double [] [] Calificaciones;
    public operacionesAlumnos(int numFilas, int numColumnas){
        if (validarTamanio(numFilas) && validarTamanio(numColumnas)){
            Calificaciones= new double[numFilas][numColumnas];
        }else{
            Calificaciones= new double[2][2];
        }
    }

    private boolean validarTamanio( int tamanio){
        return tamanio >0;
    }

}
