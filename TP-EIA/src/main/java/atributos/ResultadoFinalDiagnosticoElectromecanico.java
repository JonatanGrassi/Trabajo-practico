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
	NoDeterminado;
	
	public  Boolean compare(ResultadoFinalDiagnosticoElectromecanico resultado) {
		return this.toString() == resultado.toString();
	}
}
