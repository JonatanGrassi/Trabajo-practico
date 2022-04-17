package atributos;

public enum IntegridadFrenos {
	PerfectoEstado,
	FallaFrenosFriccion,
	FallaFrenosMagneticos,
	FrenosDa�adosCorrosion,
	NoDeterminado;
	public Boolean compare(IntegridadFrenos integridad) {
		return this.toString() == integridad.toString();
	}
}
