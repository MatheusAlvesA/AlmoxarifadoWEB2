package br.estoque;

import java.util.ArrayList;
import java.util.Date;

import br.RH.Funcionario;

public class ChecklistRecebimentoComum {

	private Date dataChegada;
	private String lote;
	private boolean materialConferenciaNF;
	private boolean etiquetadoIdentificacao;
	private boolean embalagemIntegra;
	private boolean embalagemSuja;
	private boolean embalagemUmida;
	private boolean embalagemDeformada;
	private boolean embalagemVazada;
	private boolean embalagemLacreViolado;
	private String placa;
	private float temperatura;
	private int numeroConhecimento;
	private String motorista;
	private String observacoes;
	private Funcionario conferente;
	private ArrayList<String> anexoFotos;
	private boolean aprovado;
	
	public ChecklistRecebimentoComum() {
		this.anexoFotos = new ArrayList<String>();
	}
	
	public Date getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public boolean isMaterialConferenciaNF() {
		return materialConferenciaNF;
	}
	public void setMaterialConferenciaNF(boolean materialConferenciaNF) {
		this.materialConferenciaNF = materialConferenciaNF;
	}
	public boolean isEtiquetadoIdentificacao() {
		return etiquetadoIdentificacao;
	}
	public void setEtiquetadoIdentificacao(boolean etiquetadoIdentificacao) {
		this.etiquetadoIdentificacao = etiquetadoIdentificacao;
	}
	public boolean isEmbalagemIntegra() {
		return embalagemIntegra;
	}
	public void setEmbalagemIntegra(boolean embalagemIntegra) {
		this.embalagemIntegra = embalagemIntegra;
	}
	public boolean isEmbalagemSuja() {
		return embalagemSuja;
	}
	public void setEmbalagemSuja(boolean embalagemSuja) {
		this.embalagemSuja = embalagemSuja;
	}
	public boolean isEmbalagemUmida() {
		return embalagemUmida;
	}
	public void setEmbalagemUmida(boolean embalagemUmida) {
		this.embalagemUmida = embalagemUmida;
	}
	public boolean isEmbalagemDeformada() {
		return embalagemDeformada;
	}
	public void setEmbalagemDeformada(boolean embalagemDeformada) {
		this.embalagemDeformada = embalagemDeformada;
	}
	public boolean isEmbalagemVazada() {
		return embalagemVazada;
	}
	public void setEmbalagemVazada(boolean embalagemVazada) {
		this.embalagemVazada = embalagemVazada;
	}
	public boolean isEmbalagemLacreViolado() {
		return embalagemLacreViolado;
	}
	public void setEmbalagemLacreViolado(boolean embalagemLacreViolado) {
		this.embalagemLacreViolado = embalagemLacreViolado;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	public int getNumeroConhecimento() {
		return numeroConhecimento;
	}
	public void setNumeroConhecimento(int numeroConhecimento) {
		this.numeroConhecimento = numeroConhecimento;
	}
	public String getMotorista() {
		return motorista;
	}
	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Funcionario getConferente() {
		return conferente;
	}
	public void setConferente(Funcionario conferente) {
		this.conferente = conferente;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	public void addAnexo(String anexo) {
		this.anexoFotos.add(anexo);
	}
	public ArrayList<String> getAnexoFotos() {
		return this.anexoFotos;
	}
	
}
