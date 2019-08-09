package br.estoque;

import java.math.BigDecimal;

public class Material {

	private int codigo;
	private String nome;
	private String especificacao;
	private GrupoMaterial grupoMaterial;
	private int estoqueMinimo;
	private int pontoPedido;
	private UnidadeMedida unidadeEstoque;
	private UnidadeMedida unidadeEntrada;
	private BigDecimal fatorConversaoEntrada;
	private String dadosAdicionais;
	private ClassificacaoMaterial classificacao;
	private int catmat;
	private String condicaoArmazenamento;
	private StatusMaterial status;
	
	public Material() {}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public GrupoMaterial getGrupoMaterial() {
		return grupoMaterial;
	}

	public void setGrupoMaterial(GrupoMaterial grupoMaterial) {
		this.grupoMaterial = grupoMaterial;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public int getPontoPedido() {
		return pontoPedido;
	}

	public void setPontoPedido(int pontoPedido) {
		this.pontoPedido = pontoPedido;
	}

	public UnidadeMedida getUnidadeEstoque() {
		return unidadeEstoque;
	}

	public void setUnidadeEstoque(UnidadeMedida unidadeEstoque) {
		this.unidadeEstoque = unidadeEstoque;
	}

	public UnidadeMedida getUnidadeEntrada() {
		return unidadeEntrada;
	}

	public void setUnidadeEntrada(UnidadeMedida unidadeEntrada) {
		this.unidadeEntrada = unidadeEntrada;
	}

	public BigDecimal getFatorConversaoEntrada() {
		return fatorConversaoEntrada;
	}

	public void setFatorConversaoEntrada(BigDecimal fatorConversaoEntrada) {
		this.fatorConversaoEntrada = fatorConversaoEntrada;
	}

	public String getDadosAdicionais() {
		return dadosAdicionais;
	}

	public void setDadosAdicionais(String dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}

	public ClassificacaoMaterial getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(ClassificacaoMaterial classificacao) {
		this.classificacao = classificacao;
	}

	public int getCatmat() {
		return catmat;
	}

	public void setCatmat(int catmat) {
		this.catmat = catmat;
	}

	public String getCondicaoArmazenamento() {
		return condicaoArmazenamento;
	}

	public void setCondicaoArmazenamento(String condicaoArmazenamento) {
		this.condicaoArmazenamento = condicaoArmazenamento;
	}

	public StatusMaterial getStatus() {
		return status;
	}

	public void setStatus(StatusMaterial status) {
		this.status = status;
	}
	
}
