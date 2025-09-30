package mx.edu.uttt.ejercicios;

import javax.swing.*;

public class TestProductoVector {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar(){
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de productos"));
        ProductoVector pv = new ProductoVector(tamanio);

        String opcion = " ";
        boolean sentinel = true;
        do {
            opcion = JOptionPane.showInputDialog(menu());
            switch (opcion){
                case "1":
                    if(!pv.estalleno()) {
                        pv.llenarProducto(llenarProducto());
                    }else
                        JOptionPane.showMessageDialog(null,"el vector esta lleno");
                    break;

                case "2":
                    JOptionPane.showMessageDialog(null, pv.imprimir());
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, pv.imprimir());
                    borrarProducto();
                    if(borrarProducto() != null){

                    }
                    break;
                case "4":
                    sentinel=false;
                    JOptionPane.showMessageDialog(null, "Gracias por todo");
                default:
                    JOptionPane.showMessageDialog(null, "opcion no valida");
            }
        }while(sentinel);
    }

    public static String menu(){
        return "--Menu Principal--\n1)Agregar Producto\n"+
                "2)Imprimir Productos\n"+
                "3)Eliminar producto\n"+
                "4)salir \nElegir opcion";
    }

    public static Producto llenarProducto(){
        //Crea el objeto del producto
        Producto producto = new Producto();
        //solicita los valores de las variables de instancia
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del producto");
        int  existencia =Integer.parseInt(JOptionPane.showInputDialog("introduce la existencia"));
        int precio = Integer.parseInt(JOptionPane.showInputDialog("introduce el precio"));
        //Asignan los valores a las variables de instancia del objeto producto
        producto.setNombre(nombre);
        producto.setExistencia(existencia);
        producto.setPrecio(precio);
        return producto;
    }

    public static Producto borrarProducto(){
        Producto producto = new Producto();
        String nombreEliminar = JOptionPane.showInputDialog("Introduce el nombre del producto que quieres eliminar");
        producto.setNombre(nombreEliminar);
        return producto;
    }
}
