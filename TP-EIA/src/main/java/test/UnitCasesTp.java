package test;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import atributos.Consideraciones;
import atributos.EstadoCorrosion;
import atributos.IntegridadFrenos;
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

public class UnitCasesTp {

	String K_SESSION_NAME = "montaniaRusa-session";

	KieSession sessionStatefull;
	static KieContainer kieContainer;

	public UnitCasesTp() {
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
		depAceite.setCargaPorcentual(97.0);

		Cinturon cinturones = new Cinturon();
		cinturones.setDesgaste(TipoDesgaste.BuenEstado);

		TensionElectrica tension = new TensionElectrica();
		tension.setNivelDeVoltaje(610);

		Freno frenos = new Freno();
		frenos.setCorrosion(EstadoCorrosion.NoPresentaCorrosion);
		frenos.setEspesorPastillas(6);
		frenos.setPotenciaImanes(14500);

		Clima clima = new Clima();
		clima.setIntensidadPrecipitaciones(2);
		clima.setIntensidadRafagas(10);

		MontaniaRusa atraccion = new MontaniaRusa(engranes, depAceite, cinturones, monitoreo, tension, frenos, clima);

		TestCaseUtils.verAtraccion(atraccion);
		sessionStatefull.insert(atraccion);
		sessionStatefull.fireAllRules();

		DiagnosticoOperatividad recomendacion = atraccion.getResultadoFinal();
		Consideraciones valorEsperado = Consideraciones.CargarBateriaPLC;
		Consideraciones consideracion = recomendacion.getConsideracion();
		assert(consideracion.compare(valorEsperado));
		TestCaseUtils.printResults(consideracion.toString(),valorEsperado.toString());
	}

	@Test
	public void noOperativoPorCLimaTest() {

		Monitoreo monitoreo = new Monitoreo();
		monitoreo.setNivelCargaBateriaPLC(90.0);
		monitoreo.setOperatividadSensoresMonitoreo(OperatividadSensoresMonitoreo.Operativo);
		monitoreo.setOperatividadSensorParada(OperatividadSensorParada.Operativo);

		Engrane engranes = new Engrane();
		engranes.setCargaPorcentual(90.0);

		DepositoAceite depAceite = new DepositoAceite();
		depAceite.setCargaPorcentual(97.0);

		Cinturon cinturones = new Cinturon();
		cinturones.setDesgaste(TipoDesgaste.BuenEstado);

		TensionElectrica tension = new TensionElectrica();
		tension.setNivelDeVoltaje(610);

		Freno frenos = new Freno();
		frenos.setCorrosion(EstadoCorrosion.NoPresentaCorrosion);
		frenos.setEspesorPastillas(6);
		frenos.setPotenciaImanes(14500);

		Clima clima = new Clima();
		clima.setIntensidadPrecipitaciones(10);
		clima.setIntensidadRafagas(80);

		MontaniaRusa atraccion = new MontaniaRusa(engranes, depAceite, cinturones, monitoreo, tension, frenos, clima);

		TestCaseUtils.verAtraccion(atraccion);
		sessionStatefull.insert(atraccion);
		sessionStatefull.fireAllRules();

		DiagnosticoOperatividad recomendacion = atraccion.getResultadoFinal();
		Consideraciones valorEsperado = Consideraciones.JuegoNoOperativoPorClima;
		Consideraciones consideracion = recomendacion.getConsideracion();
		assert(consideracion.compare(valorEsperado));
		TestCaseUtils.printResults(consideracion.toString(),valorEsperado.toString());
	}
	
	@Test
	public void operativoTest() {

		Monitoreo monitoreo = new Monitoreo();
		monitoreo.setNivelCargaBateriaPLC(90.0);
		monitoreo.setOperatividadSensoresMonitoreo(OperatividadSensoresMonitoreo.Operativo);
		monitoreo.setOperatividadSensorParada(OperatividadSensorParada.Operativo);

		Engrane engranes = new Engrane();
		engranes.setCargaPorcentual(90.0);

		DepositoAceite depAceite = new DepositoAceite();
		depAceite.setCargaPorcentual(97.0);

		Cinturon cinturones = new Cinturon();
		cinturones.setDesgaste(TipoDesgaste.BuenEstado);

		TensionElectrica tension = new TensionElectrica();
		tension.setNivelDeVoltaje(610);

		Freno frenos = new Freno();
		frenos.setCorrosion(EstadoCorrosion.NoPresentaCorrosion);
		frenos.setEspesorPastillas(6);
		frenos.setPotenciaImanes(14500);

		Clima clima = new Clima();
		clima.setIntensidadPrecipitaciones(10);
		clima.setIntensidadRafagas(30);

		MontaniaRusa atraccion = new MontaniaRusa(engranes, depAceite, cinturones, monitoreo, tension, frenos, clima);

		TestCaseUtils.verAtraccion(atraccion);
		sessionStatefull.insert(atraccion);
		sessionStatefull.fireAllRules();

		DiagnosticoOperatividad recomendacion = atraccion.getResultadoFinal();
		Consideraciones valorEsperado = Consideraciones.Operativo;
		Consideraciones consideracion = recomendacion.getConsideracion();
		assert(consideracion.compare(valorEsperado));
		TestCaseUtils.printResults(consideracion.toString(),valorEsperado.toString());
	}
	
	@Test
	public void revisarFrenosTest() {

		Monitoreo monitoreo = new Monitoreo();
		monitoreo.setNivelCargaBateriaPLC(90.0);
		monitoreo.setOperatividadSensoresMonitoreo(OperatividadSensoresMonitoreo.Operativo);
		monitoreo.setOperatividadSensorParada(OperatividadSensorParada.Operativo);

		Engrane engranes = new Engrane();
		engranes.setCargaPorcentual(90.0);

		DepositoAceite depAceite = new DepositoAceite();
		depAceite.setCargaPorcentual(97.0);

		Cinturon cinturones = new Cinturon();
		cinturones.setDesgaste(TipoDesgaste.BuenEstado);

		TensionElectrica tension = new TensionElectrica();
		tension.setNivelDeVoltaje(610);

		Freno frenos = new Freno();
		frenos.setCorrosion(EstadoCorrosion.NoPresentaCorrosion);
		frenos.setEspesorPastillas(6);
		frenos.setPotenciaImanes(13000);

		Clima clima = new Clima();
		clima.setIntensidadPrecipitaciones(10);
		clima.setIntensidadRafagas(30);

		MontaniaRusa atraccion = new MontaniaRusa(engranes, depAceite, cinturones, monitoreo, tension, frenos, clima);

		TestCaseUtils.verAtraccion(atraccion);
		sessionStatefull.insert(atraccion);
		sessionStatefull.fireAllRules();

		DiagnosticoOperatividad recomendacion = atraccion.getResultadoFinal();
		Consideraciones valorEsperado = Consideraciones.RevisarFrenos;
		Consideraciones consideracion = recomendacion.getConsideracion();
		assert(consideracion.compare(valorEsperado));
		TestCaseUtils.printResults(consideracion.toString(),valorEsperado.toString());
	}
	
	@Test
	public void revisarAlinearEngranesTest() {

		Monitoreo monitoreo = new Monitoreo();
		monitoreo.setNivelCargaBateriaPLC(90.0);
		monitoreo.setOperatividadSensoresMonitoreo(OperatividadSensoresMonitoreo.Operativo);
		monitoreo.setOperatividadSensorParada(OperatividadSensorParada.Operativo);

		Engrane engranes = new Engrane();
		engranes.setCargaPorcentual(40.0);

		DepositoAceite depAceite = new DepositoAceite();
		depAceite.setCargaPorcentual(97.0);

		Cinturon cinturones = new Cinturon();
		cinturones.setDesgaste(TipoDesgaste.BuenEstado);

		TensionElectrica tension = new TensionElectrica();
		tension.setNivelDeVoltaje(610);

		Freno frenos = new Freno();
		frenos.setCorrosion(EstadoCorrosion.NoPresentaCorrosion);
		frenos.setEspesorPastillas(6);
		frenos.setPotenciaImanes(14500);

		Clima clima = new Clima();
		clima.setIntensidadPrecipitaciones(10);
		clima.setIntensidadRafagas(30);

		MontaniaRusa atraccion = new MontaniaRusa(engranes, depAceite, cinturones, monitoreo, tension, frenos, clima);

		TestCaseUtils.verAtraccion(atraccion);
		sessionStatefull.insert(atraccion);
		sessionStatefull.fireAllRules();

		DiagnosticoOperatividad recomendacion = atraccion.getResultadoFinal();
		Consideraciones valorEsperado = Consideraciones.AlinearEngranes;
		Consideraciones consideracion = recomendacion.getConsideracion();
		assert(consideracion.compare(valorEsperado));
		TestCaseUtils.printResults(consideracion.toString(),valorEsperado.toString());
	}
	
	@Test
	public void cargarDepositosAceiteTest() {

		Monitoreo monitoreo = new Monitoreo();
		monitoreo.setNivelCargaBateriaPLC(90.0);
		monitoreo.setOperatividadSensoresMonitoreo(OperatividadSensoresMonitoreo.Operativo);
		monitoreo.setOperatividadSensorParada(OperatividadSensorParada.Operativo);

		Engrane engranes = new Engrane();
		engranes.setCargaPorcentual(90.0);

		DepositoAceite depAceite = new DepositoAceite();
		depAceite.setCargaPorcentual(30.0);

		Cinturon cinturones = new Cinturon();
		cinturones.setDesgaste(TipoDesgaste.BuenEstado);

		TensionElectrica tension = new TensionElectrica();
		tension.setNivelDeVoltaje(610);

		Freno frenos = new Freno();
		frenos.setCorrosion(EstadoCorrosion.NoPresentaCorrosion);
		frenos.setEspesorPastillas(6);
		frenos.setPotenciaImanes(14500);

		Clima clima = new Clima();
		clima.setIntensidadPrecipitaciones(10);
		clima.setIntensidadRafagas(30);

		MontaniaRusa atraccion = new MontaniaRusa(engranes, depAceite, cinturones, monitoreo, tension, frenos, clima);

		TestCaseUtils.verAtraccion(atraccion);
		sessionStatefull.insert(atraccion);
		sessionStatefull.fireAllRules();

		DiagnosticoOperatividad recomendacion = atraccion.getResultadoFinal();
		Consideraciones valorEsperado = Consideraciones.CargarDepositosAceite;
		Consideraciones consideracion = recomendacion.getConsideracion();
		assert(consideracion.compare(valorEsperado));
		TestCaseUtils.printResults(consideracion.toString(),valorEsperado.toString());
	}
	
	@Test
	public void revisarSensoresTest() {
		Monitoreo monitoreo = new Monitoreo();
		monitoreo.setNivelCargaBateriaPLC(90.0);
		monitoreo.setOperatividadSensoresMonitoreo(OperatividadSensoresMonitoreo.NoOperativo);
		monitoreo.setOperatividadSensorParada(OperatividadSensorParada.Operativo);

		Engrane engranes = new Engrane();
		engranes.setCargaPorcentual(90.0);

		DepositoAceite depAceite = new DepositoAceite();
		depAceite.setCargaPorcentual(97.0);

		Cinturon cinturones = new Cinturon();
		cinturones.setDesgaste(TipoDesgaste.BuenEstado);

		TensionElectrica tension = new TensionElectrica();
		tension.setNivelDeVoltaje(610);

		Freno frenos = new Freno();
		frenos.setCorrosion(EstadoCorrosion.NoPresentaCorrosion);
		frenos.setEspesorPastillas(6);
		frenos.setPotenciaImanes(14500);

		Clima clima = new Clima();
		clima.setIntensidadPrecipitaciones(10);
		clima.setIntensidadRafagas(30);

		MontaniaRusa atraccion = new MontaniaRusa(engranes, depAceite, cinturones, monitoreo, tension, frenos, clima);

		TestCaseUtils.verAtraccion(atraccion);
		sessionStatefull.insert(atraccion);
		sessionStatefull.fireAllRules();

		DiagnosticoOperatividad recomendacion = atraccion.getResultadoFinal();
		Consideraciones valorEsperado = Consideraciones.RevisarSensores;
		Consideraciones consideracion = recomendacion.getConsideracion();
		assert(consideracion.compare(valorEsperado));
		TestCaseUtils.printResults(consideracion.toString(),valorEsperado.toString());
	}
	
	@Test
	public void revisarNivelTensionTest() {
		Monitoreo monitoreo = new Monitoreo();
		monitoreo.setNivelCargaBateriaPLC(90.0);
		monitoreo.setOperatividadSensoresMonitoreo(OperatividadSensoresMonitoreo.Operativo);
		monitoreo.setOperatividadSensorParada(OperatividadSensorParada.Operativo);

		Engrane engranes = new Engrane();
		engranes.setCargaPorcentual(90.0);

		DepositoAceite depAceite = new DepositoAceite();
		depAceite.setCargaPorcentual(97.0);

		Cinturon cinturones = new Cinturon();
		cinturones.setDesgaste(TipoDesgaste.BuenEstado);

		TensionElectrica tension = new TensionElectrica();
		tension.setNivelDeVoltaje(510);

		Freno frenos = new Freno();
		frenos.setCorrosion(EstadoCorrosion.NoPresentaCorrosion);
		frenos.setEspesorPastillas(6);
		frenos.setPotenciaImanes(14500);

		Clima clima = new Clima();
		clima.setIntensidadPrecipitaciones(10);
		clima.setIntensidadRafagas(30);

		MontaniaRusa atraccion = new MontaniaRusa(engranes, depAceite, cinturones, monitoreo, tension, frenos, clima);

		TestCaseUtils.verAtraccion(atraccion);
		sessionStatefull.insert(atraccion);
		sessionStatefull.fireAllRules();

		DiagnosticoOperatividad recomendacion = atraccion.getResultadoFinal();
		Consideraciones valorEsperado = Consideraciones.RevisarNivelTension;
		Consideraciones consideracion = recomendacion.getConsideracion();
		assert(consideracion.compare(valorEsperado));
		TestCaseUtils.printResults(consideracion.toString(),valorEsperado.toString());
	}
	
	@Test
	public void revisarCinturonesSeguridadTest() {
		Monitoreo monitoreo = new Monitoreo();
		monitoreo.setNivelCargaBateriaPLC(90.0);
		monitoreo.setOperatividadSensoresMonitoreo(OperatividadSensoresMonitoreo.Operativo);
		monitoreo.setOperatividadSensorParada(OperatividadSensorParada.Operativo);

		Engrane engranes = new Engrane();
		engranes.setCargaPorcentual(90.0);

		DepositoAceite depAceite = new DepositoAceite();
		depAceite.setCargaPorcentual(97.0);

		Cinturon cinturones = new Cinturon();
		cinturones.setDesgaste(TipoDesgaste.DesgasteHebillas);

		TensionElectrica tension = new TensionElectrica();
		tension.setNivelDeVoltaje(610);

		Freno frenos = new Freno();
		frenos.setCorrosion(EstadoCorrosion.NoPresentaCorrosion);
		frenos.setEspesorPastillas(6);
		frenos.setPotenciaImanes(14500);

		Clima clima = new Clima();
		clima.setIntensidadPrecipitaciones(10);
		clima.setIntensidadRafagas(30);

		MontaniaRusa atraccion = new MontaniaRusa(engranes, depAceite, cinturones, monitoreo, tension, frenos, clima);

		TestCaseUtils.verAtraccion(atraccion);
		sessionStatefull.insert(atraccion);
		sessionStatefull.fireAllRules();

		DiagnosticoOperatividad recomendacion = atraccion.getResultadoFinal();
		Consideraciones valorEsperado = Consideraciones.RevisarCinturonesSeguridad;
		Consideraciones consideracion = recomendacion.getConsideracion();
		assert(consideracion.compare(valorEsperado));
		TestCaseUtils.printResults(consideracion.toString(),valorEsperado.toString());
	}

}
