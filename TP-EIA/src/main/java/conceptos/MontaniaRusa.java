package conceptos;

public class MontaniaRusa {

	public Engrane engranes;
	public DepositoAceite depositoAceite;
	public Cinturon cinturones;
	public Monitoreo monitoreo;
	public TensionElectrica tension;
	public Freno Frenos;
	public DiagnosticoOperatividad resultadoFinal;
	public Clima clima;

	public MontaniaRusa(Engrane engranes, DepositoAceite deposito_aceite, Cinturon cinturones,
			Monitoreo monitoreo, TensionElectrica tension, Freno frenos,Clima clima) {
		this.engranes = engranes;
		this.depositoAceite = deposito_aceite;
		this.cinturones = cinturones;
		this.monitoreo = monitoreo;
		this.tension = tension;
		this.clima = clima;
		this.Frenos = frenos;
		this.resultadoFinal = new DiagnosticoOperatividad();
	}

	public Engrane getEngranes() {
		return engranes;
	}

	public void setEngranes(Engrane engranes) {
		this.engranes = engranes;
	}


	public DepositoAceite getDeposito_aceite() {
		return depositoAceite;
	}

	public void setDeposito_aceite(DepositoAceite deposito_aceite) {
		this.depositoAceite = deposito_aceite;
	}

	public Cinturon getCinturones() {
		return cinturones;
	}

	public void setCinturones(Cinturon cinturones) {
		this.cinturones = cinturones;
	}

	public Monitoreo getMonitoreo() {
		return monitoreo;
	}

	public void setMonitoreo(Monitoreo monitoreo) {
		this.monitoreo = monitoreo;
	}

	public TensionElectrica getTension() {
		return tension;
	}

	public void setTension(TensionElectrica tension) {
		this.tension = tension;
	}

	public Freno getFrenos() {
		return Frenos;
	}

	public void setFrenos(Freno frenos) {
		Frenos = frenos;
	}

	public DiagnosticoOperatividad getResultadoFinal() {
		return resultadoFinal;
	}

	public void setResultadoFinal(DiagnosticoOperatividad resultadoFinal) {
		this.resultadoFinal = resultadoFinal;
	}

	public Clima getClima() {
		return clima;
	}
	
	public static void debugValue(String regla) {
        System.out.println("regla: " + regla);
		return;
    }

	public void setClima(Clima clima) {
		this.clima = clima;
	}
}

	