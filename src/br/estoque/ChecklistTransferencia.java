package br.estoque;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import br.RH.Endereco;

public class ChecklistTransferencia {

	private String material;
	private BigDecimal qtd;
	private Endereco local;
	private Date dataConferencia;
	private String obsercacoes;
	private ArrayList<String> anexoFotos;
	private boolean aprovado;
	
	public ChecklistTransferencia() {
		this.anexoFotos = new ArrayList<String>();
	}
	
	public void addFoto(String foto) {
		this.anexoFotos.add(foto);
	}
	public ArrayList<String> getAnexoFotos() {
		return this.anexoFotos;
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public BigDecimal getQtd() {
		return qtd;
	}
	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}
	public Endereco getLocal() {
		return local;
	}
	public void setLocal(Endereco local) {
		this.local = local;
	}
	public Date getDataConferencia() {
		return dataConferencia;
	}
	public void setDataConferencia(Date dataConferencia) {
		this.dataConferencia = dataConferencia;
	}
	public String getObsercacoes() {
		return obsercacoes;
	}
	public void setObsercacoes(String obsercacoes) {
		this.obsercacoes = obsercacoes;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
}
