package br.estoque;

import java.util.Date;

public class GuiaRemessa {

	private int numeroGuiaRemessa;
	private Date dataEmissao;
	private ViaTransporte viaTransporte;
	private String especieEmbalegem;
	private NaturezaOperacao naturezaOperacao;
	private int remessa;
	
	public GuiaRemessa() {}
	
	public int getNumeroGuiaRemessa() {
		return numeroGuiaRemessa;
	}
	public void setNumeroGuiaRemessa(int numeroGuiaRemessa) {
		this.numeroGuiaRemessa = numeroGuiaRemessa;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public ViaTransporte getViaTransporte() {
		return viaTransporte;
	}
	public void setViaTransporte(ViaTransporte viaTransporte) {
		this.viaTransporte = viaTransporte;
	}
	public String getEspecieEmbalegem() {
		return especieEmbalegem;
	}
	public void setEspecieEmbalegem(String especieEmbalegem) {
		this.especieEmbalegem = especieEmbalegem;
	}
	public NaturezaOperacao getNaturezaOperacao() {
		return naturezaOperacao;
	}
	public void setNaturezaOperacao(NaturezaOperacao naturezaOperacao) {
		this.naturezaOperacao = naturezaOperacao;
	}
	public int getRemessa() {
		return remessa;
	}
	public void setRemessa(int remessa) {
		this.remessa = remessa;
	}
	
}
