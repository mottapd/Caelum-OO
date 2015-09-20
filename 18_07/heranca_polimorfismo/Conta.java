class Conta {
	//private double saldo;
	protected double saldo;

	public Conta(){
		System.out.println(" construtor com heranca: Conta");
	}

	public double getSaldo(){
		return this.saldo;
	}
	public void deposita(double valor){
		this.saldo += valor;
	}
	public void saca(double valor){
		this.saldo -= valor;
	}
	public void atualiza(double taxa){
		this.saldo += this.saldo*taxa;	
	}
	
}

class ContaCorrente extends Conta {
	public ContaCorrente(int i){
		System.out.println(i + " construtor com heranca: ContaCorrente");
	}	
	//polimorfismo
	public void atualiza(double taxa){
		//this.saldo += this.saldo*taxa*2;
		super.atualiza(taxa*2);	
	}
}

class ContaPoupanca extends Conta {
	private double taxadeposito = 0.1;

	public ContaPoupanca(int i){
		System.out.println(i + " construtor com heranca: ContaPoupanca");	
	}
	//polimorfismo
	public void atualiza(double taxa){
		super.saldo += this.saldo*taxa*3;	
	}
	//polimorfismo
	public void deposita(double valor){
		System.out.println("debug " + super.saldo);
		super.saldo +=(valor-taxadeposito);
		System.out.println("debug " + super.saldo);
	}
}

class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic){
		this.selic = selic;	
	}

	public void roda(Conta c){
	}
}
