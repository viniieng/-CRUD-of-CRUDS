import java.util.Scanner;

public class Menu {
    private Menu() {}
    public static void menu() {
        int opcaoEscolhida;
        Scanner tec = new Scanner(System.in);

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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Encerrando o sistema...");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        }
    }
}


