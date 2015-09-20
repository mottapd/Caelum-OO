package br.com.caelum.banco;

public class GerenciadorDeImpostoDeRenda {
	private double total;
	
	void adiciona (Tributavel t){
		System.out.println("adiciona tributavel " + t);
		this.total+=t.calculaTributos();
	}
	public double getTotal(){
		return this.total;
	}
}
