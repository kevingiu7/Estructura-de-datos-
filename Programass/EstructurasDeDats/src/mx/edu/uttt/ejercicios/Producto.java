package mx.edu.uttt.ejercicios;

public class Producto {
    private String Nombre;
    private int precio;
    private int existencia;
    //Costructor
    public Producto() {
        this.Nombre= "sin nombre";
    }

    public Producto(String nombre, int precio, int existencia) {
        this.setNombre  (nombre);
        this.setPrecio ( precio);
        this.setExistencia( existencia);
    }
    //Metodos set y get
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre.toUpperCase();
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if(precio >= 0) {
            this.precio = precio;
        }
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
       if(existencia >=0 ) {
           this.existencia = existencia;
       }
    }
    @Override
    public String toString(){
        return "Nombre del producto :"+ getNombre() + "\nExistencia: "+ getExistencia() + "\nPrecio: "+ getPrecio();
    }






}
