package br.estoque;

public class PesagemVolume {
	private double peso;
	private ConferenciaPesagem conferencia;

	public PesagemVolume(ConferenciaPesagem c) {
		this.setConferencia(c);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public ConferenciaPesagem getConferencia() {
		return conferencia;
	}

	public void setConferencia(ConferenciaPesagem conferencia) {
		this.conferencia = conferencia;
	}
}
