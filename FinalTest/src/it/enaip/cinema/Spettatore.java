package it.enaip.cinema;

import java.sql.Date;


public class Spettatore {
	String nome;
	String cognome;
	String datanascita;
	Biglietto biglietto;
	int idSpettatore;
	public Spettatore() {};
	
	public Spettatore(int idSpettatore, String nome, String cognome, String datanascita, Biglietto biglietto) {
			super();
			this.idSpettatore = idSpettatore;
			this.nome = nome;
			this.cognome = cognome;
			this.datanascita = datanascita;
			this.biglietto = biglietto;
		}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getDatanascita() {
		return datanascita;
	}

	public void setDatanascita(String Date) {
		this.datanascita = datanascita;
	}

	public Biglietto getBiglietto() {
		return biglietto;
	}

	public void setBiglietto(Biglietto biglietto) {
		this.biglietto = biglietto;
	}

	public int getIdSpettatore() {
		return idSpettatore;
	}

	public void setIdSpettatore(int idSpettatore) {
		this.idSpettatore = idSpettatore;
	}

	@Override
	public String toString() {
		return "Spettatore [nome=" + nome + ", cognome=" + cognome + ", datanascita=" + datanascita + ", biglietto="
				+ biglietto + ", idSpettatore=" + idSpettatore + "]";
	}
		
	
		
}
