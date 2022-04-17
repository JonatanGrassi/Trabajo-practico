package conceptos;

import atributos.Consideraciones;

public class DiagnosticoOperatividad {
	
	public DiagnosticoElectromecanico diagnosticoElectromecanico;
	public AnalisisClimatico analisisClimatico;
	public Consideraciones consideracion;
	
	public DiagnosticoElectromecanico getDiagnosticoElectromecanico() {
		return diagnosticoElectromecanico;
	}


	public void setDiagnosticoElectromecanico(DiagnosticoElectromecanico diagnosticoElectromecanico) {
		this.diagnosticoElectromecanico = diagnosticoElectromecanico;
	}


	public AnalisisClimatico getAnalisisClimatico() {
		return analisisClimatico;
	}


	public void setAnalisisClimatico(AnalisisClimatico analisisClimatico) {
		this.analisisClimatico = analisisClimatico;
	}


	public DiagnosticoOperatividad() {
		diagnosticoElectromecanico = new DiagnosticoElectromecanico();
		consideracion = Consideraciones.NoDeterminada;
	} 
	
	
	public Consideraciones getConsideracion() {
		return consideracion;
	}


	public void setConsideracion(Consideraciones consideracion) {
		this.consideracion = consideracion;
	}
}
