package botas.repository;

import produto.model.Botas;

public interface BotasRepository {

	public void procurarPorId(int id);

	public void listarBotas();

	public void cadastrar(Botas botas);

	public void atualizar(Botas botas);
	
	public void deletar(int id);
	
	
	// Métodos Especiais
	public void couro(int couro);
	
	public void brinde(int brinde);

}
