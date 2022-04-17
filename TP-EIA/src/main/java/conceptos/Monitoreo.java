package conceptos;

public class Monitoreo {
	Boolean OperatividadSensorParada;
	Boolean OperatividadSensoresMonitoreo;
	Double NivelCargaBateriaPLC;
	
	static Double MIN_PORC = 0.0;
	static Double MAX_PORC = 100.0;
	
	public void setNivelCargaBateriaPLC(Double nivelCargaBateriaPLC) {
		
		if (NivelCargaBateriaPLC > MAX_PORC) {
			throw new IllegalArgumentException("NivelCargaBateriaPLC: maximo valor permitido " + MAX_PORC + " %.");
		}
		
		if (NivelCargaBateriaPLC < MIN_PORC) {
			throw new IllegalArgumentException("NivelCargaBateriaPLC no puede ser negativo");
		}
		this.NivelCargaBateriaPLC = nivelCargaBateriaPLC;
		
	}
	
	public Boolean getOperatividadSensorParada() {
		return OperatividadSensorParada;
	}
	public void setOperatividadSensorParada(Boolean operatividadSensorParada) {
		OperatividadSensorParada = operatividadSensorParada;
	}
	public Boolean getOperatividadSensoresMonitoreo() {
		return OperatividadSensoresMonitoreo;
	}
	public void setOperatividadSensoresMonitoreo(Boolean operatividadSensoresMonitoreo) {
		OperatividadSensoresMonitoreo = operatividadSensoresMonitoreo;
	}
	public Double getNivelCargaBateriaPLC() {
		return NivelCargaBateriaPLC;
	}

	

	


}
