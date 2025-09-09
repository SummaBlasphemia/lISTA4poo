package lISTA4poo;

public class Exercicio7Main {
    public static void main(String[] args) {
    	Exercicio7OBJ p = new Exercicio7OBJ("Gabriel", 18, 60, 1.65);

        System.out.println(p);

        // Simulando 5 anos passando
        for (int i = 0; i < 5; i++) {
            p.envelhecer();
        }

        p.engordar(3);
        p.emagrecer(1);

        System.out.println("Depois de 5 anos:");
        System.out.println(p);
    }
}
