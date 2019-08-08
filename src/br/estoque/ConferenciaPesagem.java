package br.estoque;

import java.util.ArrayList;
import java.util.Date;

public class ConferenciaPesagem {

	private Date data;
	private String lote;
	private int numeroVolumes;
	private double taraKg;
	private boolean executado;
	private boolean conferido;
	private ArrayList<PesagemVolume> pesoVolume;

	public ConferenciaPesagem() {
		this.pesoVolume = new ArrayList<PesagemVolume>();
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public int getNumeroVolumes() {
		return numeroVolumes;
	}
	public void setNumeroVolumes(int numeroVolumes) {
		this.numeroVolumes = numeroVolumes;
	}
	public double getTaraKg() {
		return taraKg;
	}
	public void setTaraKg(double taraKg) {
		this.taraKg = taraKg;
	}
	public boolean isExecutado() {
		return executado;
	}
	public void setExecutado(boolean executado) {
		this.executado = executado;
	}
	public boolean isConferido() {
		return conferido;
	}
	public void setConferido(boolean conferido) {
		this.conferido = conferido;
	}
	public ArrayList<PesagemVolume> getPesagens() {
		return this.pesoVolume;
	}
	public void addPesagem(PesagemVolume peso) {
		this.pesoVolume.add(peso);
	}
	
}
