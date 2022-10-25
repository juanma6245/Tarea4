package AppTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import App.Cuenta;

public class CuentaTest {

	private Cuenta cuenta1;
	private Cuenta cuenta2;

	@Before
	public void setUp() throws Exception {
		cuenta1 = new Cuenta("12345", "Juan", 50);
	}

	@Test
	public void testIngreso() {
		double saldoInicial = cuenta1.getSaldo();
		double ingreso = 100;
		cuenta1.ingreso(ingreso);
		assertEquals(saldoInicial+ingreso, cuenta1.getSaldo());
	}

	@Test
	public void testReintegro() {
		double saldoInicial = cuenta1.getSaldo();
		double reintegro = 100;
		cuenta1.reintegro(reintegro);;
		assertEquals(saldoInicial-reintegro, cuenta1.getSaldo());
	}

}
