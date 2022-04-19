package conceptos;

public class Clima {
	@Override
	public String toString() {
		return "Clima [intensidadPrecipitaciones=" + intensidadPrecipitaciones + ", intensidadRafagas="
				+ intensidadRafagas + "]";
	}

	public int intensidadPrecipitaciones;
	public int intensidadRafagas;

	public int getIntensidadPrecipitaciones() {
		return intensidadPrecipitaciones;
	}

	public void setIntensidadPrecipitaciones(int intensidadPrecipitaciones) {
		this.intensidadPrecipitaciones = intensidadPrecipitaciones;
	}

	public int getIntensidadRafagas() {
		return intensidadRafagas;
	}

	public void setIntensidadRafagas(int intensidadRafagas) {
		this.intensidadRafagas = intensidadRafagas;
	}
	
	
	
}
