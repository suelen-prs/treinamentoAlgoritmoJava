package entities;

public class Cliente {
	private String numeroConta;
	private String nome;
	private double depositoInicial;
	
	public Cliente(String numeroConta, String nome, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		depositoConta(depositoInicial);
	}
	
	public Cliente(String numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double depositoInicial() {
		return depositoInicial;
	}
	
	public void depositoConta(double deposito) {
		this.depositoInicial += deposito;
	}
	
	public void saqueConta(double saque) {
		this.depositoInicial -= (saque + 5.00);
	}
	
	public String toString() {
		return "Conta: "
			+ numeroConta
			+ ", Titular: "
			+ nome
			+ ", Saldo: R$"
			+ String.format("%.2f", depositoInicial);
	}

}
