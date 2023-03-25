package Banco;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private int cedula;
	private Cuenta cuenta; 
	
	public Cliente(String nom, String apelli, int cedula, Cuenta cuenta) {
		
		nombre = nom;
		apellido = apelli;
		this.cedula = cedula;
		this.cuenta = cuenta;
	}
	
	public String dimeNombre() { //getter
		return nombre;
	}
	
	public String dimeApellido() { //getter
		return apellido;
	}
	
	public int dimeCedula() { //getter
		return cedula;
	}
	
	public int dameCuenta() { //getter
		return cuenta.dameNumeroCuenta();
	}
	
	public int dameSaldo() { //getter
		return cuenta.dameSaldo();
	}
	
	public void aumentarSaldo(int aumento) { //setter
		cuenta.aumentarSaldo(aumento);
	}

	public void retirarSaldo(int retiro) { //setter
		cuenta.retiroSaldo(retiro);
	}
	
	public String datosCliente() {
		return "El cliente: " + nombre + " " + apellido
				+ "\nEl numero de cuenta: " + cuenta.dameNumeroCuenta()
				+ "\nSu saldo es: " + cuenta.dameSaldo();
	}
}
