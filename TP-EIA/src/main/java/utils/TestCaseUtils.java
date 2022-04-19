package utils;

import conceptos.Cinturon;
import conceptos.Clima;
import conceptos.DepositoAceite;
import conceptos.Engrane;
import conceptos.Freno;
import conceptos.Monitoreo;
import conceptos.MontaniaRusa;
import conceptos.TensionElectrica;


public class TestCaseUtils {

	////////////////TEST CASES UTILS ////////////////

	public static void verAtraccion(MontaniaRusa montaniaRusa) {
		
		Cinturon cinturon = montaniaRusa.getCinturones();
		Monitoreo monitoreo = montaniaRusa.getMonitoreo();
		Freno frenos = montaniaRusa.getFrenos();
		Clima clima = montaniaRusa.getClima();
		Engrane engranes = montaniaRusa.getEngranes();
		DepositoAceite depAceite = montaniaRusa.getDeposito_aceite();
		TensionElectrica tension = montaniaRusa.getTension();
		
		System.out.println("");
		System.out.println("Cinturon: " + cinturon);
		System.out.println("Monitoreo: " + monitoreo);
		System.out.println("Frenos: " + frenos);
		System.out.println("Clima: " + clima);
		System.out.println("Engranes: " + engranes);
		System.out.println("DepAceite: " + depAceite);
		System.out.println("Tension: " + tension);
		System.out.println("");
	}

	
	/*
	public static void assertResults(DiagnosticoOperatividad recomendacion, AccionRecomendada valorEsperado) {
		AccionRecomendada accion = recomendacion.getAccion();
		printResults(accion.toString(), valorEsperado.toString());
		assert(accion.isa(valorEsperado));
	}

	private static void printResults(String result,String expected) {
		print("Resultados");
		print("Esperaba: " + expected);
		print("Recibi: " + result);
		Boolean isOk = result.equals(expected);
		String condition = isOk ? "Ok" : "Fallo";
		print("Caso de prueba: "+ condition);
	}
	*/
}
