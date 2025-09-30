package mx.edu.uttt.ED;

public class Alumno extends Object{

    //variables de instancia
    private String nombre;
    private int edad;
    private char sexo;
    private String colorPiel;

    public Alumno(){
        this.setNombre("Sin Nombre");
        this.setEdad(17);
        this.setSexo('I');
        this.setColorPiel("Neutro");
    }

    public Alumno (String nombre, int edad, char sexo, String colorPiel){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
        this.setColorPiel(colorPiel);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad = edad >=17?edad:17;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {

        this.sexo = sexo = sexo == 'h' || sexo == 'M' || sexo == 'm' || sexo == 'M' ? sexo : 'I';
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        colorPiel = colorPiel.toUpperCase();
        switch (colorPiel) {
            case "Blanco":
            case "WHITE" :
            this.colorPiel = colorPiel;
            break;
            case "Negro" :
            case "BLACK" :
                this.colorPiel = colorPiel;
                break;
            default:
                this.colorPiel = "neutro";
        }
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", colorPiel='" + colorPiel + '\'' +
                '}';
    }
}
