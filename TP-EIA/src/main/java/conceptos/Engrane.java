package conceptos;

public class Engrane {
	
	static Double MIN_PORC = 0.0;
	static Double MAX_PORC = 100.0;
	
	public Double porcentajeAlineacion;
	
	public Double getCargaPorcentual() {
		return porcentajeAlineacion;
	}

	public void setCargaPorcentual(Double porcentajeAlineacion) {
		if (porcentajeAlineacion > MAX_PORC) {
			throw new IllegalArgumentException("porcentajeAlineacion: maximo valor permitido " + MAX_PORC + " %.");
		}
		
		if (porcentajeAlineacion < MIN_PORC) {
			throw new IllegalArgumentException("porcentajeAlineacion no puede ser negativo");
		}
		
		this.porcentajeAlineacion = porcentajeAlineacion;
	}
}
