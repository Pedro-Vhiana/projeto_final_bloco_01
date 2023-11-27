package botas.repository;

import produto.model.Botas;

public interface BotasRepository {

	public void procurarPorid(int id);

	public void listarTodas();

	public void cadastrar(Botas botas);

	public void atualizar(Botas botas);
	
	public void deletar(String id);

}
