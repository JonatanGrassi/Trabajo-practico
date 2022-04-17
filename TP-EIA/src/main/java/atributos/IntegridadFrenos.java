package atributos;

public enum IntegridadFrenos {
	PerfectoEstado,
	FallaFrenosFriccion,
	FallaFrenosMagneticos,
	FrenosDa�adosCorrosion,
	NoDeterminado;
	public Boolean isa(IntegridadFrenos integridad) {
		return this.toString() == integridad.toString();
	}
}
