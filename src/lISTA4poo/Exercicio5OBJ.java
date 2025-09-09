package lISTA4poo;

public class Exercicio5OBJ {
    private int codigo;
    private int quantidade;

    public Exercicio5OBJ(int codigo, int quantidade) {
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        switch (codigo) {
            case 100: return 1.20;
            case 101: return 1.30;
            case 102: return 1.50;
            case 103: return 1.20;
            case 104: return 1.30;
            case 105: return 1.00;
            default: return 0.0;
        }
    }

    public String getNomeItem() {
        switch (codigo) {
            case 100: return "Cachorro Quente";
            case 101: return "Bauru Simples";
            case 102: return "Bauru com ovo";
            case 103: return "Hambúrguer";
            case 104: return "Cheeseburguer";
            case 105: return "Refrigerante";
            default: return "Código Inválido";
        }
    }

    public double getValorTotal() {
        return getPrecoUnitario() * quantidade;
    }

    public String toString() {
        return getNomeItem() + " (x" + quantidade + ") - R$ " + String.format("%.2f", getValorTotal());
    }
}
