package br.estoque;

import java.util.ArrayList;
import java.util.Date;

public class EntradaEstoque {

	private String codigo;
	private ArrayList<String> itens;
	private StatusMovimentacao status;
	private String observacao;
	private String responsavel;
	private Date dataCriacao;
	private Date dataEntrada;
	private ArrayList<String> anexos;
	private boolean precisaConferenciaEstado;
	private boolean precisaPasagem;
	private boolean precisaAnalize;
	private NotaFiscal notaFiscal;
	private ChecklistRecebimentoComum checkListRecebimento;
	private ConferenciaPesagem conferenciaPesagem;
	private ChecklistTransferencia checkListTransferencia;
	private String justificativa;
	private TipoEntrada tipoEntrada;

	public EntradaEstoque() {
		this.itens = new ArrayList<String>();
		this.anexos = new ArrayList<String>();
	}
	
	public void addItem(String item) {
		this.itens.add(item);
	}
	public void addAnexo(String anexo) {
		this.anexos.add(anexo);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public StatusMovimentacao getStatus() {
		return status;
	}
	public void setStatus(StatusMovimentacao status) {
		this.status = status;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public boolean isPrecisaConferenciaEstado() {
		return precisaConferenciaEstado;
	}
	public void setPrecisaConferenciaEstado(boolean precisaConferenciaEstado) {
		this.precisaConferenciaEstado = precisaConferenciaEstado;
	}
	public boolean isPrecisaPasagem() {
		return precisaPasagem;
	}
	public void setPrecisaPasagem(boolean precisaPasagem) {
		this.precisaPasagem = precisaPasagem;
	}
	public boolean isPrecisaAnalize() {
		return precisaAnalize;
	}
	public void setPrecisaAnalize(boolean precisaAnalize) {
		this.precisaAnalize = precisaAnalize;
	}
	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public ChecklistRecebimentoComum getCheckListRecebimento() {
		return checkListRecebimento;
	}
	public void setCheckListRecebimento(ChecklistRecebimentoComum checkListRecebimento) {
		this.checkListRecebimento = checkListRecebimento;
	}
	public ConferenciaPesagem getConferenciaPesagem() {
		return conferenciaPesagem;
	}
	public void setConferenciaPesagem(ConferenciaPesagem conferenciaPesagem) {
		this.conferenciaPesagem = conferenciaPesagem;
	}
	public ChecklistTransferencia getCheckListTransferencia() {
		return checkListTransferencia;
	}
	public void setCheckListTransferencia(ChecklistTransferencia checkListTransferencia) {
		this.checkListTransferencia = checkListTransferencia;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	public TipoEntrada getTipoEntrada() {
		return tipoEntrada;
	}
	public void setTipoEntrada(TipoEntrada tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}
	public ArrayList<String> getItens() {
		return itens;
	}
	public ArrayList<String> getAnexos() {
		return anexos;
	}
	
}
