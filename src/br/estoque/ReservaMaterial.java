package br.estoque;

import java.math.BigDecimal;

public class ReservaMaterial {

	private BigDecimal qtd;
	private Material material;
	private String solicitante;
	
	public ReservaMaterial() {}

	public BigDecimal getQtd() {
		return qtd;
	}

	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}
	
}
