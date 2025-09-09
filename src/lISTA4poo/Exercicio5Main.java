package lISTA4poo;

import java.util.Scanner;

public class Exercicio5Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double totalGeral = 0.0;

        System.out.println("--- CARDÁPIO ---");
        System.out.println("100 - Cachorro Quente   R$ 1,20");
        System.out.println("101 - Bauru Simples     R$ 1,30");
        System.out.println("102 - Bauru com ovo     R$ 1,50");
        System.out.println("103 - Hambúrguer        R$ 1,20");
        System.out.println("104 - Cheeseburguer     R$ 1,30");
        System.out.println("105 - Refrigerante      R$ 1,00");
        System.out.println("Digite 0 para encerrar o pedido.");
        System.out.println();

        while (true) {
            System.out.print("Digite o código do produto: ");
            int codigo = leitor.nextInt();
            if (codigo == 0) break; // encerra pedido

            System.out.print("Digite a quantidade: ");
            int quantidade = leitor.nextInt();

            Exercicio5OBJ item = new Exercicio5OBJ(codigo, quantidade);

            if (item.getPrecoUnitario() == 0.0) {
                System.out.println("⚠ Código inválido! Tente novamente.");
            } else {
                System.out.println(item.toString());
                totalGeral += item.getValorTotal();
            }
            System.out.println();
        }

        System.out.printf("TOTAL DO PEDIDO: R$ %.2f%n", totalGeral);
    }
}
