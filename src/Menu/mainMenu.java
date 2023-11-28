package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import botas.controller.BotasController;
import produto.model.BotasCouro;
import produto.model.BotasCouroSintetico;

public class mainMenu {

	public static void main(String[] args) {

		BotasController bota = new BotasController();

		int op, tipo, id, tamanho, brinde, couro;
		String nome, marca;

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("		  VIANA BOOTS				       	         ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Bota                       ");
			System.out.println("            2 - Listar todas as Botas                ");
			System.out.println("            3 - Buscar Bota por Id                   ");
			System.out.println("            4 - Atualizar Dados do Produto           ");
			System.out.println("            5 - Deletar Produto                      ");
			System.out.println("            6 - Sair		                         ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");

			try {
				op = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nInforme um número! ");
				sc.nextLine();
				op = 0;
			}

			if (op == 6) {
				System.out.println("\nAgradecemos a preferencia, Viana Boots");
				sc.close();
				System.exit(0);

			}

			switch (op) {
			case 1:
				System.out.println("\nCadastrar Bota \n\n");

				System.out.print("Informe o nome da bota: ");
				sc.skip("\\R?");
				nome = sc.nextLine();
				System.out.print("Informe a marca da bota: ");
				sc.skip("\\R?");
				marca = sc.nextLine();

				System.out.print("Informe o tamanho da bota: ");
				tamanho = sc.nextInt();

				do {
					System.out.println("Informe o tipo da bota 1-Couro ou 2-Couro Sintético");
					tipo = sc.nextInt();

				} while (tipo < 1 && tipo > 2);

				switch (tipo) {
				case 1:
					System.out.println("Escolha um tipo de couro:  \n1- Couro Envelhecido | 2- Couro Defumado  ");
					couro = sc.nextInt();
					bota.cadastrar(new BotasCouro(bota.gerarId(), nome, tamanho, marca, tipo, couro));
					break;
				case 2:
					System.out.println("Escolha de brinde: \n1- Meia | 2- Adesivo | 3- Esponja ( Para higiene ) ");
					brinde = sc.nextInt();
					bota.cadastrar(new BotasCouroSintetico(bota.gerarId(), nome, tamanho, marca, tipo, brinde));
					break;
				default:
					System.out.println("Tipo de Bota Inválida... \nInsira um número informado.");
					op = 1;
					break;

				}

				break;
			case 2:
				System.out.println("\nListar Produtos: \n\n");
				bota.listarBotas();
				break;
			case 3:
				System.out.println("\nProcurar Produto por Id Cadastrado: \n\n");

				System.out.print("Informe o Id da Bota: ");
				id = sc.nextInt();

				bota.procurarPorId(id);

				break;
			case 4:
				System.out.println("\nAtualizar Produto:  \n\n");

				System.out.print("Digite o Id da bota: ");
				id = sc.nextInt();

				var buscaBota = bota.buscarNaCollection(id);

				if (buscaBota != null) {

					tipo = buscaBota.getTipo();

					System.out.print("\nInforme o nome da Bota: ");
					nome = sc.next();
					System.out.print("\nInforme a marca da Bota: ");
					marca = sc.next();
					System.out.print("\nInforme o tamanho da Bota: ");
					tamanho = sc.nextInt();

					switch (tipo) {
					case 1:
						System.out.println("Escolha um tipo de couro:  \n1- Couro Envelhecido | 2- Couro Defumado  ");
						couro = sc.nextInt();
						bota.cadastrar(new BotasCouro(bota.gerarId(), nome, tamanho, marca, tipo, couro));
						break;
					case 2:
						System.out.println("Escolha de brinde: \n1- Meia | 2- Adesivo | 3- Esponja ( Para higiene ) ");
						brinde = sc.nextInt();
						bota.cadastrar(new BotasCouroSintetico(bota.gerarId(), nome, tamanho, marca, tipo, brinde));
						break;
					default:
						System.out.println("Tipo de Bota Inválida... \nInsira um número informado.");
						op = 1;
						break;
					}

				}

				break;
				
			case 5:
				System.out.println("\nDeletar Produto");
				
				System.out.print("Digite o Id do Produto: ");
				id = sc.nextInt();
				
				bota.deletar(id);
				
				break;
			default:
				System.out.println("\nDigite um valor válido! \n\n");
				break;

			}

		}

	}

}
