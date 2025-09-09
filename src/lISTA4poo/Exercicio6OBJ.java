package lISTA4poo;

public class Exercicio6OBJ {
    private double lado;

    // Construtor
    public Exercicio6OBJ(double lado) {
        this.lado = lado;
    }

    // Muda o valor do lado
    public void setLado(double lado) {
        this.lado = lado;
    }

    // Retorna o valor do lado
    public double getLado() {
        return lado;
    }

    // Calcula a área
    public double calcularArea() {
        return lado * lado;
    }
}
