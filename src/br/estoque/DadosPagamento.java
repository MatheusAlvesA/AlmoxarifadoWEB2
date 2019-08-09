package br.estoque;

public class DadosPagamento {

	private String banco;
	private String agencia;
	private String codigoIdentificacaoDV;
	
	public DadosPagamento() {}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getCodigoIdentificacaoDV() {
		return codigoIdentificacaoDV;
	}

	public void setCodigoIdentificacaoDV(String codigoIdentificacaoDV) {
		this.codigoIdentificacaoDV = codigoIdentificacaoDV;
	}
	
}
