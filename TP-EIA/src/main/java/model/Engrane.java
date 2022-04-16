package model;

public class Engrane {
	
	static Double MIN_PORC = 0.0;
	static Double MAX_PORC = 100.0;
	
	public Double cargaPorcentual;
	
	public Double getCargaPorcentual() {
		return cargaPorcentual;
	}

	public void setCargaPorcentual(Double cargaPorcentual) {
		if (cargaPorcentual > MAX_PORC) {
			throw new IllegalArgumentException("cargaPorcentual: maximo valor permitido " + MAX_PORC + " %.");
		}
		
		if (cargaPorcentual < MIN_PORC) {
			throw new IllegalArgumentException("cargaPorcentual no puede ser negativo");
		}
		
		this.cargaPorcentual = cargaPorcentual;
	}
}
