package mx.edu.uttt.Promedio;

public class Promedio {
    private int valor;

    public Promedio(){
        this.valor = 0;
    }

    public Promedio(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Promedio{" +
                "valor=" + valor +
                '}';
    }
}
