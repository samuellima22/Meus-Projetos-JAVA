package Banco;

public abstract class Atributos {
	public String banco = "Banco SamLando";
	public String nome;
	private String cpf;
	private double saldo;
	private String conta;
	
	public void Cliente(String nome, String cpf, String conta ) {
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
	}
	
	public double setSaldo() {
		return this.saldo= saldo;
	}
	public void getDepositar(double vDeposito) {
		this.saldo = saldo + vDeposito;
		System.out.println("Você depositou R$"+vDeposito+", Seu saldo é "+
		saldo);
	}
	
	public void getSacar(int vSaque) {
		if (vSaque <= this.saldo) {
			this.saldo = saldo - vSaque;
			System.out.println("Você sacou R$"+vSaque+", Seu novo saldo é "+
			saldo);
		}
		else {
			System.out.println("Saldo Insuficiente");
		}	
	} 
}
