package br.estoque;

import java.util.ArrayList;

import br.RH.Setor;

public class SaidaRequisicaoInterna {

	private String codigo;
	private String usuario;
	private Setor setorRequisitante;
	private String responsavelSetor;
	private StatusRequisicao statusRequisicao;
	private ArrayList<ItemRequisicao> itensRequisicao;
	private ArrayList<HistoricoRequisicao> historicosRequisicao;
	//private SaidaEstoque saidaEstoque;
	
	public SaidaRequisicaoInterna() {
		this.itensRequisicao = new ArrayList<ItemRequisicao>();
		this.historicosRequisicao = new ArrayList<HistoricoRequisicao>();
	}
	
	public void addItem(ItemRequisicao item) {
		this.itensRequisicao.add(item);
	}
	public void addHistorico(HistoricoRequisicao historico) {
		this.historicosRequisicao.add(historico);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Setor getSetorRequisitante() {
		return setorRequisitante;
	}
	public void setSetorRequisitante(Setor setorRequisitante) {
		this.setorRequisitante = setorRequisitante;
	}
	public String getResponsavelSetor() {
		return responsavelSetor;
	}
	public void setResponsavelSetor(String responsavelSetor) {
		this.responsavelSetor = responsavelSetor;
	}
	public StatusRequisicao getStatusRequisicao() {
		return statusRequisicao;
	}
	public void setStatusRequisicao(StatusRequisicao statusRequisicao) {
		this.statusRequisicao = statusRequisicao;
	}
	public ArrayList<ItemRequisicao> getItensRequisicao() {
		return itensRequisicao;
	}
	public ArrayList<HistoricoRequisicao> getHistoricosRequisicao() {
		return historicosRequisicao;
	}
	
}
