package ProgramacaoOrientadaAObjetos;

public class TesteCliente {

	public static void main(String[] args) {
	
		cliente client1 = new cliente ("Livraria legal","varejo cultural","Avenida Literaria","George R.R. Martin",0,500);
		cliente client2 = new cliente ("Cachorro quente de Osasco","Alimentício","Avenida dos Autonomistas","Octavia E.Butler",0,500);
		
		client1.imprimirInfo();
		client2.imprimirInfo();
	}

}
