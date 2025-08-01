package TransTakwary;

public class Especial extends Cliente {
	String categoria;

	public Especial(String nome, int cadastro, String categoria) {
		super(nome, cadastro);
		this.categoria = categoria;
	}

	public void aplicardesconto(int categoria) {
		switch (categoria) {
		case 1 :
			System.out.println("Idoso - Desconto de 50%");
			break;
		case 2 :
			System.out.println("Deficiente - Desconto de 60%");
			break;
		case 3 :
			System.out.println("Estudante - Desconto de 30%");
			break;
		default:
			System.out.println("Categoria inválida");
		}
	}
}
