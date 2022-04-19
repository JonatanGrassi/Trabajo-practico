package conceptos;

import atributos.ResultadoFinalDiagnosticoElectromecanico;

public class DiagnosticoElectromecanico {
	@Override
	public String toString() {
		return "DiagnosticoElectromecanico [diagnosticoMecanico=" + diagnosticoMecanico + ", diagnosticoElectrico="
				+ diagnosticoElectrico + ", resultadoElectromecanico=" + resultadoElectromecanico + "]";
	}

	public DiagnosticoMecanico diagnosticoMecanico;
	public DiagnosticoElectrico diagnosticoElectrico;
	public ResultadoFinalDiagnosticoElectromecanico resultadoElectromecanico;
	
	public DiagnosticoElectromecanico() {
		this.diagnosticoMecanico = new DiagnosticoMecanico();
		this.diagnosticoElectrico = new DiagnosticoElectrico();
		this.resultadoElectromecanico = ResultadoFinalDiagnosticoElectromecanico.NoDeterminado;
	}

	public ResultadoFinalDiagnosticoElectromecanico getResultadoElectromecanico() {
		return resultadoElectromecanico;
	}

	public void setResultadoElectromecanico(ResultadoFinalDiagnosticoElectromecanico diagnosticoElectromecanico) {
		this.resultadoElectromecanico = diagnosticoElectromecanico;
	}
	
}
