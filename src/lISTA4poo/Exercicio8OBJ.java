package lISTA4poo;

public class Exercicio8OBJ {
    private int numeroConta;
    private String nome;
    private double saldo;

    // Construtor
    public Exercicio8OBJ(int numeroConta, String nome, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    // Alterar nome
    public void alterarNome(String novoNome) {
        if (novoNome != null && !novoNome.isEmpty()) {
            this.nome = novoNome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    // Depósito
    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    // Saque
    public void saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque inválido! Verifique o saldo.");
        }
    }

    // Getters
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria [Conta=" + numeroConta +
               ", Nome=" + nome +
               ", Saldo=R$ " + saldo + "]";
    }
}
