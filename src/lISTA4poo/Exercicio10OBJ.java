package lISTA4poo;

public class Exercicio10OBJ {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel; // em litros

    // Construtor
    public Exercicio10OBJ(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    // Abastecer por valor (retorna litros)
    public void abastecerPorValor(double valor) {
        double litros = valor / valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.println("Abastecido: " + litros + " litros. Valor pago: R$ " + valor);
        } else {
            System.out.println("Combustível insuficiente na bomba!");
        }
    }

    // Abastecer por litro (retorna valor)
    public void abastecerPorLitro(double litros) {
        double valor = litros * valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.println("Abastecido: " + litros + " litros. Valor pago: R$ " + valor);
        } else {
            System.out.println("Combustível insuficiente na bomba!");
        }
    }

    // Alterar valor do litro
    public void alterarValor(double novoValor) {
        if (novoValor > 0) {
            this.valorLitro = novoValor;
        } else {
            System.out.println("Valor inválido!");
        }
    }

    // Alterar tipo de combustível
    public void alterarCombustivel(String novoTipo) {
        this.tipoCombustivel = novoTipo;
    }

    // Alterar quantidade de combustível na bomba
    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        if (novaQuantidade >= 0) {
            this.quantidadeCombustivel = novaQuantidade;
        } else {
            System.out.println("Quantidade inválida!");
        }
    }

    // Getters
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    @Override
    public String toString() {
        return "BombaCombustivel [Tipo=" + tipoCombustivel +
               ", Valor por Litro=R$ " + valorLitro +
               ", Quantidade disponível=" + quantidadeCombustivel + " litros]";
    }
}
