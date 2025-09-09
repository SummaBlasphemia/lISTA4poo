package lISTA4poo;

public class Exercicio7OBJ {
    private String nome;
    private int idade;
    private double peso;
    private double altura; // em metros (ex: 1.75)

    // Construtor
    public Exercicio7OBJ(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos básicos
    public void envelhecer() {
        idade++;
        if (idade < 21) {
            altura += 0.05; // cresce 0.5 cm = 0.05 m
        }
    }

    public void engordar(double kg) {
        peso += kg;
    }

    public void emagrecer(double kg) {
        peso -= kg;
    }

    public void crescer(double metros) {
        altura += metros;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome +
               ", idade=" + idade +
               ", peso=" + peso + "kg" +
               ", altura=" + altura + "m]";
    }
}
