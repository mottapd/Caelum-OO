class MeuPrograma {
	public static void main(String[] args) {

		Funcionario myfunc1 = new Funcionario(); 
		Funcionario myfunc2 = new Funcionario(); 			
		Data dtmyfunc = new Data();
		dtmyfunc.dia = 13;
		dtmyfunc.mes = 1;
		dtmyfunc.ano = 1983;

		//myfunc1.mostra();

		myfunc1.nome = "Bruno";
		myfunc1.departamento = "Tecnologia";
		//myfunc1.dtentrada = "13/01/1983";		
		myfunc1.dtentrada = dtmyfunc;
		myfunc1.numRG = "34.546.789-X";

		myfunc2.nome = "Bruno";
		myfunc2.departamento = "Tecnologia";
		//myfunc2.dtentrada = "13/01/1983";		
		myfunc2.dtentrada = dtmyfunc;
		myfunc2.numRG = "34.546.789-X";

		if (myfunc1 == myfunc2) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		
		System.out.println(myfunc1);
		System.out.println(myfunc2);

		myfunc1 = myfunc2;

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
		
		

	}
}
