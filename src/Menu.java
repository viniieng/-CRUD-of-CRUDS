import Objects.Produto;
import Objects.Setores;
import Services.Create;
import Services.Delete;
import Services.Edit;
import Services.ListProducts;
import Services.ListSector;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static ArrayList<Setores> setoresList = new ArrayList<>();
    public static ArrayList<Produto> produtosList = new ArrayList<>();
    public static void menu() {
        Create create = new Create();
        Delete delete = new Delete();

        double capitalTotal = 0;

        int opcaoEscolhida;
        Scanner tec = new Scanner(System.in);

        while (true) {
            System.out.println("""
                ----------------------
                MENU
                Escolha uma opção:
                1- Cadastrar
                2- Listar produtos
                3- Listar Setores
                4- Editar
                5- Deletar
                6- Encerrar sistema
                ----------------------""");
            opcaoEscolhida = tec.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    capitalTotal = create.create(setoresList, produtosList, capitalTotal);
                    break;
                case 2:
                    ListProducts.listproducts(produtosList, capitalTotal);
                    break;
                case 3:
                    ListSector.listsector(setoresList);
                    break;
                case 4:
                    Edit.edit(setoresList, produtosList);
                    break;
                case 5:
                    capitalTotal = delete.delete(produtosList, capitalTotal);
                    break;
                case 6:
                    System.out.println("Encerrando o sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        }
    }
}


