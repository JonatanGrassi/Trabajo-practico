package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import atributos.Consideraciones;
import atributos.EstadoCorrocion;
import atributos.OperatividadSensorParada;
import atributos.OperatividadSensoresMonitoreo;
import atributos.TipoDesgaste;
import conceptos.Cinturon;
import conceptos.Clima;
import conceptos.DepositoAceite;
import conceptos.DiagnosticoOperatividad;
import conceptos.Engrane;
import conceptos.Freno;
import conceptos.Monitoreo;
import conceptos.MontaniaRusa;
import conceptos.TensionElectrica;
import utils.KnowledgeSessionHelper;
import utils.TestCaseUtils;

class Tests {

	String K_SESSION_NAME = "montaniaRusa-session";
	//static KieContainer kieContainer; 
	//KieSession sessionStatefull;
	static KieContainer kieContainer = KnowledgeSessionHelper.createRuleBase();
	KieSession sessionStatefull = KnowledgeSessionHelper.getStatefulKnowledgeSessionWithCallback(kieContainer, K_SESSION_NAME);
	
	FactHandle automovilDir;
	
	public Tests() {
	}

	@BeforeClass
	public static void beforeallTestSetup() {
		kieContainer = KnowledgeSessionHelper.createRuleBase();
	}
	private void prepareKnowledgeSession() {
		sessionStatefull = KnowledgeSessionHelper.getStatefulKnowledgeSessionWithCallback(kieContainer, K_SESSION_NAME);
	}
	
	@Before
	public void setUp() {
		System.out.println("----------Start----------");
		System.out.println();
		this.prepareKnowledgeSession(); // Inicializa una nueva base de hechos
	}
	
	
	@After
	public void tearDown() {
		System.out.println();
		System.out.println("----------END----------");
		System.out.println();
	}
	
	@Test
	public void cargarBateriaPLCTest() {
		
		Monitoreo monitoreo = new Monitoreo();
		monitoreo.setNivelCargaBateriaPLC(50.0);
		monitoreo.setOperatividadSensoresMonitoreo(OperatividadSensoresMonitoreo.Operativo);
		monitoreo.setOperatividadSensorParada(OperatividadSensorParada.Operativo);
		
		Engrane engranes = new Engrane();
		engranes.setCargaPorcentual(90.0);
		
		DepositoAceite depAceite = new DepositoAceite();
		depAceite.setCargaPorcentual(95.0);
		
		Cinturon cinturones = new Cinturon();
		cinturones.setDesgaste(TipoDesgaste.BuenEstado);
		
		TensionElectrica tension = new TensionElectrica();
		tension.setNivelCargaBateriaPLC(610);
		
		Freno frenos = new Freno();
		frenos.setCorrocion(EstadoCorrocion.NoPresentaCorrocion);
		frenos.setEspesorPastillas(6);
		frenos.setPotenciaImanes(14500);
		
		Clima clima = new Clima();	
		clima.setIntensidadPrecipitaciones(2);
		clima.setIntensidadRafagas(10);
		
		
		MontaniaRusa atraccion = new MontaniaRusa(engranes,depAceite, cinturones, monitoreo, tension, frenos, clima);
		
		TestCaseUtils.verAtraccion(atraccion);
		sessionStatefull.insert(atraccion);
		sessionStatefull.fireAllRules();

		DiagnosticoOperatividad recomendacion = atraccion.getResultadoFinal();
		Consideraciones valorEsperado = Consideraciones.CargarBateriaPLC;
		Consideraciones consideracion = recomendacion.getConsideracion();
		assert(consideracion.compare(valorEsperado));		
	}

}
