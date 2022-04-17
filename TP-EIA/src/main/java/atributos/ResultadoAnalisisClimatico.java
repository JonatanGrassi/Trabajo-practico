package atributos;

public enum ResultadoAnalisisClimatico {
	ClimaDesfavorable,
	ClimaFavorable,
	NoDeterminado;
	
	public Boolean compare(ResultadoAnalisisClimatico clima) {
		return this.toString() == clima.toString();
	}
}
