package model;

public enum Consideraciones {

	RevisarFrenos,
	AlinearEngranes,
	CargarDepositosAceite,
	RevisarSensores,
	RevisarNivelTension,
	RevisarCinturonesSeguridad,
	CargarBateriaPLC,
	JuegoNoOperativoPorClima,
	Operativo;
	
	public Boolean isa(Consideraciones recomendacion) {
		return this.toString() == recomendacion.toString();
	}
}
