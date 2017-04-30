package hr.tvz.java.dipl.mb.entitet;

import java.time.LocalDateTime;
import java.util.List;

import hr.tvz.java.dipl.mb.sucelja.TrajanjeIncidenta;

public class Proba {

	
	
	
	
	public static void main(String[] args) {

		
		LocalDateTime kraj = LocalDateTime.of(1989,12,20,00,12);
				
		LocalDateTime pocetak = LocalDateTime.of(1989,4,20,00,00);
		

		//List<String> datumT = TrajanjeIncidenta.Izracun(pocetak, kraj);
		System.out.println();
		System.out.println("Poèetak: "+ pocetak);
		System.out.println("Kraj: "+ kraj);
		//System.out.println("Trajanje : "+datumT);
	}

}
