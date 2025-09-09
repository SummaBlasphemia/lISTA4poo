package lISTA4poo;

public class Exercicio6Main {
    public static void main(String[] args) {
    	Exercicio6OBJ q1 = new Exercicio6OBJ(5); // cria um quadrado com lado 5

        System.out.println("Lado do quadrado: " + q1.getLado());
        System.out.println("Área: " + q1.calcularArea());

        q1.setLado(8); // muda o valor do lado
        System.out.println("Novo lado: " + q1.getLado());
        System.out.println("Nova área: " + q1.calcularArea());
    }
}
