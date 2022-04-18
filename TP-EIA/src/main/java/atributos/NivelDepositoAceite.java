package atributos;

public enum NivelDepositoAceite {
	Insuficiente,
	Suficiente,
	NoDeterminado;
	public  Boolean compare(NivelDepositoAceite nivel) {
		return this.toString() == nivel.toString();
	}
	
}
