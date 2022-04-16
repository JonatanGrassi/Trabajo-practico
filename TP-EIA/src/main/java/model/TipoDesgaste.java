package model;

public enum TipoDesgaste {
	DesgasteHebillas,
	DesgasteTiras,
	Nodeterminado;
	
	public  Boolean isa(TipoDesgaste tipoDesgas) {
		return this.toString() == tipoDesgas.toString();
	}
}
