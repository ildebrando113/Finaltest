package it.enaip.cinema;

import java.text.ParseException;

public interface Dao<T> {
		
	//public   void addSpettatore();
	
	public void consentiIngresso(Spettatore spettatore,Film film) throws ParseException;
	
	public int calcolaIncasso();
	
	public void mostraLista();
	
	public void svuotaSala();
}
