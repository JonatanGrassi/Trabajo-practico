package conceptos;

import atributos.AlineacionEngranes;
import atributos.DesgasteCinturon;
import atributos.IntegridadFrenos;

public class DiagnosticoMecanico {
	AlineacionEngranes alineacionEngranes;
	DesgasteCinturon desgasteCinturon;
	IntegridadFrenos integridadFrenos;
	NivelDepositoAceite nivelDepositoAceite;

	public DiagnosticoMecanico() {
		this.alineacionEngranes = AlineacionEngranes.NoDeterminado;
		this.desgasteCinturon = DesgasteCinturon.NoDeterminado;
		this.integridadFrenos = IntegridadFrenos.NoDeterminado;
		this.nivelDepositoAceite = NivelDepositoAceite.NoDeterminado;
	}

	public AlineacionEngranes getAlineacionEngranes() {
		return alineacionEngranes;
	}

	public void setAlineacionEngranes(AlineacionEngranes alineacionEngranes) {
		this.alineacionEngranes = alineacionEngranes;
	}

	public DesgasteCinturon getDesgasteCinturon() {
		return desgasteCinturon;
	}

	public void setDesgasteCinturon(DesgasteCinturon desgasteCinturon) {
		this.desgasteCinturon = desgasteCinturon;
	}

	public IntegridadFrenos getIntegridadFrenos() {
		return integridadFrenos;
	}

	public void setIntegridadFrenos(IntegridadFrenos integridadFrenos) {
		this.integridadFrenos = integridadFrenos;
	}

	public NivelDepositoAceite getNivelDepositoAceite() {
		return nivelDepositoAceite;
	}

	public void setNivelDepositoAceite(NivelDepositoAceite nivelDepositoAceite) {
		this.nivelDepositoAceite = nivelDepositoAceite;
	}


}
