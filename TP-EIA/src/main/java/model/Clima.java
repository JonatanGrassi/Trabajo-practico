package model;

public class Clima {
	private int intensidadPrecipitaciones;
	private int intensidadRafagas;
	
	public Clima(int intensidadPrecipitaciones, int intensidadRafagas) {
		this.intensidadPrecipitaciones = intensidadPrecipitaciones;
		this.intensidadRafagas = intensidadRafagas;
	}

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
