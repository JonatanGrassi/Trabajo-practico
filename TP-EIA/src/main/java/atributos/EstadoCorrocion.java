package atributos;

public enum EstadoCorrocion {
	PresentaCorrocion,
	NoPresentaCorrocion,
	NoDeterminado;
	
	public Boolean compare(EstadoCorrocion integridad) {
		return this.toString() == integridad.toString();
	}
	
}
