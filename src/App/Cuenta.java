package App;

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
	}

	public void reintegro(double cantidad) {
		saldo = saldo - cantidad;
	}
}
