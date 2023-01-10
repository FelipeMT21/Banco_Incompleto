
public class TestaGerente {

	public static void main(String[] args) {
		Banco bancoSilva = new Banco("0123124", "123412436");
		Gerente silva = new Gerente("Silva Martins", "2031231212-21");
		Banco bancoJhully = new Banco("2131515", "2131523523");
		Funcionario jhully = new Funcionario("Jhully", "4653532341212-29");
		
		bancoSilva.setGerente(silva);
		bancoSilva.getGerente().setSalario(5000);
		System.out.println("GERENTE " + silva.getNome() + " Sem bonificação: " + bancoSilva.getGerente().getSalario());
		System.out.println("GERENTE " + silva.getNome() + " Com Bonificação: " + bancoSilva.getGerente().bonificacao());
		
		bancoJhully.setFuncionario(jhully);
		bancoJhully.getFuncionario().setSalario(1000);
		System.out.println("FUNCIONARIA " + jhully.getNome() + " Sem bonificação: " + bancoJhully.getFuncionario().getSalario());		
		System.out.println("FUNCIONARIA " + jhully.getNome() + " Com bonificação: " + bancoJhully.getFuncionario().getbonificacao());		

		/*silva.setSenha(2929);
		boolean autenticou = silva.autentica(2929);
		System.out.println("Acesso: " + autenticou);
		
		silva.setLogin("Felipe");
		
		boolean autenticouComLogin = silva.autentica("Felipe", 2929);
		System.out.println("Acesso: " + autenticou);
		
		System.out.println(bancoSilva.getFuncionario().getbonificacao());*/
		
		//Ligação
		/*System.out.println(bancoSilva);
		System.out.println(bancoSilva.getFuncionario());
		bancoSilva.setFuncionario(silva);
		System.out.println(bancoSilva.getFuncionario().getNome());
		System.out.println(bancoSilva.getFuncionario());
		System.out.println(silva);*/

		
		/*bancoSilva.setFuncionario(silva);
		System.out.println("Felipe: " + bancoSilva.getFuncionario());
		System.out.println(bancoSilva.getFuncionario().getNome());
		System.out.println(bancoSilva.getFuncionario().getCpf());
		System.out.println(bancoSilva.getAgencia());
		bancoSilva.getFuncionario().setSalario(1000);
		System.out.println(bancoSilva.getFuncionario().getSalario());
		
		System.out.println(bancoSilva.getFuncionario().getbonificacao());
		System.out.println(silva.bonificacao());*/
		
		/*bancoSilva.setFuncionario(jhully);
		System.out.println("Jhully: " + bancoSilva.getFuncionario());
		System.out.println(bancoSilva.getFuncionario().getNome());*/
		


	}
}
