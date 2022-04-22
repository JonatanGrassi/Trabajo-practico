package atributos;

public enum EstadoCorrosion {
	PresentaCorrosion,
	NoPresentaCorrosion,
	NoDeterminado;
	
	public Boolean compare(EstadoCorrosion integridad) {
		return this.toString() == integridad.toString();
	}
	
}
