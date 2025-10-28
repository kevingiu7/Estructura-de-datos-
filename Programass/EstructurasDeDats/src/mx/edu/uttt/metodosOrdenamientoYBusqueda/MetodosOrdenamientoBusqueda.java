package mx.edu.uttt.metodosOrdenamientoYBusqueda;

public class MetodosOrdenamientoBusqueda {
    public int arr [];
    
    public MetodosOrdenamientoBusqueda(int tam){
    if (validarTamaño(tam)){
         arr = new int [tam];
    }else {
        arr = new int[2];
    }
    }

    private boolean validarTamaño(int tam){
        return tam >0;

    }

    public int [] getArr() {
        return arr;
    }

    public void setArr(int []arr) {
        if(this.arr.length == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                this.arr = arr;

            }
        }
    }
    
    public void bubleSortASC(){

        int aux = 0;
        for (int i = 0; i <this.arr.length ; i++) {
            for (int j = 0; j < this.arr.length-1; j++) {
                if (arr[j] > arr[j+1]){
                    aux = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1] = aux;
                }

            }
        }
    
    }

    public void BublesortDesc(){
        int aux = 0;
        for (int i = 0; i <this.arr.length ; i++) {
            for (int j = 0; j < this.arr.length-1; j++) {
                if (arr[j] > arr[j+1]){
                    aux = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1] = aux;
                }

            }
        }
    }
}
