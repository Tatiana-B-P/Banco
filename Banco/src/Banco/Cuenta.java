package Banco;

public class Cuenta {

	private int numeroCuenta;
	private int saldo; 
	
	public Cuenta(int numeroCuenta, int saldo) { 
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		
	}
	
	public int dameNumeroCuenta() { //getter
		return numeroCuenta;
	}
	
	public int dameSaldo() { //getter
		return saldo;
	}
	
	public void aumentarSaldo(int aumento) {
		saldo = saldo + aumento;
		
	}
	
	public void retiroSaldo(int retiro) {
		saldo = saldo - retiro;
	}
	
}
