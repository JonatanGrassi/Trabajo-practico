package atributos;

public enum EstadoCorrocion {
	PresentaCorrocion,
	noPresentaCorrocion,
	NoDeterminado;
	
	public Boolean compare(IntegridadFrenos integridad) {
		return this.toString() == integridad.toString();
	}
	
}
