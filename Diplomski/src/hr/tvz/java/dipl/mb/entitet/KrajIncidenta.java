package hr.tvz.java.dipl.mb.entitet;

import java.time.LocalDate;
import java.time.LocalTime;

public class KrajIncidenta {
	
	private LocalDate datum;
	private LocalTime sat;
	
	public KrajIncidenta(LocalDate datum, LocalTime sat) {
		this.datum = datum;		
		this.sat = sat;
	}
	
	public LocalDate getDatum() {
		return datum;
	}
	
	public LocalTime getSat() {
		return sat;
	}
}
