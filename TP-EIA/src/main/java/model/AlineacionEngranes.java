package model;

public enum AlineacionEngranes {
	Alineado,
	Desalineado;
	
	public  Boolean isa(NivelBateria nivel) {
		return this.toString() == nivel.toString();
	}
}
