package conceptos;

import atributos.ResultadoAnalisisClimatico;

public class AnalisisClimatico {
	ResultadoAnalisisClimatico resultadoAnalisis;
	
	public AnalisisClimatico(ResultadoAnalisisClimatico resultadoAnalisis) {
		this.resultadoAnalisis = ResultadoAnalisisClimatico.NoDeterminado;
	}
	
	public ResultadoAnalisisClimatico getResultadoAnalisis() {
		return resultadoAnalisis;
	}

	public void setResultadoAnalisis(ResultadoAnalisisClimatico resultadoAnalisis) {
		this.resultadoAnalisis = resultadoAnalisis;
	}
	
}
