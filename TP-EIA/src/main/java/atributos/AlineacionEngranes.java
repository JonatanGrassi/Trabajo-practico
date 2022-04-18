package atributos;

public enum AlineacionEngranes {
	Alineado,
	Desalineado,
	NoDeterminado;
	public Boolean compare(AlineacionEngranes alineacion) {
		return this.toString() == alineacion.toString();
	}
}
