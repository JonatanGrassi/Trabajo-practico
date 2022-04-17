package atributos;

public enum DesgasteCinturon {
	NoDesgastado,
	Desgastado,
	NoDeterminado;
	public Boolean isa(DesgasteCinturon desgaste) {
		return this.toString() == desgaste.toString();
	}
}
