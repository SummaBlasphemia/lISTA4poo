package lISTA4poo;
import java.util.Scanner;

public class Exercicio4Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Exercicio4OBJ salario = new Exercicio4OBJ();

        System.out.print("Digite quanto você ganha por hora: ");
        double valorHora = leitor.nextDouble();
        salario.setValorHora(valorHora);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horas = leitor.nextInt();
        salario.setHorasTrabalhadas(horas);

        System.out.println("\n--- Demonstrativo de Pagamento ---");
        System.out.printf("Salário Bruto: R$ %.2f%n", salario.getSalarioBruto());
        System.out.printf("- IR (11%%): R$ %.2f%n", salario.getIR());
        System.out.printf("- INSS (8%%): R$ %.2f%n", salario.getINSS());
        System.out.printf("- Sindicato (5%%): R$ %.2f%n", salario.getSindicato());
        System.out.printf("= Salário Líquido: R$ %.2f%n", salario.getSalarioLiquido());
    }
}
