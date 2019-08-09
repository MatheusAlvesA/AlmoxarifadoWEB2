package br.estoque;

import java.util.ArrayList;

public class Almoxarifado {

	private String nome;
	private String chefe;
	private ArrayList<TipoMaterial> tiposMateriais;
	private ArrayList<String> usuariosAlmozarifado;
	private boolean enderecado;
	private ArrayList<LocalizacaoAlmoxarifado> localizacoes;
	
	public Almoxarifado() {}
	
	public void addTipoMaterial(TipoMaterial material) {
		this.tiposMateriais.add(material);
	}
	public void addUsuario(String usuario) {
		this.usuariosAlmozarifado.add(usuario);
	}
	public void addLocalizacao(LocalizacaoAlmoxarifado localizacao) {
		this.localizacoes.add(localizacao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getChefe() {
		return chefe;
	}

	public void setChefe(String chefe) {
		this.chefe = chefe;
	}

	public boolean isEnderecado() {
		return enderecado;
	}

	public void setEnderecado(boolean enderecado) {
		this.enderecado = enderecado;
	}

	public ArrayList<TipoMaterial> getTiposMateriais() {
		return tiposMateriais;
	}

	public ArrayList<String> getUsuariosAlmozarifado() {
		return usuariosAlmozarifado;
	}

	public ArrayList<LocalizacaoAlmoxarifado> getLocalizacoes() {
		return localizacoes;
	}
	
}
