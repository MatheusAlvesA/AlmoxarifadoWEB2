package br.estoque;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import br.RH.PessoaJuridica;

public class MovimentacaoEstoque implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String responsavel;
	private PessoaJuridica pjOrigem;
	private PessoaJuridica pjDestino;
	private Almoxarifado almoxarifadoOrigem;
	private Almoxarifado almoxarifadoDestino;
	private BigDecimal qtdMovimentada;
	private LoteMaterial itemLote;
	private Material itemMaterial;
	private Date dataMovimentacao;
	private TipoMovimentacao tipoMovimentacao;
	
	public MovimentacaoEstoque() {}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public PessoaJuridica getPjOrigem() {
		return pjOrigem;
	}

	public void setPjOrigem(PessoaJuridica pjOrigem) {
		this.pjOrigem = pjOrigem;
	}

	public PessoaJuridica getPjDestino() {
		return pjDestino;
	}

	public void setPjDestino(PessoaJuridica pjDestino) {
		this.pjDestino = pjDestino;
	}

	public Almoxarifado getAlmoxarifadoOrigem() {
		return almoxarifadoOrigem;
	}

	public void setAlmoxarifadoOrigem(Almoxarifado almoxarifadoOrigem) {
		this.almoxarifadoOrigem = almoxarifadoOrigem;
	}

	public Almoxarifado getAlmoxarifadoDestino() {
		return almoxarifadoDestino;
	}

	public void setAlmoxarifadoDestino(Almoxarifado almoxarifadoDestino) {
		this.almoxarifadoDestino = almoxarifadoDestino;
	}

	public BigDecimal getQtdMovimentada() {
		return qtdMovimentada;
	}

	public void setQtdMovimentada(BigDecimal qtdMovimentada) {
		this.qtdMovimentada = qtdMovimentada;
	}

	public LoteMaterial getItemLote() {
		return itemLote;
	}

	public void setItemLote(LoteMaterial itemLote) {
		this.itemLote = itemLote;
	}

	public Material getItemMaterial() {
		return itemMaterial;
	}

	public void setItemMaterial(Material itemMaterial) {
		this.itemMaterial = itemMaterial;
	}

	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}
	
	@Override
	public String toString() {
		return "Movimentação estoque, responsável: "+this.responsavel;
	}
	
}
