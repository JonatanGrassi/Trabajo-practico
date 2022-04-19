package conceptos;

import atributos.ResultadoAnalisisClimatico;

public class AnalisisClimatico {
	
	ResultadoAnalisisClimatico resultadoAnalisis;
	@Override
	public String toString() {
		return "AnalisisClimatico [resultadoAnalisis=" + resultadoAnalisis + "]";
	}


	public AnalisisClimatico() {
		this.resultadoAnalisis = ResultadoAnalisisClimatico.NoDeterminado;
	}
	
	public ResultadoAnalisisClimatico getResultadoAnalisis() {
		return resultadoAnalisis;
	}

	public void setResultadoAnalisis(ResultadoAnalisisClimatico resultadoAnalisis) {
		this.resultadoAnalisis = resultadoAnalisis;
	}
	
}
