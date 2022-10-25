package App;

enum SIGNO{D,H}

public class Movimiento {
	private double importe;
	private SIGNO signo;
	private String detalle;
	
	public Movimiento(double importe, SIGNO signo, String detalle) {
		super();
		this.importe = importe;
		this.signo = signo;
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Movimiento [importe=" + importe + ", signo=" + signo + ", detalle=" + detalle + "]";
	}
	
	
}
