package lISTA4poo;

public class Execicio1OBJ {
	private String nome = "nome";
	private String sobrenome = "sobrenome";
	
	public void setNome(String Nome) {
		if(Nome.length() >= 2) {
			this.nome = Nome;
		}
	}
	
	public void setSobrenome(String Sobrenome) {
		if(Sobrenome.length() >= 2) {
			this.sobrenome = Sobrenome;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	@Override
	public String toString() {
		return "Seu nome completo é: " + nome + " " + sobrenome;
	}
}
