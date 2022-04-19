package conceptos;

public class TensionElectrica {
	public int nivelDeVoltaje;
	
	static int MIN_TENSION = 500;
	static int MAX_TENSION = 700;
	
	public void setNivelCargaBateriaPLC(int nivelDeVoltaje) {
		
		if (nivelDeVoltaje > MAX_TENSION) {
			throw new IllegalArgumentException("nivelDeVoltaje: maximo valor permitido " + MAX_TENSION + " %.");
		}
		
		if (nivelDeVoltaje < MIN_TENSION) {
			throw new IllegalArgumentException("nivelDeVoltaje: minimo valor permitido " + MIN_TENSION + " %.");
		}
		this.nivelDeVoltaje = nivelDeVoltaje;
	}

	@Override
	public String toString() {
		return "TensionElectrica [nivelDeVoltaje=" + nivelDeVoltaje + "]";
	}
	
	
}
