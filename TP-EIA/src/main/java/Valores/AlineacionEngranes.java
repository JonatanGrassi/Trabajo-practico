package Valores;

public enum AlineacionEngranes {
	Alineado,
	Desalineado;
	
	public  Boolean compare(AlineacionEngranes alineacion) {
		return this.toString() == alineacion.toString();
	}
}
