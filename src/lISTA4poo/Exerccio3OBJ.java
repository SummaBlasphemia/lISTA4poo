package lISTA4poo;

public class Exerccio3OBJ {
	String operacao;
	int num1 = 1,num2 = 2;
	
	public void setOperacao(String Operacao) {
		this.operacao = Operacao;
	}
	
	public String getOperacao() {
		 return operacao;
	}
	
	public void setNum1(int Num1) {
		 this.num1 = Num1;
	}
	
	public void setNum2(int Num2) {
		 this.num2 = Num2;
	}
	
	public int getNum1() {
		 return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public double calcular() {
	    double resultado = 0;

	    switch (operacao) {
	        case "+":
	            resultado = num1 + num2;
	            System.out.println(resultado);
	            break;
	        case "-":
	            resultado = num1 - num2;
	            System.out.println(resultado);
	            break;
	        case "*":
	            resultado = num1 * num2;
	            System.out.println(resultado);
	            break;
	        case "/":
	            if (num2 != 0) {
	                resultado = (double) num1 / num2; // cast p/ não perder casas decimais
	                System.out.println(resultado);
	            } else {
	                System.out.println("Erro: divisão por zero!");
	            }
	            break;
	        default:
	            System.out.println("Operação inválida!");
	    }

	    return resultado;
		
	}
}
