package atributos;

public enum FuncionamientoSensores {
	SensoresOperativos,
	SensoresNoOperativos,
	NoDeterminado;
	
	public Boolean compare(FuncionamientoSensores sensores) {
		return this.toString() == sensores.toString();
	}
}
