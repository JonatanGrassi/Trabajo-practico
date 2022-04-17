package atributos;

public enum ResultadoFinalDiagnosticoElectromecanico {
	FallaEnSistemaFrenos,
	ProblemaEnCinturonesSeguridad,
	InsuficienteAceitedepositos,
	FallaEnSistemaEngranes,
	TensionInadecuada,
	FallaEnSistemaDeSensores,
	CargaBateriaPLCInsuficiente,
	SinFallasElectromecanicas,
	Nodeterminado;
	
	public  Boolean compare(ResultadoFinalDiagnosticoElectromecanico resultado) {
		return this.toString() == resultado.toString();
	}
}
