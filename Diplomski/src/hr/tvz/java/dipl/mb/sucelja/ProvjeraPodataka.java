package hr.tvz.java.dipl.mb.sucelja;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import hr.tvz.java.dipl.mb.iznimke.RegexException;

public interface ProvjeraPodataka {
	
	public default void provjeraSlova(String zaProvjeru ) throws RegexException{
	
		//pronaði jedino mala ili velika slova na poèetku, koja se ponavljaju 4 ili više puta. 
		Pattern patternSlova = Pattern.compile("^[a-zA-Z]{4,}$");			
		Matcher matcherSl = patternSlova.matcher(zaProvjeru);	
					
		if(!matcherSl.find()){
			throw new RegexException();
		}		
	}
		
		
	public default void provjeraBrojevi(String zaProvjeru) throws RegexException {
		
		//pronaði jedino brojeve koji se pojavljuju na poèetku jedan ili više puta
		Pattern patternBrojevi = Pattern.compile("^(\\d+)$");  
		Matcher matcherBr = patternBrojevi.matcher(zaProvjeru);
		
		if(!matcherBr.find()){
			throw new RegexException();
		}		
	}
	
	
	
	
	
	
	
	
	
//	//PITANJE ZA PROF. DA LI JE BOLJE UBACITI U KONSTRUKTOR BEZ POZIVANJA METODE
//	private void provjeraUnosaPodataka() throws RegexException{
//			//pronaði jedino mala ili velika slova na poèetku, koja se ponavljaju 4 ili više puta. 
//		Pattern patternSlova = Pattern.compile("^[a-zA-Z]{4,}$"); 		
//			//pronaði jedino brojeve koji se pojavljuju na poèetku jedan ili više puta
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
