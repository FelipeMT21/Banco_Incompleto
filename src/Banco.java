
public class Banco {

	private String conta;
	private String agencia;
	private Funcionario funcionario;
	private Gerente gerente;

	public Banco(String conta, String agencia) {
		this.conta = conta;
		System.out.println("Agencia: " + agencia);
		this.agencia = agencia;
		System.out.println("Conta: " + conta);
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public Gerente getGerente() {
		return this.gerente;
	}
	
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
}
