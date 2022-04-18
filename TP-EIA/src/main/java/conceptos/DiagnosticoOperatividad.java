package conceptos;

import atributos.Consideraciones;

public class DiagnosticoOperatividad {
	
	public DiagnosticoElectromecanico diagnosticoElectromecanico;
	public AnalisisClimatico analisisClimatico;
	public Consideraciones consideracion;
	
	public DiagnosticoOperatividad() {
		diagnosticoElectromecanico = new DiagnosticoElectromecanico();
		analisisClimatico = new AnalisisClimatico();
		consideracion = Consideraciones.NoDeterminada;
	} 
	
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

	public Consideraciones getConsideracion() {
		return consideracion;
	}


	public void setConsideracion(Consideraciones consideracion) {
		this.consideracion = consideracion;
	}
}
