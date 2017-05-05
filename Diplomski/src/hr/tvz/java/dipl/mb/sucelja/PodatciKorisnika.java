package hr.tvz.java.dipl.mb.sucelja;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import hr.tvz.java.dipl.mb.baza.KomunikacijaSaBazom;
import hr.tvz.java.dipl.mb.entitet.Adresa;
import hr.tvz.java.dipl.mb.entitet.Korisnik;

public interface PodatciKorisnika {
	
	
	

	static List<Korisnik> dohvatiKorisnike() throws Exception{
		Connection vezaSaBazom = KomunikacijaSaBazom.konekcijaDB();
		
		List<Korisnik> lista = new ArrayList<>();		
		
		String dohvatiKorisnikeSQL = "SELECT ime,prezime,kontakt_broj,napomena,datum_kreiranja,drzava,grad,ulica,kucni_broj,korisnicko_ime,lozinka FROM "
				+ "EVIDENTIRANJE.KORISNIK INNER JOIN "
				+ "EVIDENTIRANJE.ADRESA ON EVIDENTIRANJE.KORISNIK.korisnik_id = EVIDENTIRANJE.ADRESA.korisnik_id "
				+ "INNER JOIN EVIDENTIRANJE.PRISTUP ON EVIDENTIRANJE.ADRESA.korisnik_id = EVIDENTIRANJE.PRISTUP.korisnik_id"; 
		
		PreparedStatement prepStatment = vezaSaBazom.prepareStatement(dohvatiKorisnikeSQL);
		ResultSet resultSet = prepStatment.executeQuery();
		
		Adresa novaA;
		Korisnik noviK;
		
		while(resultSet.next()){
			
		novaA = new Adresa(resultSet.getString("drzava"),
						   resultSet.getString("grad"),
							resultSet.getString("ulica"),
							 resultSet.getInt("kucni_broj"));	
		
		noviK = new Korisnik(resultSet.getString("ime"),
							 resultSet.getString("prezime"),
							 novaA,
							 resultSet.getInt("kontakt_broj"),
							 resultSet.getString("korisnicko_ime"),
							 resultSet.getString("lozinka"),
							 resultSet.getString("napomena"),
							 resultSet.getDate("datum_kreiranja"));		
			lista.add(noviK);			
		}		
		KomunikacijaSaBazom.zatvoriKonekciju(vezaSaBazom);
		return lista;
	}

	
	
}
