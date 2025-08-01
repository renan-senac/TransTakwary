package TransTakwary;

public class Main {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("Avenida Agamenon Magalhães - Rua Coronel Tejo", 123456);
		Cliente cl1 = new Cliente("Eduardo", 4908132);
		
		System.out.println("O nome do cliente é " + cl1.getnome());
		
		cl1.setcadastro(456789);
		System.out.println("--Fazendo Cadastro--");
		System.out.println("Emitindo código...");
		System.out.println("O código cadastral do cliente " + cl1.getnome() + " é: " + cl1.getcadastro() + " .");
		
		v1.adicionar();
		cl1.ingressar(v1.pegarID());
		
		v1.setID(9123445);
		System.out.println("A identificação do veículo de rota: " + v1.getrota() + " é: " + v1.pegarID() + " .");
		
		}
	
}
