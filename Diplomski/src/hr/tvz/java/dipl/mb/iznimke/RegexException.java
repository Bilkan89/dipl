package hr.tvz.java.dipl.mb.iznimke;

public class RegexException extends RuntimeException{

	public RegexException(){
		super("Pogre�ka prilikom unosa! Provjerite unesene podatke.");
		//super("Neispravan rad pograma bacanje ozna�ene iznimke na koju program ne utje�e");
	}

	public RegexException(String poruka){
		super(poruka);
	}

	public RegexException(Throwable uzrok){
		super(uzrok);
	}

	public RegexException(String poruka, Throwable uzrok){
		super(poruka, uzrok);
	}

}
	
	