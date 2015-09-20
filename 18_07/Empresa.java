class Empresa {
	String nome;
	String cnpj;
	Funcionario funcarray[];
	int idxfunc=0;
	
	public Empresa (int num){
		this.funcarray = new Funcionario[num];
	}

	public boolean adiciona(Funcionario f){
		if(buscaFuncionario(f)){
			System.out.println("Funcionario " + f.getnome() + " já existe");
			return false;
		}

		if(idxfunc < funcarray.length && funcarray[idxfunc] == null ){
			funcarray[idxfunc] = f;
			System.out.println("Funcionario " + f.getnome() + " adicionado no index " + idxfunc);
			idxfunc++;
			return true;	
		}else{
			System.out.println("Erro. Funcionario " + f.getnome() + " não foi adicionado no index " + idxfunc);
			return false;
		}	
	}
	
	private boolean buscaFuncionario(Funcionario f){
			for(int i = 0; i < funcarray.length; i++){
					if(funcarray[i] == f){
						return true;
					}		
			}
			return false;
	}

}


