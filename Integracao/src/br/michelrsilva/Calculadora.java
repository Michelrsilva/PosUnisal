package br.michelrsilva;

public class Calculadora {
	
	
	private int operador1;
	private int operador2;

	public Calculadora(int operador1, int operador2) {
		this.xoperador1 = operador1;
		this.operador2 = operador2;
	}

	public int soma(){
		return operador1 + operador2;
	}
	
	public int divisao(){
		if(operador2==0){
			throw new NaoPodeDividirPorZero();
		}
		
		return operador1/operador2;
	}

	public class NaoPodeDividirPorZero extends RuntimeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	}	
}
