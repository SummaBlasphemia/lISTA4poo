package lISTA4poo;

public class Exercicio2OBJ {
	private int primeiroNum = 1, segundoNum = 2, ordem = 0;
	private int[] matriz; 
	
	public void setPrimeiroNum(int primeiroNum) {
		this.primeiroNum = primeiroNum;
	}
	
	public void setSegundoNum(int segundoNum) {
		 this.segundoNum = segundoNum;
	}
	
	public int getPrimeiroNum() {
		return primeiroNum;
	}
	
	public int getSegundoNum() {
		return segundoNum;
	}
	
	//Parte feita com gpt
	public void criarMatriz() {
		int menor = Math.min(primeiroNum, segundoNum);
        int maior = Math.max(primeiroNum, segundoNum);
        
        int ordem = maior - menor + 1; 
        matriz = new int[ordem];

        for (int i = 0; i < ordem; i++) {
            matriz[i] = menor + i;
        }
    }
	//Fim da parte feita com GPT
	
	public String toStringNormal() {
		String resultado = "Números em ordem: ";
        for (int i = 0; i < matriz.length; i++) {
            resultado += matriz[i] + " ";
        }
        return resultado.trim();
    }
}
