package it.enaip.cinema;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class SalaCinematografica implements Dao {
		private static final int MAXSPET = 100;
		ArrayList<Spettatore> sale;
		Film film;
		
		
		
		
		
		public SalaCinematografica(List<Spettatore> spettatori, Film film) {
			this.sale=(ArrayList<Spettatore>) spettatori;
			this.film = film;
		}



		/*
		public void addSpettatore(int idSpettatore, String nome, String cognome,String birthdate, Biglietto biglietto) {
				sale.add(new Spettatore(idSpettatore, nome, cognome, birthdate, biglietto));
		}
		*/
		public void svuotaSala() {
			sale.clear();
		}
		public void consentiIngresso(Spettatore spettatore,Film film) throws ParseException {
			int spettatori= 0;
			
			for (Spettatore spet : sale) {
				spettatori ++;
			}
			
			if (spettatori<MAXSPET) {
				if (film.getGenere().equalsIgnoreCase("Horror")){
					
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
					Date  horror = (Date) sdf.parse("2004-01-01");
					Date date = (Date) sdf.parse(spettatore.getDatanascita());
					if (date.after(horror)) {
						System.out.println("FilmVietato");
						}
					else sale.add(spettatore);
					}
					
					
				
			}
			if(spettatori>=MAXSPET) {
				System.out.println("SalaAlCompleto");
			}
		}
		public int calcolaIncasso() {
			int somma=0;
			for(Spettatore spet :sale) {
				somma+=spet.biglietto.getPrezzo();
			}
			return somma;
			
		}
		public  List<Spettatore> findAll(){
			List<Spettatore> copia = new ArrayList<Spettatore>();
			for (Spettatore spet : sale) {
				Spettatore spett = new Spettatore(spet.getIdSpettatore(),spet.getNome(),spet.getCognome(),spet.datanascita,spet.getBiglietto());
				copia.add(spett);
			}
			return copia;
			
		}
		public void mostraLista() {
			System.out.println(film.getFilm());
			for (Spettatore spet :sale) {
				System.out.println(spet.toString());
				System.out.println(spet.biglietto.toString());
				
			}
		}




		




		
				
}
