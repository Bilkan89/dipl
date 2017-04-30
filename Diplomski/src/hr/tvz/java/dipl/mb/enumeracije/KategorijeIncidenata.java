package hr.tvz.java.dipl.mb.enumeracije;

import java.util.ArrayList;
import java.util.List;

public enum KategorijeIncidenata {

	TELEKOMUNIKACIJSKI(1),
	MREŽNI(2),
	POSLUŽITELJSKI(3);

	private int kategIncid;
		
	private KategorijeIncidenata(int katIncId){
		this.kategIncid = katIncId;
	}
	
	public int getKategIncid() {
		return kategIncid;
	}
	
	public void setKategIncid(int kategIncid) {
		this.kategIncid = kategIncid;
	}

	public static List<KategorijeIncidenata> dohvatiVrijednosti(){
		
		List<KategorijeIncidenata> listaVrsteIncidenata = new ArrayList<>();
		
		for(KategorijeIncidenata elementi : KategorijeIncidenata.values()){
			listaVrsteIncidenata.add(elementi);
		}
		
		return listaVrsteIncidenata;
	}
}
