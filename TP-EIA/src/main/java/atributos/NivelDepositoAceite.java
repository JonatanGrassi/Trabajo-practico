package atributos;

public enum NivelDepositoAceite {
	Insuficiente,
	Suficiente;
	
	public  Boolean compare(NivelDepositoAceite nivel) {
		return this.toString() == nivel.toString();
	}
	
}
