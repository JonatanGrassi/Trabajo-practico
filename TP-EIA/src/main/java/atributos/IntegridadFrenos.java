package atributos;

public enum IntegridadFrenos {
	PerfectoEstado,
	FallaFrenosFriccion,
	FallaFrenosMagneticos,
	FrenosDaņadosCorrosion,
	NoDeterminado;
	public Boolean isa(IntegridadFrenos integridad) {
		return this.toString() == integridad.toString();
	}
}
