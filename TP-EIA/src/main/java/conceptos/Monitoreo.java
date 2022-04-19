package conceptos;

import atributos.OperatividadSensorParada;
import atributos.OperatividadSensoresMonitoreo;

public class Monitoreo {
	public OperatividadSensorParada operatividadSensorParada;
	public OperatividadSensoresMonitoreo operatividadSensoresMonitoreo;
	public Double nivelCargaBateriaPLC;
	
	static Double MIN_PORC = 0.0;
	static Double MAX_PORC = 100.0;
	
	public void setNivelCargaBateriaPLC(Double nivelCargaBateriaPLC) {
		
		if (nivelCargaBateriaPLC > MAX_PORC) {
			throw new IllegalArgumentException("NivelCargaBateriaPLC: maximo valor permitido " + MAX_PORC + " %.");
		}
		
		if (nivelCargaBateriaPLC < MIN_PORC) {
			throw new IllegalArgumentException("NivelCargaBateriaPLC no puede ser negativo");
		}
		this.nivelCargaBateriaPLC = nivelCargaBateriaPLC;
		
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
		return nivelCargaBateriaPLC;
	}

	@Override
	public String toString() {
		return "Monitoreo [operatividadSensorParada=" + operatividadSensorParada + ", operatividadSensoresMonitoreo="
				+ operatividadSensoresMonitoreo + ", nivelCargaBateriaPLC=" + nivelCargaBateriaPLC + "]";
	}
}
