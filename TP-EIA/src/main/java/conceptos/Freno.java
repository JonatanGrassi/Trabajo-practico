package conceptos;

import atributos.EstadoCorrosion;

public class Freno {
	public int espesorPastillas;
	public EstadoCorrosion corrosion;
	public int potenciaImanes;
	
	static int MIN_ESPESOR_PASTILLAS = 2;
	static int MAX_ESPESOR_PASTILLAS = 14;
	
	static int MIN_POTENCIA_IMANES = 13000;
	static int MAX_POTENCIA_IMANES = 14700;
	
	public void setEspesorPastillas(int espesorPastillas) {
		if (espesorPastillas > MAX_ESPESOR_PASTILLAS) {
			throw new IllegalArgumentException("espesorPastilla: maximo valor permitido " + MAX_ESPESOR_PASTILLAS + " %.");
		}
		
		if (espesorPastillas < MIN_ESPESOR_PASTILLAS) {
			throw new IllegalArgumentException("espesorPastilla: minimo valor permitido " + MIN_ESPESOR_PASTILLAS + " %.");
		}
		
		this.espesorPastillas = espesorPastillas;
	}
	
	public void setPotenciaImanes(int potenciaImanes) {
		if (potenciaImanes > MAX_POTENCIA_IMANES) {
			throw new IllegalArgumentException("potenciaImanes: maximo valor permitido " + MAX_POTENCIA_IMANES + " %.");
		}
		
		if (potenciaImanes < MIN_POTENCIA_IMANES) {
			throw new IllegalArgumentException("potenciaImanes: minimo valor permitido " + MIN_POTENCIA_IMANES + " %.");
		}
		
		this.potenciaImanes = potenciaImanes;
	}
	
	public int getEspesorPastillas() {
		return espesorPastillas;
	}
	
	public EstadoCorrosion getCorrosion() {
		return corrosion;
	}
	public void setCorrosion(EstadoCorrosion corrocion ) {
		this.corrosion = corrocion;
	}
	
	public int getPotenciaImanes() {
		return potenciaImanes;
	}

	@Override
	public String toString() {
		return "Freno [espesorPastillas=" + espesorPastillas + ", corrocion=" + corrosion + ", potenciaImanes="
				+ potenciaImanes + "]";
	}
	
}
