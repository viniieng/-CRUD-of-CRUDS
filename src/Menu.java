import java.util.Scanner;

public class Menu {
    public static void menu() {
        int opcaoEscolhida;
        Scanner tec = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------");
            System.out.println("MENU");
            System.out.println("Escolha uma opção: " +
                    "\n1- Cadastrar" +
                    "\n2- Entrar" +
                    "\n3- Listar" +
                    "\n4- Editar" +
                    "\n5- Deletar" +
                    "\n6- Encerrar sistema");
            System.out.println("----------------------");
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


