package conceptos;

import atributos.AlineacionEngranes;
import atributos.DesgasteCinturon;
import atributos.IntegridadFrenos;
import atributos.NivelDepositoAceite;
import atributos.ResultadoFinalDiagnosticoMecanico;

public class DiagnosticoMecanico {
	@Override
	public String toString() {
		return "DiagnosticoMecanico [alineacionEngranes=" + alineacionEngranes + ", desgasteCinturon="
				+ desgasteCinturon + ", integridadFrenos=" + integridadFrenos + ", nivelDepositoAceite="
				+ nivelDepositoAceite + ", resultadoMecanico=" + resultadoMecanico + "]";
	}

	public AlineacionEngranes alineacionEngranes;
	public DesgasteCinturon desgasteCinturon;
	public IntegridadFrenos integridadFrenos;
	public NivelDepositoAceite nivelDepositoAceite;
	public ResultadoFinalDiagnosticoMecanico resultadoMecanico;

	public DiagnosticoMecanico() {
		this.alineacionEngranes = AlineacionEngranes.NoDeterminado;
		this.desgasteCinturon = DesgasteCinturon.NoDeterminado;
		this.integridadFrenos = IntegridadFrenos.NoDeterminado;
		this.nivelDepositoAceite = NivelDepositoAceite.NoDeterminado;
		this.resultadoMecanico = ResultadoFinalDiagnosticoMecanico.NoDeterminado;
	}

	public ResultadoFinalDiagnosticoMecanico getResultadoMecanico() {
		return resultadoMecanico;
	}

	public void setResultadoMecanico(ResultadoFinalDiagnosticoMecanico resultadoMecanico) {
		this.resultadoMecanico = resultadoMecanico;
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
