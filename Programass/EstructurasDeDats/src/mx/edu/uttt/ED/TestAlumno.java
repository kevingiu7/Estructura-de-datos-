package mx.edu.uttt.ED;
import javax.swing.JOptionPane;
public class TestAlumno {
    public static void main(String[] args) {
        String nombre = "", colorPiel = "";
        int edad = 0;
        char sexo = '\0';

        Alumno a1 = new Alumno();

        nombre = JOptionPane.showInputDialog("introduce el nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("INtoduce la edad"));
        sexo = JOptionPane.showInputDialog("Introduce el sexo h/m").charAt(0);
        colorPiel = JOptionPane.showInputDialog("introduce el color de piel [Blanco , Negro]");

        a1.setNombre(nombre);
        a1.setEdad(edad);
        a1.setSexo(sexo);
        a1.setColorPiel(colorPiel);

        String  salida = "Resultados : \n" + "nombre" + a1.getNombre() +
                                                        "\nEdad " + a1.getEdad()+
                                                        "\nSexo " + a1.getSexo()+
                                                        "\ncolor piel " + a1.getColorPiel();

        JOptionPane.showMessageDialog(null, salida);
        JOptionPane.showMessageDialog(null, " Resultados\n "+ a1);

    }
}
