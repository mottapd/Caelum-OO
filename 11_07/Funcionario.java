class Funcionario {
	String nome;
	String departamento;
	double salario = 7500.50;
	Data dtentrada;
	String numRG;

	void recebeAumento (double psalario) {
		this.salario = this.salario + psalario;
	}

	void mostra() {
		System.out.println(this.nome);
		System.out.println(this.departamento);
		System.out.println(this.salario);
		System.out.print("dia " + this.dtentrada.dia);
		System.out.print(" mes " + this.dtentrada.mes);
		System.out.println(" ano " + this.dtentrada.ano);
		System.out.println(this.numRG);
	}
	
	double calculaGanhoAnual() {
		return this.salario * 12.0;
	}
	
}

class Data {
	int dia;
	int mes;
	int ano;
}
