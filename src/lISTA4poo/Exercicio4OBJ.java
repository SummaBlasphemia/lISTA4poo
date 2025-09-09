package lISTA4poo;

public class Exercicio4OBJ {
    private double valorHora;
    private int horasTrabalhadas;

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioBruto() {
        return valorHora * horasTrabalhadas;
    }

    public double getIR() {
        return getSalarioBruto() * 0.11; 
    }

    public double getINSS() {
        return getSalarioBruto() * 0.08; 
    }

    public double getSindicato() {
        return getSalarioBruto() * 0.05; 
    }

    public double getTotalDescontos() {
        return getIR() + getINSS() + getSindicato();
    }

    public double getSalarioLiquido() {
        return getSalarioBruto() - getTotalDescontos();
    }
}
