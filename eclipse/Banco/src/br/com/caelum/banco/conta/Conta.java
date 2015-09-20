package br.com.caelum.banco.conta;

import java.math.BigDecimal;

public abstract class Conta {

	private double saldo1;
	private String nome;
	private BigDecimal bigDec;
	private int numero;

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo1;
	}

	public void setSaldo(double saldo) {
		this.saldo1 = saldo;
	}

	@Override
	public String toString() {
		return "objeto $ " + this.saldo1;
	}

	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return ((this.numero == outraConta.numero) && (this.nome == outraConta.nome));
	}

	public void deposita(double d) {
		// TODO Auto-generated method stub
		this.saldo1 += d;
	}

	public abstract void atualiza(double taxa);

	public void saca(double valor) {
		this.saldo1 -= valor;
	}

}
