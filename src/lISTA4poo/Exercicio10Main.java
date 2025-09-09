package lISTA4poo;

public class Exercicio10Main {
    public static void main(String[] args) {
    	Exercicio10OBJ bomba = new Exercicio10OBJ("Gasolina", 5.0, 1000);

        System.out.println(bomba);

        bomba.abastecerPorValor(50);  // abastece R$50 em gasolina
        bomba.abastecerPorLitro(20);  // abastece 20 litros
        bomba.alterarValor(6.0);      // muda o valor do litro
        bomba.alterarCombustivel("Etanol");
        bomba.alterarQuantidadeCombustivel(800);

        System.out.println("Depois das operações:");
        System.out.println(bomba);
    }
}
