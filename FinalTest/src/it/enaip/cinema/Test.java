package it.enaip.cinema;



import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;



public class Test {
		public static void main(String []args) throws ParseException {
			
			Biglietto biglietto1 = new Biglietto("A1",15);
			Spettatore spet1 = new Spettatore(1,"gianmarco","rossi","2000-05-04",biglietto1);
			Biglietto biglietto2 = new Biglietto("A2",15);
			Spettatore spet2 = new Spettatore(2,"marco","verdi","2017-05-04",biglietto2);
			Biglietto biglietto3 = new Biglietto("A3",15);
			Spettatore spet3 = new Spettatore(3,"luca","bianchi","1942-09-06",biglietto3);
			Biglietto biglietto4 = new Biglietto("A4",15);
			Spettatore spet4 = new Spettatore(4,"alex","simonetti","1998-12-25",biglietto4);				
			Biglietto biglietto5 = new Biglietto("A5",15);
			Spettatore spet5 = new Spettatore(5,"sofia","rossi","2018-11-06",biglietto5);
			List<Spettatore> spettatori = new ArrayList<>();
			spettatori.add(spet1);
			spettatori.add(spet2);
			spettatori.add(spet3);
			spettatori.add(spet4);
			spettatori.add(spet5);
			Film film = new Film("TuoFilm","xxxx", "dreamworks", "Horror", "2h");
			SalaCinematografica sala1 = new SalaCinematografica (spettatori,film);
			sala1.mostraLista();
			int somma = sala1.calcolaIncasso();
			System.out.println(somma);
			sala1.consentiIngresso(spet5, film);
			sala1.mostraLista();
			
			
		}
}
