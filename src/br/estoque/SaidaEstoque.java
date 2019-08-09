package br.estoque;

import java.util.ArrayList;
import java.util.Date;

import br.RH.PessoaJuridica;

public class SaidaEstoque {

	private String responsavel;
	private Date dataEnvio;
	private Date dataCriacao;
	private ArrayList<String> itens;
	private StatusMovimentacao status;
	private String observacoes;
	private PessoaJuridica transportadora;
	private ArrayList<String> anexos;
	private GuiaRemessa guiaRemessa;
	private PessoaJuridica pjDestinatario;
	private String justificativa;
	
	public SaidaEstoque() {
		this.itens = new ArrayList<String>();
		this.anexos = new ArrayList<String>();
	}

	public void addItem(String item) {
		this.itens.add(item);
	}
	
	public void addAnexo(String anexo) {
		this.anexos.add(anexo);
	}
	
	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public StatusMovimentacao getStatus() {
		return status;
	}

	public void setStatus(StatusMovimentacao status) {
		this.status = status;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public PessoaJuridica getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(PessoaJuridica transportadora) {
		this.transportadora = transportadora;
	}

	public GuiaRemessa getGuiaRemessa() {
		return guiaRemessa;
	}

	public void setGuiaRemessa(GuiaRemessa guiaRemessa) {
		this.guiaRemessa = guiaRemessa;
	}

	public PessoaJuridica getPjDestinatario() {
		return pjDestinatario;
	}

	public void setPjDestinatario(PessoaJuridica pjDestinatario) {
		this.pjDestinatario = pjDestinatario;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public ArrayList<String> getItens() {
		return itens;
	}

	public ArrayList<String> getAnexos() {
		return anexos;
	}
	
}
