package botas.controller;

import java.util.ArrayList;

import botas.repository.BotasRepository;
import produto.model.Botas;

public class BotasController implements BotasRepository {

	private ArrayList<Botas> listaBotas = new ArrayList<Botas>();
	int id = 0;

	@Override
	public void procurarPorId(int id) {
		var botas = buscarNaCollection(id);

		if (botas != null) {
			botas.visu();

		} else {
			System.out.println("\nA bota de Id: " + id + " não foi encontrada!");
		}

	}

	@Override
	public void listarBotas() {
		for (var botas : listaBotas) {
			botas.visu();
		}

	}

	@Override
	public void cadastrar(Botas botas) {
		listaBotas.add(botas);
		System.out.println("\nA bota de id " + botas.getId() + " foi adicionada com sucesso!");

	}

	@Override
	public void atualizar(Botas botas) {
		var buscaBota = buscarNaCollection(botas.getId());

		if (buscaBota != null) {
			listaBotas.set(listaBotas.indexOf(buscaBota), botas);
			System.out.println("\nA Bota de Id: " + botas.getId() + " foi atualizada com sucesso");

		} else
			System.out.println("\nA Bota de Id: " + botas.getId() + " não foi encontrada");

	}

	@Override
	public void deletar(int id) {
		var botas = buscarNaCollection(id);

		if (botas != null) {
			if (listaBotas.remove(botas) == true)
				System.out.println("\nA Bota de Id: " + id + " foi deletada com sucesso");
		} else
			System.out.println("\nA Bota de Id: " + id + " não foi encontrada");

	}

	public Botas buscarNaCollection(int id) {
		for (var botas : listaBotas) {
			if (botas.getId() == id) {
				return botas;
			}
		}

		return null;
	}

	public int gerarId() {
		return ++id;
	}

	@Override
	public void couro(int couro) {

	}

	@Override
	public void brinde(int brinde) {

	}

}
