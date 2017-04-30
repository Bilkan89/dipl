package hr.tvz.java.dipl.mb.sucelja;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import hr.tvz.java.dipl.mb.iznimke.RegexException;

public interface ProvjeraPodataka {
	
	public default void provjeraSlova(String zaProvjeru ) throws RegexException{
		//Default methods enable you to add new functionality to the interfaces
		//of your libraries and ensure binary compatibility with code written for older versions of those interfaces.
		
		//prona�i jedino mala ili velika slova na po�etku, koja se ponavljaju 4 ili vi�e puta. 
		Pattern patternSlova = Pattern.compile("^[a-zA-Z]{4,}$");			
		Matcher matcherSl = patternSlova.matcher(zaProvjeru);	
					
		if(!matcherSl.find()){
			throw new RegexException();
		}		
	}
		
		
	public default void provjeraBrojevi(String zaProvjeru) throws RegexException {
		
		//prona�i jedino brojeve koji se pojavljuju na po�etku jedan ili vi�e puta
		Pattern patternBrojevi = Pattern.compile("^(\\d+)$");  
		Matcher matcherBr = patternBrojevi.matcher(zaProvjeru);
		
		if(!matcherBr.find()){
			throw new RegexException();
		}		
	}
	
	public default int samoPozitivniBr(int broj) throws NumberFormatException{
		if(broj < 0 ){
			throw new NumberFormatException();
		}else{
			return broj;
		}
	}
	
	public default void provjeraVremena(LocalDateTime pocetak, LocalDateTime kraj) throws DateTimeException{
		if(kraj.equals(pocetak) || kraj.isBefore(pocetak)){
			throw new DateTimeException("Vrijeme kraja je manji ili jednak vremenu po�etka");
		}
		
		
	}
	
	
	
	
	
	
	
//	//PITANJE ZA PROF. DA LI JE BOLJE UBACITI U KONSTRUKTOR BEZ POZIVANJA METODE
//	private void provjeraUnosaPodataka() throws RegexException{
//			//prona�i jedino mala ili velika slova na po�etku, koja se ponavljaju 4 ili vi�e puta. 
//		Pattern patternSlova = Pattern.compile("^[a-zA-Z]{4,}$"); 		
//			//prona�i jedino brojeve koji se pojavljuju na po�etku jedan ili vi�e puta
//		Pattern patternBrojevi = Pattern.compile("^(\\d+)$");  
//		
//		Matcher matcherDr = patternSlova.matcher(drzava);
//		Matcher matcherGr = patternSlova.matcher(grad);
//		Matcher matcherUl = patternSlova.matcher(ulica);
//				
//		if(matcherDr.find() && matcherGr.find() && matcherUl.find()){
//			
//		}else {
//			throw new RegexException();
//		}
//		
//		Matcher matcherBr = patternBrojevi.matcher(kucniBroj);
//		if(matcherBr.find()){
//			
//		}else {
//			throw new RegexException();
//		}		
//	}
	
}
