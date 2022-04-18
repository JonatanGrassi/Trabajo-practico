package atributos;

public enum NivelTension {
	BajaTension,
	CorrectaTension,
	AltaTension,
	NoDeterminado;
	
	public Boolean compare(NivelTension tension) {
		return this.toString() == tension.toString();
	}
	
}
