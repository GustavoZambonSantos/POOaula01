package ProgramacaoOrientadaAObjetos;

public class Funcionario {
	private String nomeFuncionario;
	private String funcao;
	private String local;
	private int periodo;
	private double salario;
	
	
	public Funcionario(String nomeFuncionario, String funcao, String local, int periodo, double salario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.funcao = funcao;
		this.local = local;
		this.periodo = periodo;
		this.salario = salario;
	}


	public String getNomeFuncionario() {
		return nomeFuncionario;
	}


	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}


	public String getFuncao() {
		return funcao;
	}


	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public int getPeriodo() {
		return periodo;
	}


	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
		
		
	}

	public void imprimirInfo() {
		System.out.println("\nO funcionário (a) "+nomeFuncionario+", que hoje é nosso(a) "+funcao+", mora na "+local+" desde "+periodo+" e recebe um salário de: R$"+salario);
	
	}
}
