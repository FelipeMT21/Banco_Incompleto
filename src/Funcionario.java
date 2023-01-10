
public class Funcionario {

	private String nome;
	private String Cpf;
	private int salario;

	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.Cpf = cpf;
	}
	
	public int getSalario() {
		return this.salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public void deposita(int valor) {
		if (valor > 0) {
			this.salario += valor;
		}
	}

	public boolean saca(int valor) {
		if (this.salario >= valor) {
			this.salario -= valor;
			return true;
		} else {
			System.out.println("Você não tem saldo suficiente!");
			System.out.println("Saldo: " + getSalario());
			return false;
		}
	}

	public double getbonificacao() {
		return this.salario * 0.1;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		this.Cpf = cpf;
	}
}
