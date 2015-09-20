class MeuPrograma {

	int x = 37;

	public static void main(String[] args) {
		
		Funcionario myfunc1 = new Funcionario("Bruno"); 
		Funcionario myfunc2 = new Funcionario("Rodrigo"); 			
		Data dtmyfunc = new Data();
		dtmyfunc.dia = 13;
		dtmyfunc.mes = 1;
		dtmyfunc.ano = 1983;

		//System.out.println(x);

		//myfunc1.mostra();

		//myfunc1.setnome("Bruno");
		myfunc1.setdepartamento("Tecnologia");
		//myfunc1.dtentrada = "13/01/1983";		
		myfunc1.setdtentrada(dtmyfunc);
		myfunc1.setnumRG("34.546.789-X");

		//myfunc2.setnome("Rodrigo");
		myfunc2.setdepartamento("Tecnologia");
		//myfunc2.dtentrada = "13/01/1983";		
		myfunc2.setdtentrada(dtmyfunc);
		myfunc2.setnumRG("34.546.789-X");

		if (myfunc1 == myfunc2) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		
		System.out.println(myfunc1);
		System.out.println(myfunc2);

		//myfunc1 = myfunc2;

		if (myfunc1 == myfunc2) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}

		System.out.println(myfunc1);
		System.out.println(myfunc2);

		System.out.println(myfunc1.calculaGanhoAnual());
		myfunc1.recebeAumento(1000.00);
		System.out.println(myfunc1.calculaGanhoAnual());
		myfunc1.mostra();
		myfunc2.mostra();
		
		//Criando empresa
		Empresa mycorp = new Empresa(2);
		System.out.println("Criando empresa");
		System.out.println(mycorp.adiciona(myfunc1));
		System.out.println(mycorp.adiciona(myfunc2));
		System.out.println(mycorp.adiciona(myfunc2));
		System.out.println(mycorp.adiciona(myfunc1));
		Funcionario myfunc3 = new Funcionario("Teste");
		//myfunc3.setnome("Teste");
		System.out.println(mycorp.adiciona(myfunc3));

	}
}
