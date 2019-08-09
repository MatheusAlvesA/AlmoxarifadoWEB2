package br.estoque;

import java.math.BigDecimal;

public class DimensaoUnidade {
	
	private BigDecimal altura;
	private BigDecimal largura;
	private BigDecimal profundidade;
	
	public DimensaoUnidade() {}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public BigDecimal getLargura() {
		return largura;
	}

	public void setLargura(BigDecimal largura) {
		this.largura = largura;
	}

	public BigDecimal getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(BigDecimal profundidade) {
		this.profundidade = profundidade;
	}
	
}
