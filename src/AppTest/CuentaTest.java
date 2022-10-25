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
		cuenta2 = new Cuenta("67890", "Manuel", 0);
	}

	@Test
	public void testIngreso() {
		double saldoInicial = cuenta1.getSaldo();
		double ingreso = 100;
		cuenta1.ingreso(ingreso);
		assertEquals((long)(saldoInicial + ingreso), (long)cuenta1.getSaldo());
	}

	@Test
	public void testReintegro() {
		double saldoInicial = cuenta1.getSaldo();
		double reintegro = 100;
		try {
			cuenta1.reintegro(reintegro);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		};
		assertEquals((long)(saldoInicial-reintegro), (long)cuenta1.getSaldo());
	}
	
	@Test
	public void test0014() {
		try {
			cuenta1.reintegro(200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			cuenta2.reintegro(350);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		cuenta1.ingreso(100);
		try {
			cuenta2.reintegro(200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			cuenta2.reintegro(150);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			cuenta1.reintegro(200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		cuenta2.ingreso(50);
		try {
			cuenta2.reintegro(100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		assertEquals((long)cuenta1.getSaldo(), -250);
		assertEquals((long)cuenta2.getSaldo(), -450);
	}

}
