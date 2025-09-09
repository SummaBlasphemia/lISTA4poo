package lISTA4poo;

public class Exercicio9OBJ {
    private int canal;
    private int volume;

    // Faixas válidas
    private final int MIN_CANAL = 1;
    private final int MAX_CANAL = 100;
    private final int MIN_VOLUME = 0;
    private final int MAX_VOLUME = 50;

    // Construtor
    public Exercicio9OBJ(int canalInicial, int volumeInicial) {
        if (canalInicial >= MIN_CANAL && canalInicial <= MAX_CANAL) {
            this.canal = canalInicial;
        } else {
            this.canal = MIN_CANAL;
        }

        if (volumeInicial >= MIN_VOLUME && volumeInicial <= MAX_VOLUME) {
            this.volume = volumeInicial;
        } else {
            this.volume = MIN_VOLUME;
        }
    }

    // Trocar canal
    public void setCanal(int novoCanal) {
        if (novoCanal >= MIN_CANAL && novoCanal <= MAX_CANAL) {
            this.canal = novoCanal;
        } else {
            System.out.println("Canal inválido! Escolha entre " + MIN_CANAL + " e " + MAX_CANAL);
        }
    }

    public int getCanal() {
        return canal;
    }

    // Aumentar/diminuir volume
    public void aumentarVolume() {
        if (volume < MAX_VOLUME) {
            volume++;
        } else {
            System.out.println("Volume máximo atingido!");
        }
    }

    public void diminuirVolume() {
        if (volume > MIN_VOLUME) {
            volume--;
        } else {
            System.out.println("Volume mínimo atingido!");
        }
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Televisor [Canal=" + canal + ", Volume=" + volume + "]";
    }
}
