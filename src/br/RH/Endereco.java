package br.RH;

import java.util.ArrayList;

import br.estoque.ChecklistTransferencia;

public class Endereco {

	private String endereco;
	private ArrayList<ChecklistTransferencia> checkList;

	public Endereco() {
		this.checkList = new ArrayList<ChecklistTransferencia>();
	}
	
	public void addCheckListTransferencia(ChecklistTransferencia c) {
		this.checkList.add(c);
	}
	public ArrayList<ChecklistTransferencia> getCheckListTransferencia() {
		return this.checkList;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
