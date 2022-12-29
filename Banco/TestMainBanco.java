package Banco;

public class TestMainBanco {

	public static void main(String[] args) {
		ContaCorrente co1 = new ContaCorrente();
		co1.Cliente("samuel","131312143457","42354235268");
		co1.setSaldo();
		co1.getDepositar(100);
		System.out.println(co1.setSaldo());
		co1.getSacar(150);
		co1.getDepositar(400);
		co1.getSacar(300);
		
		

	}

}
