import TransTakwary.Cliente;
public class Cliente extends Veículo{
	int cadastro;
	String nome;
	
	public Aluno(String nome, int cadastro, String rota) {
		super(rota);
		this.cadastro = cadastro;
	}
	
	@Override
	void ingressar(int pegarID) {
		System.out.print("O cliente está efetivando o ingresso de reserva no veículo " + pegarID + " . ");
	}
}

