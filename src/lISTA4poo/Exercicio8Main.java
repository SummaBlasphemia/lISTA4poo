package lISTA4poo;

public class Exercicio8Main {
    public static void main(String[] args) {
        // Criando a conta
    	Exercicio8OBJ conta = new Exercicio8OBJ(123, "Alice", 500);

        System.out.println(conta);

        // Testando métodos
        conta.deposito(200);
        conta.saque(100);
        conta.alterarNome("Alice Souza");

        System.out.println("Depois das operações:");
        System.out.println(conta);

        conta.saque(1000); // teste de saque inválido
        conta.deposito(-50); // teste de depósito inválido
    }
}
