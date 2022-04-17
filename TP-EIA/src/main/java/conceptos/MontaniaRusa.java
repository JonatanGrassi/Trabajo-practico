package conceptos;

public class MontaniaRusa {

	private Engrane engranes;
	private Bateria bateria_plc;
	private DepositoAceite deposito_aceite;
	private Cinturon cinturones;
	private Monitoreo monitoreo;
	private TensionElectrica tension;
	private Freno Frenos;
	public Diagnostico_Operatividad consideracion;

	public MontaniaRusa(Engrane engranes, Bateria bateria_plc, DepositoAceite deposito_aceite, Cinturon cinturones,
			Monitoreo monitoreo, TensionElectrica tension, Freno frenos, Diagnostico_Operatividad consideracion) {
		super();
		this.engranes = engranes;
		this.bateria_plc = bateria_plc;
		this.deposito_aceite = deposito_aceite;
		this.cinturones = cinturones;
		this.monitoreo = monitoreo;
		this.tension = tension;
		Frenos = frenos;
		this.consideraciones = consideracion;
	}
}

	