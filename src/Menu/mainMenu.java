package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import produto.model.Botas;

public class mainMenu {

	public static void main(String[] args) {

		// Testando as classes

		// nome, tamanho, marca, id, tipo
		Botas b1 = new Botas("Yellow Boots", 42, "VianaBoots", 1, 1);
		b1.visu();

		int op;
		String nome;

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("\n##--Viana Boots Ecommerce--##\n\n");
			System.out.print("|-----------------------------|\n");
			System.out.print("| Opção 1 - Cadastrar Produto |\n");
			System.out.print("| Opção 2 - Listar Produtos   |\n");
			System.out.print("| Opção 3 - Deletar Produto   |\n");
			System.out.print("| Opção 4 - Atualizar Produto |\n");
			System.out.print("| Opção 5 - Sair              |\n");
			System.out.print("|-----------------------------|\n");
			System.out.print("Digite uma opção: ");

			try {
				op = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nInforme um número! ");
				sc.nextLine();
				op = 0;
			}

			if (op == 5) {
				System.out.println("\nAgradecemos a preferencia, Viana Boots");
				sc.close();
				System.exit(0);

			}

			switch (op) {
			case 1:
				System.out.println("\nDigite o nome do Produto: ");
				nome = sc.nextLine();
				break;
			case 2:
				System.out.println("\nProdutos da Lista: ");
				break;
			case 3:
				System.out.println("\nDigite o numero do produto que deseja deletar: ");
				break;
			case 4:
				System.out.println("\nDigite o numero do produto que deseja atualizar:  ");
				break;
			default:
				System.out.println("\nDigite um valor válido! ");
				break;

			}

		}

	}

}
