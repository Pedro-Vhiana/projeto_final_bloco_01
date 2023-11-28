package produto.model;

public class BotasCouroSintetico extends Botas {

	private int brinde;

	public BotasCouroSintetico(int id, String nome, int tamanho, String marca, int tipo, int brinde) {
		super(id, nome, tamanho, marca, tipo);
		this.brinde = brinde;
	}

	public int getBrinde() {
		return brinde;
	}

	public void setBrinde(int brinde) {
		this.brinde = brinde;
	}

	@Override
	public void visu() {
		super.visu();

		if (brinde == 1) {
			System.out.println("| Brinde Escolhido: Meia");
			System.out.print("|--------------------------------------------------|\n");

		} else if (brinde == 2) {
			System.out.println("| Brinde Escolhido: Adesivo");
			System.out.print("|--------------------------------------------------|\n");

		} else if (brinde == 3) {
			System.out.println("| Brinde Escolhido: Esponja ( Para Higiene )");
			System.out.print("|--------------------------------------------------|\n");
			
		} else  {
			System.out.println("| Nenhum Brinde informado! ");
			System.out.print("|--------------------------------------------------|\n");
			
		}

	}

}
