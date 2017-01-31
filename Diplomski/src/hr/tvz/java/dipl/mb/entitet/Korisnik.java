package hr.tvz.java.dipl.mb.entitet;

import hr.tvz.java.dipl.mb.sucelja.ProvjeraPodataka;

public class Korisnik implements ProvjeraPodataka{

	private String ime;
	private String prezime;
	private Adresa adresaKorisnika;
	private int kontaktBroj;	
	private String korisnickoIme;
	private String korisnickaLozinka;
	private String napomena;
	
	private boolean pravoPristupa;
	private int idKorisnika;
	
	public Korisnik(String ime, String prezime, Adresa adresaKorisnika, int kontaktBroj, String korisnickoIme,
			String korisnickaLozinka) {
		
		this.ime = ime;
		this.prezime = prezime;
		this.adresaKorisnika = adresaKorisnika;
		this.kontaktBroj = kontaktBroj;
		this.korisnickoIme = korisnickoIme;
		this.korisnickaLozinka = korisnickaLozinka;
		this.pravoPristupa = false; // svakog novog korisnika admin mora odobriti
		provjeraSlova(ime);
		provjeraSlova(prezime);				
		
	}

	public String provjeraPrava(boolean pristup){
		if (pristup){
			return "Da";
		}else{
			return "Ne";
		}			
	}
	
	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public boolean isPravoPristupa() {
		return pravoPristupa;
	}

	public void setPravoPristupa(boolean pravoPristupa) {
		this.pravoPristupa = pravoPristupa;
	}

	public int getIdKorisnika() {
		return idKorisnika;
	}

	public void setIdKorisnika(int idKorisnika) {
		this.idKorisnika = idKorisnika;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public Adresa getAdresaKorisnika() {
		return adresaKorisnika;
	}

	public int getKontaktBroj() {
		return kontaktBroj;
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public String getKorisnickaLozinka() {
		return korisnickaLozinka;
	}
	
		
	
	
}
