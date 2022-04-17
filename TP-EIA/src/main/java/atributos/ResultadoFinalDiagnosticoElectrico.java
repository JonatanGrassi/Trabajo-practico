package atributos;

public enum ResultadoFinalDiagnosticoElectrico {
	ProblemasTension,
	ProblemasEnsensores,
	PLCsinSuficienteCarga,
	SinFallasElectricas,
	NoDeterminado;
	
	public  Boolean compare(ResultadoFinalDiagnosticoElectrico resultado) {
		return this.toString() == resultado.toString();
	}
}
