package br.estoque;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Estoque {

	private BigDecimal qtdDecimal;
	private Almoxarifado almoxarifado;
	private LoteMaterial lote;
	private Material material;
	private BigDecimal qtdMaxima;
	private ArrayList<MovimentacaoEstoque> historicoMovimentacoes;
	
	public Estoque() {
		this.historicoMovimentacoes = new ArrayList<MovimentacaoEstoque>();
	}
	
	public void addMovimentacao(MovimentacaoEstoque movimentacao) {
		this.historicoMovimentacoes.add(movimentacao);
	}

	public BigDecimal getQtdDecimal() {
		return qtdDecimal;
	}

	public void setQtdDecimal(BigDecimal qtdDecimal) {
		this.qtdDecimal = qtdDecimal;
	}

	public Almoxarifado getAlmoxarifado() {
		return almoxarifado;
	}

	public void setAlmoxarifado(Almoxarifado almoxarifado) {
		this.almoxarifado = almoxarifado;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public BigDecimal getQtdMaxima() {
		return qtdMaxima;
	}

	public void setQtdMaxima(BigDecimal qtdMaxima) {
		this.qtdMaxima = qtdMaxima;
	}

	public ArrayList<MovimentacaoEstoque> getHistoricoMovimentacoes() {
		return historicoMovimentacoes;
	}
	
	
	
}
