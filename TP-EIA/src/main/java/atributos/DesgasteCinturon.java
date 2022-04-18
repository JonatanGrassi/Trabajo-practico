package atributos;

public enum DesgasteCinturon {
	NoDesgastado,
	Desgastado,
	NoDeterminado;
	public Boolean compare(DesgasteCinturon desgaste) {
		return this.toString() == desgaste.toString();
	}
}
