package br.com.caelum.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	@Override
	public int compareTo(ContaPoupanca o) {
		if (this.getNumero() < o.getNumero()) {
			return -1;
		}
		if (this.getNumero() > o.getNumero()) {
			return 1;
		}
		return 0;
	}

	@Override
	public void atualiza(double taxa) {
		// TODO Auto-generated method stub

	}

}
