package atributos;

public enum ResultadoFinalDiagnosticoMecanico {
	FallaEnFrenos,
	TanqueSinSuficienteAceite,
	FallaCinturones,
	FallaEngranes,
	SinFallasMecanicas,
	NoDeterminado;
	
	public  Boolean compare(ResultadoFinalDiagnosticoMecanico resultado) {
		return this.toString() == resultado.toString();
	}
}
