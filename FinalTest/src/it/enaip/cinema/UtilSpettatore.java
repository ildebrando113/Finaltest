package it.enaip.cinema;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UtilSpettatore {
		
	
	
	private UtilSpettatore(){}

    private static class SingletonHelper{
        
        private static final UtilSpettatore INSTANCE = new UtilSpettatore();
    }
    
    public static UtilSpettatore getInstance(){
        return SingletonHelper.INSTANCE;
    }
			public boolean minorenne(Spettatore spettatore) throws ParseException {
				
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
				java.util.Date minorenne = sdf.parse("2003-01-01");
				Date date = (Date) sdf.parse(spettatore.getDatanascita());
				if (date.before(minorenne)) {
					return true;
				}
				else return false;
				
			}
				
			
			public int scontoBambini (Spettatore spettatore,Biglietto biglietto) throws ParseException {

				int sconto;
			
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
				Date bambini =(Date) sdf.parse("2015-01-01");
				Date date = (Date) sdf.parse(spettatore.getDatanascita());
				if (date.after((bambini))) {
					sconto = biglietto.getPrezzo();
					sconto= sconto/100*50;
					return sconto;
				}
				return 0;
			}
			public int scontoAnziani (Spettatore spettatore,Biglietto biglietto) throws ParseException {

				int sconto;
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
				Date anziani =(Date) sdf.parse("1940-01-01");
				Date date = (Date) sdf.parse(spettatore.getDatanascita());
				if (date.before(anziani)) {
					sconto = biglietto.getPrezzo();
					sconto= sconto/100*10;
					return sconto;
				}
				return 0;
			}
}
