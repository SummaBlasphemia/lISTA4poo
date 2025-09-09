package lISTA4poo;

public class Exercicio9Main {
    public static void main(String[] args) {
    	Exercicio9OBJ tv = new Exercicio9OBJ(5, 10);

        System.out.println(tv);

        tv.setCanal(50);
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();

        System.out.println("Depois de mudar:");
        System.out.println(tv);

        tv.setCanal(150); // inválido
        for (int i = 0; i < 60; i++) {
            tv.aumentarVolume(); // testando limite
        }
    }
}
