package hr.tvz.java.dipl.mb.enumeracije;

import java.util.ArrayList;
import java.util.List;

public enum VrsteIncidenata {

	TELEKOMUNIKACIJSKI(1),
	MREŽNI(2),
	POSLUŽITELJSKI(3);

	private int VrsteIncidenataId;
		
	private VrsteIncidenata(int katIncId){
		this.VrsteIncidenataId = katIncId;
	}
	
	public int getVrsteIncidenataId() {
		return VrsteIncidenataId;
	}

	public void setVrsteIncidenataId(int vrsteIncidenataId) {
		VrsteIncidenataId = vrsteIncidenataId;
	}

	public static List<VrsteIncidenata> dohvatiVrijednosti(){
		
		List<VrsteIncidenata> listaVrsteIncidenata = new ArrayList<>();
		
		for(VrsteIncidenata elementi : VrsteIncidenata.values()){
			listaVrsteIncidenata.add(elementi);
		}
		
		return listaVrsteIncidenata;
	}
}
