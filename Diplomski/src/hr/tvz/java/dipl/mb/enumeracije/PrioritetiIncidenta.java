package hr.tvz.java.dipl.mb.enumeracije;

import java.util.ArrayList;
import java.util.List;

public enum PrioritetiIncidenta {

	KRITIÈAN(1),
	VISOKI(2),
	NISKI(3);
	
	private int prioritetiIncidentaId;
	
	private PrioritetiIncidenta(int jacinaIncidentaId) {
		this.prioritetiIncidentaId = jacinaIncidentaId;
	}
	
	public int getprioritetiIncidentaId() {
		return prioritetiIncidentaId;
	}
	
	public void setprioritetiIncidentaId(int jacinaIncidentaId) {
		this.prioritetiIncidentaId = jacinaIncidentaId;
	}
	
	
	public static List<PrioritetiIncidenta> listaVrijednosti() {
		
		List<PrioritetiIncidenta> lista = new ArrayList<PrioritetiIncidenta>();
		for(PrioritetiIncidenta elementi : PrioritetiIncidenta.values()){
			lista.add(elementi);
		}		
		return lista;
	}
	
}
