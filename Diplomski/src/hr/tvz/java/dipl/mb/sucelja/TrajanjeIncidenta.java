package hr.tvz.java.dipl.mb.sucelja;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public interface TrajanjeIncidenta {

	
	public default List<String> Izracun(LocalDateTime pocetak, LocalDateTime kraj){
//ALGORITAM PREUZET SA http://stackoverflow.com/questions/25747499/java-8-calculate-difference-between-two-localdatetime 
//ALOGIRATM JE MODIFICIRAN ZA POTREBE PROJEKTA
		
		LocalDateTime tempDateTime = LocalDateTime.from( pocetak );
//		Calculates the amount of time until another date-time in terms of the specified unit. 
//		.until() - This calculates the amount of time between two LocalDateTime objects in terms of a single TemporalUnit. 
//		The start and end points are this and the specified date-time.

		long years = tempDateTime.until( kraj, ChronoUnit.YEARS); 
		tempDateTime = tempDateTime.plusYears( years );

		long months = tempDateTime.until( kraj, ChronoUnit.MONTHS);
		tempDateTime = tempDateTime.plusMonths( months );

		long days = tempDateTime.until( kraj, ChronoUnit.DAYS);
		tempDateTime = tempDateTime.plusDays( days );


		long hours = tempDateTime.until( kraj, ChronoUnit.HOURS);
		tempDateTime = tempDateTime.plusHours( hours );

		long minutes = tempDateTime.until( kraj, ChronoUnit.MINUTES);
		tempDateTime = tempDateTime.plusMinutes( minutes );

		System.out.println( years + " years " + 
		        months + " months " + 
		        days + " days " +
		        hours + " hours " +
		        minutes + " minutes ");
		
		long[] izracun = {years,months,days,hours,minutes,};
		List<String> filtrirano = new ArrayList<String>();
						
//		for (long vijednost : izracun ) {
//			if(vijednost != 0){
//				filtrirano.add(String.valueOf(vijednost)); 
//			}				
//		}	
		
		for (int i = 0; i < izracun.length; i++) {
			if(i == 0 && izracun[i] > 0)
				filtrirano.add(izracun[0]+" godina ");
			if(i == 1 && izracun[i] > 0)
				filtrirano.add(izracun[1]+" mjesec ");
			if(i == 2 && izracun[i] > 0)
				filtrirano.add(izracun[2]+" dana ");
			if(i == 3 && izracun[i] > 0)
				filtrirano.add(izracun[3]+" sati ");
			if(i == 4 && izracun[i] > 0)
				filtrirano.add(izracun[4]+" minuta ");
		}
		
		
	return filtrirano;
	}
	
	
	
}
