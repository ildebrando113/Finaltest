package it.enaip.cinema;

import java.util.ArrayList;

public class Cinema {
		int incasso;
		
		ArrayList<SalaCinematografica> sale;
		private Cinema() {
			sale= new ArrayList<SalaCinematografica>();
		}
		public int CalcolaIncassoSale() {
			int sommatot=0;
			for (SalaCinematografica sala :sale) {
				sommatot+= sala.calcolaIncasso();
			}
			return sommatot;
		}
}
