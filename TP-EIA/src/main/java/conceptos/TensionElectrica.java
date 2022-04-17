package conceptos;

public class TensionElectrica {
	int NivelDeVoltaje;
	
	static int MIN_TENSION = 500;
	static int MAX_TENSION = 700;
	
	public void setNivelCargaBateriaPLC(int nivelDeVoltaje) {
		
		if (NivelDeVoltaje > MAX_TENSION) {
			throw new IllegalArgumentException("NivelDeVoltaje: maximo valor permitido " + MAX_TENSION + " %.");
		}
		
		if (NivelDeVoltaje < MIN_TENSION) {
			throw new IllegalArgumentException("NivelDeVoltaje: minimo valor permitido " + MIN_TENSION + " %.");
		}
		this.NivelDeVoltaje = nivelDeVoltaje;
	}
}
