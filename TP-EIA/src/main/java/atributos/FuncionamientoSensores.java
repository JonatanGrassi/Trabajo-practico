package atributos;

public enum FuncionamientoSensores {
	SensoresOperativos,
	SensoresNooperativos,
	NoDeterminado;
	
	public Boolean compare(FuncionamientoSensores sensores) {
		return this.toString() == sensores.toString();
	}
}
