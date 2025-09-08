package lISTA4poo;
import java.util.Scanner;

public class Exercicio3Main {
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner leitor = new Scanner(System.in);
		Exerccio3OBJ q = new Exerccio3OBJ();
		
		System.out.println("Digite um numero: ");
		num1 = leitor.nextInt();
		
		System.out.println("Digite outro numero: ");
		num2 = leitor.nextInt();
		
		leitor.nextLine();
		
		System.out.println("Digite a operação (+, -, *, /): ");
		String operacao = leitor.next();
		
		q.setNum1(num1);
		q.setNum2(num2);
		q.setOperacao(operacao);
		
		q.calcular(); // <- aqui ele vai rodar o cálculo e imprimir
	}
}
