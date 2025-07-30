package TransTakwary;

public class Main {
	public static void main(String[] args) {
		Veículo v1 = new Veículo("Avenida Agamenon Magalhães - Rua Coronel Tejo", 123456);
		Cliente cl1 = new Cliente("Eduardo", 4908132);
		
		System.out.println("O nome do cliente é " + cl1.getNome());
		
		cl1.setCadastro(3568369);
		System.out.println("--Fazendo Cadastro--");
		System.out.println("Emitindo código...")
		System.out.println("O código cadastral do cliente " + cl1.getNome() + " é: " + cl1.getCadastro() + " .");
		
		v1.adicionar_veiculo();
		cl1.ingressar();
		
		v1.setID(9123445);
		System.out.println("A identificação do veículo de rota: " + v1.getRota() + " é: " + v1.getID() + " .");
		
		
	}
	

}

