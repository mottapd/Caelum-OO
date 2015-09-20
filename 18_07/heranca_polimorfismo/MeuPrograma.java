class MeuPrograma {

	public static void main(String[] args) {
		
		Conta c = new Conta();	
		ContaCorrente cc = new ContaCorrente(2);
		ContaPoupanca cp = new ContaPoupanca(3);

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		System.out.println("C " + c.getSaldo());
		System.out.println("CC " + cc.getSaldo());
		System.out.println("CP " + cp.getSaldo());
	}
}
