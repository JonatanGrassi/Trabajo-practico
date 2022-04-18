package atributos;

public enum TipoDesgaste {
	DesgasteHebillas,
	DesgasteTiras,
	BuenEstado,
	Nodeterminado;
	
	public  Boolean compare(TipoDesgaste tipoDesgas) {
		return this.toString() == tipoDesgas.toString();
	}
}
