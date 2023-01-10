
public class TestaBanco {

	public static void main(String[] args) {
		Banco bancoFelipe = new Banco("2121-2", "121");
		Funcionario felipe = new Funcionario("João Felipe", "211.122.212-21");

		System.out.println(bancoFelipe);

		bancoFelipe.setFuncionario(felipe);
		System.out.println(bancoFelipe.getFuncionario().getNome());

		felipe.deposita(1000);
		System.out.println("Saldo: " + felipe.getSalario());
		felipe.saca(1100);
		
		System.out.println("Bonificação: " + felipe.getbonificacao());

	}
}
