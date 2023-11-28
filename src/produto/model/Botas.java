package produto.model;

public abstract class Botas {

	private String nome;
	private int tamanho;
	private String marca;
	private int id;
	private int tipo;

	public Botas(int id, String nome, int tamanho, String marca, int tipo) {
		super();
		this.nome = nome;
		this.tamanho = tamanho;
		this.marca = marca;
		this.id = id;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void visu() {

		String tipo = "";
		
		switch(this.tipo) {
		case 1: 
			tipo = "Bota de Couro";
			break;
		case 2:
			tipo = "Bota de Couro Sintético";
			break;
		}
		
		System.out.print("\n##--Viana Boots Ecommerce--##\n\n");
		System.out.print("|--------------------------------------------------|\n");
		System.out.print("| Nome: " + this.nome+"\n");
		System.out.print("| Id: " + this.id+"\n");
		System.out.print("| Tipo da bota: " +tipo+"\n");
		System.out.print("| Tamanho: " + this.tamanho+"\n");
		System.out.print("| Marca: " + this.marca+"\n");
		
		

	}

}
