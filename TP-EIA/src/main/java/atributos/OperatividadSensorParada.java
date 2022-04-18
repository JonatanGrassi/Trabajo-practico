package atributos;

public enum OperatividadSensorParada {
	Operativo,
	NoOperativo,
	NoDeterminado;
	
	public Boolean compare(OperatividadSensorParada parada) {
		return this.toString() == parada.toString();
	}
}
