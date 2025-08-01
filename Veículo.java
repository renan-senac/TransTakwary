//Iniciando Projeto de serviço de tranporte 
package TransTakwary;

public class Veiculo {
	 public String rota;
	 private int ID;
	 
	 public Veiculo(String rota, int ID) {
		 this.rota = rota;
		 this.ID = ID;
	 }
	 
	 public void adicionar() {
		 System.out.print("O veículo: " + this.ID + "será direcionado para a rota: " + this.rota);
	 }
	 
	 public void calcular_rota() {
		 System.out.print("Buscando: " + this.rota);
	 }
	 
	 
	 public String getrota() {
		 return this.rota;
	 }
	 
	 
	 public String setrota(String rotaVeiculo) {
		 return this.rota = rotaVeiculo;
	 }
	 
	 
	 public int pegarID() {
		 return this.ID;
	 }
	 
	 
	 public int setID(int IDVeículo) {
		 return this.ID = IDVeículo;
	 }

}
