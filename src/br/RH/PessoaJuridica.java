package br.RH;

import java.util.ArrayList;

import br.estoque.NotaFiscal;

public class PessoaJuridica {
	
	private ArrayList<NotaFiscal> notasFiscais;
	
	public PessoaJuridica() {
		this.notasFiscais = new ArrayList<NotaFiscal>();
	}
	
	public void addNotaFiscal(NotaFiscal nota) {
		this.notasFiscais.add(nota);
	}
	
}
