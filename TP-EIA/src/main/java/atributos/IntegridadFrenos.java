package atributos;

public enum IntegridadFrenos {
	PerfectoEstado,
	FallaFrenosFriccion,
	FallaFrenosMagneticos,
	FrenosDañadosCorrosion,
	NoDeterminado;
	public Boolean isa(IntegridadFrenos integridad) {
		return this.toString() == integridad.toString();
	}
}
