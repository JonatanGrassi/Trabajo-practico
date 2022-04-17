package conceptos;

public enum NivelDepositoAceite {
	Insuficiente,
	Suficiente,
	NoDeterminado;
	public Boolean isa(NivelDepositoAceite nivel) {
		return this.toString() == nivel.toString();
	}
}
