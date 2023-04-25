package ProgramacaoOrientadaAObjetos;

public class cliente {
	
	private String nomeCliente;
	private String ramoNegocio;
	private String endereço;
	private String ceo;
	private int totalCompras;
	//Métodos construtores
	public cliente(String nomeCliente, String ramoNegocio, String endereço, String cEO, int totalFuncionarios,
			int totalCompras) {
		super();
		this.nomeCliente = nomeCliente;
		this.ramoNegocio = ramoNegocio;
		this.endereço = endereço;
		ceo = cEO;
		this.totalCompras = totalCompras;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getRamoNegocio() {
		return ramoNegocio;
	}
	public void setRamoNegocio(String ramoNegocio) {
		this.ramoNegocio = ramoNegocio;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getCEO() {
		return ceo;
	}
	public void setCEO(String ceo) {
		this.ceo = ceo;
	}

	public int getTotalCompras() {
		return totalCompras;
	}
	public void setTotalCompras(int totalCompras) {
		this.totalCompras = totalCompras;
		
		
	}
	
	public void imprimirInfo() {
		System.out.println("\nO cliente "+nomeCliente+", que atua no ramo de "+ramoNegocio+", localizada no endereço "+endereço+", cujo proprietário é o/a Sr./Sra. "+ceo+
				" possui um total de compras de "+totalCompras+" produtos da nossa empresa!!!!!");
	}
	

}
