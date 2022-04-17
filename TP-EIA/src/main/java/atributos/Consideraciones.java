package atributos;

public enum Consideraciones {

	RevisarFrenos,
	AlinearEngranes,
	CargarDepositosAceite,
	RevisarSensores,
	RevisarNivelTension,
	RevisarCinturonesSeguridad,
	CargarBateriaPLC,
	JuegoNoOperativoPorClima,
	Operativo,
	NoDeterminada;
	
	public Boolean compare(Consideraciones recomendacion) {
		return this.toString() == recomendacion.toString();
	}
}
