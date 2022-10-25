package App;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	private String numero;
	private String titular;
	private double saldo;
	private List<Movimiento> movimientos;

	
	
	
	public Cuenta(String numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.movimientos = new ArrayList<Movimiento>();
	}

	public String getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public void ingreso(double cantidad) {
		saldo = saldo + cantidad;
		this.movimientos.add(new Movimiento(cantidad, SIGNO.H, "Se ha aumentado el saldo"));
	}

	public void reintegro(double cantidad) throws Exception {
		if(saldo - cantidad >= -500) {
			saldo = saldo - cantidad;
			this.movimientos.add(new Movimiento(cantidad, SIGNO.D, "Se ha reducido el saldo"));
		} else {
			throw new Exception("Saldo Insuficiente");
		}
		
	}
}
