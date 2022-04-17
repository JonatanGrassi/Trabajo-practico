package atributos;

public enum IntegridadFrenos {
	PerfectoEstado,
	FallaFrenosFriccion,
	FallaFrenosMagneticos,
	FrenosDañadosCorrosion,
	NoDeterminado;
	public Boolean compare(IntegridadFrenos integridad) {
		return this.toString() == integridad.toString();
	}
}
