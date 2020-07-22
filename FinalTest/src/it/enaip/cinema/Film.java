package it.enaip.cinema;

public class Film {
	String film;
	String autore;
	String produttore;
	String genere;
	String durata;
	public Film(String film, String autore, String produttore, String genere, String durata) {
		super();
		this.film = film;
		this.autore = autore;
		this.produttore = produttore;
		this.genere = genere;
		this.durata = durata;
	}
		
		public String getFilm() {
			return film;
		}
		public void setFilm(String film) {
			this.film = film;
		}
		public String getAutore() {
			return autore;
		}
		public void setAutore(String autore) {
			this.autore = autore;
		}
		public String getProduttore() {
			return produttore;
		}
		public void setProduttore(String produttore) {
			this.produttore = produttore;
		}
		public String getGenere() {
			return genere;
		}
		public void setGenere(String genere) {
			this.genere = genere;
		}
		public String getDurata() {
			return durata;
		}
		public void setDurata(String durata) {
			this.durata = durata;
		}
		
		
}
