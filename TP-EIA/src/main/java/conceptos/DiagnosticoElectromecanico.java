package conceptos;

import atributos.ResultadoFinalDiagnosticoElectromecanico;

public class DiagnosticoElectromecanico {
	public DiagnosticoMecanico diagnosticoMecanico;
	public DiagnosticoElectrico diagnosticoElectrico;
	public ResultadoFinalDiagnosticoElectromecanico diagnosticoElectromecanico;
	
	public DiagnosticoElectromecanico() {
		this.diagnosticoMecanico = new DiagnosticoMecanico();
		this.diagnosticoElectrico = new DiagnosticoElectrico();
		this.diagnosticoElectromecanico = ResultadoFinalDiagnosticoElectromecanico.Nodeterminado;
	}

	public DiagnosticoMecanico getDiagnosticoMecanico() {
		return diagnosticoMecanico;
	}

	public void setDiagnosticoMecanico(DiagnosticoMecanico diagnosticoMecanico) {
		this.diagnosticoMecanico = diagnosticoMecanico;
	}

	public DiagnosticoElectrico getDiagnosticoElectrico() {
		return diagnosticoElectrico;
	}

	public void setDiagnosticoElectrico(DiagnosticoElectrico diagnosticoElectrico) {
		this.diagnosticoElectrico = diagnosticoElectrico;
	}

	public ResultadoFinalDiagnosticoElectromecanico getDiagnosticoElectromecanico() {
		return diagnosticoElectromecanico;
	}

	public void setDiagnosticoElectromecanico(ResultadoFinalDiagnosticoElectromecanico diagnosticoElectromecanico) {
		this.diagnosticoElectromecanico = diagnosticoElectromecanico;
	}
	
}
