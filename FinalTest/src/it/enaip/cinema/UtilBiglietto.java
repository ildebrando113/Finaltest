package it.enaip.cinema;

import java.text.ParseException;

public class UtilBiglietto {
		
	public void appilicaRiduzioneAnziani(Spettatore spettatore,Biglietto biglietto) throws ParseException {
		UtilSpettatore.getInstance().scontoAnziani(spettatore, biglietto);		
	}
	public void calcolaRiduzioneBamabini(Spettatore spettatore,Biglietto biglietto) throws ParseException {
		UtilSpettatore.getInstance().scontoBambini(spettatore, biglietto);
		
	}
}
