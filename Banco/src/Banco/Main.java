package Banco;

public class Main {

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta(6578934, 0);
		
		Cuenta cuenta2 = new Cuenta(3456987, 3000000);
		
		Cliente persona1 = new Cliente("Tatiana", "Buitrago", 1019146060, cuenta1);
		
		Cliente persona2 = new Cliente("Francisco", "Suesca", 1020836281, cuenta2);
		
		persona1.aumentarSaldo(100000);
		
		System.out.println(persona1.datosCliente());
	}

}
