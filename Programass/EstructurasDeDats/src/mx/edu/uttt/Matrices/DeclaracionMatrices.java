package mx.edu.uttt.Matrices;

public class DeclaracionMatrices {
    public static void main(String[] args) {
        /*
        * SIntaxis
        * tipodedato [][] NombreMatriz
        * tipodedato nombreMatriz [][];
         */

        //Declarando matrices
        double [][] calif;
        double promedios [][];
        char [][] califLetras;
        String nombre [][];


        //Instanciar las matrices
        int[][]numeroAlumnos = new int [3][3];
        calif = new double[4][4];
        promedios = new double[3][2];
        califLetras = new char[5][3];


        //Asignar valors iniciales a un a matrices
        String [] nombresVector={"Juan", "Pablo", "Chuy", "Messi"};
        String nombres [][] = {{"luis", "jorge campos","Luis garcia"},
                {"Roberto Baggio", "Ronaldo Nazario", "Dr,Garcia"}};

        double [][] alturas = {
                {2.2,5.3,6.3},
                {10.2, 8.5, 6.4}
                              };

        //Acceder a los elementos de la matriz

        int i = 0, j = 0;

        double valor = alturas[0][j];
        valor = alturas[i][j];
        valor = alturas[alturas.length-1][j]; //La ultima fila, columna j
        //la ultima fila y ultima columna
        valor =  alturas[alturas.length-1][alturas[alturas.length-1].length-1];
        valor = alturas.length; //el numero de filas
        valor = alturas[i].length;//Numero de columnas

        Auto sedan1 = new Auto("BMW", 0, 0);
        Auto sedan2 = new Auto("BMW", 15.0, 100 );
        Auto sedan3 = new Auto("Toyota", 0, 0 );
        Auto sportCar = new Auto("Ferrari", 0, 0 );
        Auto rv1 = new Auto("Jeep", 0.0, 0 );
        Auto rv2 = new Auto("Ford", 300.0, 200 );

        Auto  [][] cars = {
                {sedan1, sedan2, sedan2},
                {sportCar, new Auto(), rv1},
                {new Auto("Vocho", 30.5,150), rv2, new Auto()}
        };





    }
}
