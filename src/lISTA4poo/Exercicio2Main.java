package lISTA4poo;
import java.util.Scanner;

public class Exercicio2Main {
	public static void main(String[]args) {
	int Num;
	
	Exercicio2OBJ q = new Exercicio2OBJ();
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Digite o primeiro numero: ");
	Num = leitor.nextInt();
	
	q.setPrimeiroNum(Num);
	
	System.out.println("Digite o segundo numero: ");
	Num = leitor.nextInt();
	
	q.setSegundoNum(Num);
	
	q.criarMatriz();
	
	System.out.println(q.toStringNormal());
	}
}
