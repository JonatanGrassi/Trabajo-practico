package conceptos;

import atributos.BateriaPLC;
import atributos.FuncionamientoSensores;
import atributos.NivelTension;
import atributos.ResultadoFinalDiagnosticoElectrico;

public class DiagnosticoElectrico {
	@Override
	public String toString() {
		return "DiagnosticoElectrico [nivelDeTension=" + nivelDeTension + ", sensores=" + sensores + ", bateriaPLC="
				+ bateriaPLC + ", resultadoElectrico=" + resultadoElectrico + "]";
	}

	public NivelTension nivelDeTension;
	public FuncionamientoSensores sensores;
	public BateriaPLC bateriaPLC;
	public ResultadoFinalDiagnosticoElectrico resultadoElectrico;
	
	public DiagnosticoElectrico() {
		this.nivelDeTension = NivelTension.NoDeterminado;
		this.sensores = FuncionamientoSensores.NoDeterminado;
		this.bateriaPLC = BateriaPLC.NoDeterminado;
		this.resultadoElectrico = ResultadoFinalDiagnosticoElectrico.NoDeterminado;
	}

	public NivelTension getNivelDeTension() {
		return nivelDeTension;
	}

	public ResultadoFinalDiagnosticoElectrico getResultadoElectrico() {
		return resultadoElectrico;
	}

	public void setResultadoElectrico(ResultadoFinalDiagnosticoElectrico resultadoElectrico) {
		this.resultadoElectrico = resultadoElectrico;
	}

	public void setNivelDeTension(NivelTension nivelDeTension) {
		this.nivelDeTension = nivelDeTension;
	}

	public FuncionamientoSensores getSensores() {
		return sensores;
	}

	public void setSensores(FuncionamientoSensores sensores) {
		this.sensores = sensores;
	}

	public BateriaPLC getBateriaPLC() {
		return bateriaPLC;
	}

	public void setBateriaPLC(BateriaPLC bateriaPLC) {
		this.bateriaPLC = bateriaPLC;
	}
	
	
}
