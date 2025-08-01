package TransTakwary;

public class Cliente {
	int cadastro;
	String nome;

	public Cliente(String nome, int cadastro) {
		this.cadastro = cadastro;
		this.nome = nome;
	}

	void ingressar(int pegarID) {
		System.out.print("O cliente está efetivando o ingresso de reserva no veículo " + pegarID + " . ");
	}
	public String getnome() {
		 return this.nome;
	 }
	public String setnome(String nomeCliente) {
		 return this.nome = nomeCliente;
	 }
	public int getcadastro() {
		 return this.cadastro;
	 }
	public int setcadastro(int cadastroCliente) {
		 return this.cadastro = cadastroCliente;
	 }
}
