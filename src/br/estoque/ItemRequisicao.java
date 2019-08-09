package br.estoque;

import java.math.BigDecimal;

public class ItemRequisicao {

	private String material;
	private BigDecimal qtdRequisitada;
	private BigDecimal qtdAtentida;
	private String unidadeMedida;
	
	public ItemRequisicao() {}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public BigDecimal getQtdRequisitada() {
		return qtdRequisitada;
	}
	public void setQtdRequisitada(BigDecimal qtdRequisitada) {
		this.qtdRequisitada = qtdRequisitada;
	}
	public BigDecimal getQtdAtentida() {
		return qtdAtentida;
	}
	public void setQtdAtentida(BigDecimal qtdAtentida) {
		this.qtdAtentida = qtdAtentida;
	}
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}	
}
