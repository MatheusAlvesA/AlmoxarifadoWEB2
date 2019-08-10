package br.estoque;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import br.RH.PessoaJuridica;

public class NotaFiscal implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int serieNF;
	private int numeroNF;
	private PessoaJuridica transportadora;
	private PessoaJuridica emitente;
	private PessoaJuridica destinatario;
	private BigDecimal valorTotal;
	private Date dataEmissao;
	private String placaVeiculo;
	private String motorista;

	public int getSerieNF() {
		return serieNF;
	}
	public void setSerieNF(int serieNF) {
		this.serieNF = serieNF;
	}
	public int getNumeroNF() {
		return numeroNF;
	}
	public void setNumeroNF(int numeroNF) {
		this.numeroNF = numeroNF;
	}
	public PessoaJuridica getTransportadora() {
		return transportadora;
	}
	public void setTransportadora(PessoaJuridica transportadora) {
		this.transportadora = transportadora;
	}
	public PessoaJuridica getEmitente() {
		return emitente;
	}
	public void setEmitente(PessoaJuridica emitente) {
		this.emitente = emitente;
	}
	public PessoaJuridica getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(PessoaJuridica destinatario) {
		this.destinatario = destinatario;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	public String getMotorista() {
		return motorista;
	}
	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}
	
	@Override
	public String toString() {
		return "Nota fiscal número: "+this.numeroNF;
	}
	
}
