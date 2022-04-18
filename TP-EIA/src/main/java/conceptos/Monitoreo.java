package conceptos;

import atributos.OperatividadSensorParada;
import atributos.OperatividadSensoresMonitoreo;

public class Monitoreo {
	public OperatividadSensorParada operatividadSensorParada;
	public OperatividadSensoresMonitoreo operatividadSensoresMonitoreo;
	public Double NivelCargaBateriaPLC;
	
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
	
	public OperatividadSensorParada getOperatividadSensorParada() {
		return operatividadSensorParada;
	}
	public void setOperatividadSensorParada(OperatividadSensorParada operatividadSensorParada) {
		this.operatividadSensorParada = operatividadSensorParada;
	}
	public OperatividadSensoresMonitoreo getOperatividadSensoresMonitoreo() {
		return operatividadSensoresMonitoreo;
	}
	public void setOperatividadSensoresMonitoreo(OperatividadSensoresMonitoreo operatividadSensoresMonitoreo) {
		this.operatividadSensoresMonitoreo = operatividadSensoresMonitoreo;
	}
	public Double getNivelCargaBateriaPLC() {
		return NivelCargaBateriaPLC;
	}

	

	


}
