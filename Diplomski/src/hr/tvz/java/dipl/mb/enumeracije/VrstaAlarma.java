package hr.tvz.java.dipl.mb.enumeracije;

import java.util.ArrayList;
import java.util.List;

public enum VrstaAlarma {

	Critical(1),
	Major(2),
	Minor(3);
	
	private int vrstaAlarmaId;
	
	private VrstaAlarma(int vrstaAlarmaId) {
		this.vrstaAlarmaId = vrstaAlarmaId;
	}
	
	public int getVrstaAlarmaId() {
		return vrstaAlarmaId;
	}
	
	public void setVrstaAlarmaId(int vrstaAlarmaId) {
		this.vrstaAlarmaId = vrstaAlarmaId;
	}
	
	public static List<VrstaAlarma> dohvatiVrijednosti(){
			
			List<VrstaAlarma> lista = new ArrayList<>();
			
			for(VrstaAlarma elementi : VrstaAlarma.values()){
				lista.add(elementi);
			}
			
			return lista;
		}
}
	

