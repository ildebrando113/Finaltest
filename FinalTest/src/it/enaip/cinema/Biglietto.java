package it.enaip.cinema;

public class Biglietto {
			String posto;
			int prezzo;
			public Biglietto(String posto, int prezzo) {
				super();
				this.posto = posto;
				this.prezzo = prezzo;
			}
			@Override
			public String toString() {
				return "Biglietto [posto=" + posto + ", prezzo=" + prezzo + "]";
			}
			public String getPosto() {
				return posto;
			}
			public void setPosto(String posto) {
				this.posto = posto;
			}
			public int getPrezzo() {
				return prezzo;
			}
			public void setPrezzo(int prezzo) {
				this.prezzo = prezzo;
			}
			
}
