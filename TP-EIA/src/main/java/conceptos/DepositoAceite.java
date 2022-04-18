package conceptos;

public class DepositoAceite {
	static Double MIN_PORC = 0.0;
	static Double MAX_PORC = 100.0;
	
	public Double nivelAceite;
	
	public Double getCargaPorcentual() {
		return nivelAceite;
	}

	public void setCargaPorcentual(Double nivelAceite) {
		if (nivelAceite > MAX_PORC) {
			throw new IllegalArgumentException("nivelAceite: maximo valor permitido " + MAX_PORC + " %.");
		}
		
		if (nivelAceite < MIN_PORC) {
			throw new IllegalArgumentException("nivelAceite no puede ser negativo");
		}
		
		this.nivelAceite = nivelAceite;
	}
}
