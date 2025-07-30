//Iniciando Projeto de serviço de tranporte 
package TransTakwary;

public class Veículo {
	 public String rota;
	 private int ID;
	 
	 public Veículo(String rota, int ID) {
		 this.rota = rota;
		 this.ID = ID;
	 }
	 
	 void adicionar_veículo() {
		 System.out.print("O veículo: " + this.ID + "será direcionado para a rota: " + this.rota);
	 }
	 
	 void calcular_rota() {
		 System.out.print("Buscando: " + this.rota);
	 }
	 
	 
	 public String getrota() {
		 return this.rota;
	 }
	 
	 
	 public String setrota(String rotaVeículo) {
		 return this.rota = rotaVeículo;
	 }
	 
	 
	 public int getID() {
		 return this.ID;
	 }
	 
	 
	 public int setID(int IDVeículo) {
		 return this.ID = IDVeículo;
	 }

}

