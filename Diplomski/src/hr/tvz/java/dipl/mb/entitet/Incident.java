package hr.tvz.java.dipl.mb.entitet;

import hr.tvz.java.dipl.mb.enumeracije.PrioritetiIncidenta;
import hr.tvz.java.dipl.mb.enumeracije.VrstaAlarma;

import java.time.LocalDateTime;
import java.util.List;

import hr.tvz.java.dipl.mb.enumeracije.KategorijeIncidenata;
import hr.tvz.java.dipl.mb.sucelja.ProvjeraPodataka;
import hr.tvz.java.dipl.mb.sucelja.TrajanjeIncidenta;;


public class Incident implements ProvjeraPodataka, TrajanjeIncidenta{

	private int brojNaloga; //samo pozitivni brojevi i ne nula		
	private LocalDateTime pocetak;			
	private KategorijeIncidenata kategIncidenta;
	private String zahvacenUredaji;
	private VrstaAlarma tipAlarma;
	private String napomena;
	private String incidentRjesava;
	private String rijesen;
	private PrioritetiIncidenta prioriteti;	
	
	private LocalDateTime kraj;	
	private List<String> trajanje;
		
	public Incident(int brojNaloga, LocalDateTime pocetak, KategorijeIncidenata katIncid, String zahUreðaj, VrstaAlarma vrstaAlarma, String napomena,
			String incidRjesa, PrioritetiIncidenta priotit) {

		this.brojNaloga = samoPozitivniBr(brojNaloga);
		this.pocetak = pocetak;
		this.kategIncidenta = katIncid;
		this.zahvacenUredaji = zahUreðaj;
		this.tipAlarma = vrstaAlarma;
		this.napomena = napomena;
		this.incidentRjesava = incidRjesa;
		this.rijesen = "NE";
		this.prioriteti = priotit;		
	}
	
	public Incident(LocalDateTime kraj){
		provjeraVremena(pocetak,kraj);
		this.kraj = kraj;
		this.trajanje = Izracun(pocetak,kraj); 
		this.rijesen = "DA";
	}
	
	public int getBrojNaloga() {
		return brojNaloga;
	}

	public LocalDateTime getPocetak() {
		return pocetak;
	}

	public KategorijeIncidenata getKategIncidenta() {
		return kategIncidenta;
	}

	public String getZahvacenUredaji() {
		return zahvacenUredaji;
	}

	public VrstaAlarma getTipAlarma() {
		return tipAlarma;
	}

	public String getNapomena() {
		return napomena;
	}

	public String getIncidentRjesava() {
		return incidentRjesava;
	}

	public String getRijesen() {
		return rijesen;
	}

	public PrioritetiIncidenta getPrioriteti() {
		return prioriteti;
	}
		
	public LocalDateTime getKraj() {
		return kraj;
	}
	
	public List<String> getTrajanje() {
		return trajanje;
	}

	@Override
	public String toString() {
		return "Incident [trajanje=" + trajanje + "]";
	}
	
	
	
	
}
