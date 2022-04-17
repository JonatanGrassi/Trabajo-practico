package atributos;

public enum NivelTension {
	BajaTension,
	CorrectaTension,
	Alta_tension,
	NoDeterminado;
	
	public Boolean compare(NivelTension tension) {
		return this.toString() == tension.toString();
	}
	
}
