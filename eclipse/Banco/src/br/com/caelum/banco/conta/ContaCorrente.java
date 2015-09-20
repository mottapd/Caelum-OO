package br.com.caelum.banco.conta;

import br.com.caelum.banco.Tributavel;

public class ContaCorrente extends Conta implements Tributavel{
	@Override
	public void atualiza(double taxa) {
		super.setSaldo(super.getSaldo()+(super.getSaldo()*taxa));
	}

	@Override
	public double calculaTributos() {
		// TODO Auto-generated method stub
		return this.getSaldo()*0.01;
	}

}
