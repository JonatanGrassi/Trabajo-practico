package atributos;

public enum OperatividadSensoresMonitoreo {
	Operativo,
	NoOperativo,
	NoDeterminado;
	
	public Boolean compare(OperatividadSensoresMonitoreo monitoreo) {
		return this.toString() == monitoreo.toString();
	}
}
