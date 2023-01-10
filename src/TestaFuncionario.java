
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario joao = new Funcionario("João Felipe", "211.122.212-21");
		System.out.println("Nome: " + joao.getNome());
		System.out.println("CPF: " + joao.getCpf());
		
		joao.setSalario(1000);
		System.out.println(joao.getbonificacao());
	}
}
