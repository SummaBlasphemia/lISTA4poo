package lISTA4poo;
import java.util.Scanner;

public class Exercicio1Main {
	public static void main(String[]args) {
		
		String nome;
		
		Execicio1OBJ q = new Execicio1OBJ();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		nome = leitor.nextLine();
		
		q.setNome(nome);
		
		System.out.println("Digite seu sobrenomenome:");
		nome = leitor.nextLine();
		
		q.setSobrenome(nome);

		
		System.out.println(q.toString());
	}
}
