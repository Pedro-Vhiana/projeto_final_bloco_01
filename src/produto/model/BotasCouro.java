package produto.model;

public class BotasCouro extends Botas {

	private int couro;

	public BotasCouro(int id, String nome, int tamanho, String marca, int tipo, int couro) {
		super(id, nome, tamanho, marca, tipo);
		this.couro = couro;
	}

	public int getCouro() {
		return couro;
	}

	public void setCouro(int couro) {
		this.couro = couro;
	}

	@Override 
	public void visu() {
		super.visu();
		
		if(couro == 1) {
			System.out.println("| Escolha do couro: Envelhecido  ");
			System.out.print("|--------------------------------------------------|\n");
		}else if(couro == 2){
			System.out.println("| Escolha do couro: Defumado  ");
			System.out.print("|--------------------------------------------------|\n");
		}else {
			System.out.println("| Couro não informado...");
			System.out.print("|--------------------------------------------------|\n");
			
		}
		
	}

}
