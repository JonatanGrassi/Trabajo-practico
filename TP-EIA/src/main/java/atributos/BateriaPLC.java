package atributos;

public enum BateriaPLC {
	Insuficiente,
	Suficiente,
	NoDeterminado;
	
	public Boolean compare(BateriaPLC bateriaPLC) {
		return this.toString() == bateriaPLC.toString();
	}
}
