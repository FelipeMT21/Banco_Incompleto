
public class Gerente extends Funcionario {

	private int senha;
	private String login;
	
	public Gerente(String nome, String cpf) {
		super(nome,cpf);
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean autentica(String login, int senha) {
		if(this.login == login && this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	public double bonificacao() {
		return super.getbonificacao() + super.getSalario();
	}
}
