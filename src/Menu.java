import Services.Create;
import Services.Delete;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static ArrayList<String> setoresList = new ArrayList<>();
    public static ArrayList<Integer> produtosList = new ArrayList<>();
    public static void menu() {
        Create create = new Create();
        Delete delete = new Delete();
        int opcaoEscolhida;
        Scanner tec = new Scanner(System.in);
setoresList.add("weg");
        while (true) {
            System.out.println("""
                ----------------------
                MENU
                Escolha uma opção:
                1- Cadastrar
                2- Entrar
                3- Listar
                4- Editar
                5- Deletar
                6- Encerrar sistema
                ----------------------""");
            opcaoEscolhida = tec.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                   create.create(setoresList);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                 //   delete.delete();
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


