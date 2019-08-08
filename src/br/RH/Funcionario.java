package br.RH;

import java.util.ArrayList;

import br.estoque.ChecklistRecebimentoComum;

public class Funcionario {
	private ArrayList<ChecklistRecebimentoComum> recebidos;
	
	public Funcionario() {
		this.recebidos = new ArrayList<ChecklistRecebimentoComum>();
	}

	public ArrayList<ChecklistRecebimentoComum> getRecebidos() {
		return recebidos;
	}

	public void addRecebidos(ChecklistRecebimentoComum recebido) {
		this.recebidos.add(recebido);
	}
}
