class Funcionario {
	private static int identificador = 0;
	private int myid;	
	private String nome;
	private String departamento;
	private double salario = 7500.50;
	private Data dtentrada;
	private String numRG;
	
	//public Funcionario (){}
	public Funcionario (String nome){
		this.nome = nome;
		this.identificador++;
		this.myid = identificador;
	}

	//public void setnome (String nome){this.nome = nome;}
	public String getnome (){return this.nome;}
	public void setdepartamento (String departamento){this.departamento = departamento;}
	public void setsalario (double salario){this.salario = salario;}
	public void setdtentrada (Data dtentrada){this.dtentrada = dtentrada;}
	public void setnumRG (String numRG){this.numRG = numRG;}

	public void recebeAumento (double psalario) {
		this.salario = this.salario + psalario;
	}

	public void mostra() {
		System.out.println(this.nome);
		System.out.println( "id do funcionario " + this.myid);
		System.out.println(this.departamento);
		System.out.println(this.salario);
		System.out.print("dia " + this.dtentrada.dia);
		System.out.print(" mes " + this.dtentrada.mes);
		System.out.println(" ano " + this.dtentrada.ano);
		System.out.println(this.numRG);
	}
	
	public double calculaGanhoAnual() {
		return this.salario * 12.0;
	}
	
}

class Data {
	int dia;
	int mes;
	int ano;
}
