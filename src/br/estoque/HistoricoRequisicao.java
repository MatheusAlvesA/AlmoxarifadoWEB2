package br.estoque;

import java.util.Date;

public class HistoricoRequisicao {

	private Date dataRegistro;
	private StatusRequisicao status;
	private String usuario;
	private String observacoes;
	
	public HistoricoRequisicao() {}
	
	public Date getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public StatusRequisicao getStatus() {
		return status;
	}
	public void setStatus(StatusRequisicao status) {
		this.status = status;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
}
