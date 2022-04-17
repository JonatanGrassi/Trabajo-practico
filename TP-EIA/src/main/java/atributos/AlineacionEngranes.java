package atributos;

public enum AlineacionEngranes {
	Alineado,
	Desalineado,
	NoDeterminado;
	public Boolean isa(AlineacionEngranes alineacion) {
		return this.toString() == alineacion.toString();
	}
}
