package ProgramacaoOrientadaAObjetos;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario nome1 = new Funcionario("Mario Puzo","Autor","Italia",1945,50000);
		Funcionario nome2 = new Funcionario("Conceição Evaristo","Escritora","Bahia",1980,100000);
				
		nome1.imprimirInfo();
		nome2.imprimirInfo();

	}

}
