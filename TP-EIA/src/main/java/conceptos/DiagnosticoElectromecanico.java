package conceptos;

import atributos.ResultadoFinalDiagnosticoElectromecanico;

public class DiagnosticoElectromecanico {
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
