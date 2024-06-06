package Services;

import Objects.Produto;
import Objects.Setores;

import java.util.ArrayList;
import java.util.Scanner;

public class Edit {
    public static void edit(ArrayList<Setores> setoresList, ArrayList<Produto> produtosList) {
        Scanner tec = new Scanner(System.in);
        int opcaoEscolhida;

        System.out.println("""
                ----------------------
                MENU
                Escolha uma opção:
                1- Editar Produto
                2- Editar Setor
                           
                ----------------------""");
        opcaoEscolhida = tec.nextInt();

        switch (opcaoEscolhida) {
            case 1:
                System.out.println("--- EDITAR PRODUTO ---");
                System.out.println("Digite o ID do produto que deseja editar: ");
                int idInput = tec.nextInt();

                boolean idEncontrado = false;
                for (int i = 0; i < produtosList.size(); i++) {
                    Produto produto = produtosList.get(i);
                    if (produto.id == idInput) {
                        idEncontrado = true;


                        System.out.println("O que deseja editar: " +
                                " 1 - Nome " +
                                " 2 - Preço " +
                                " 3 - Setor ");
                        int editar = tec.nextInt();

                        switch (editar) {
                            case 1:
                                System.out.println("Digite o novo Nome do Produto");
                                tec.nextLine();
                                produto.nome = tec.nextLine();

                                System.out.println("Nome do produto editado!");
                                break;
                            case 2:
                                System.out.println("Digite o novo Preço do Produto");
                                tec.nextDouble();
                                produto.preco = tec.nextDouble();

                                System.out.println("Preço do produto editado!");
                                break;
                            case 3:
                                for (Setores setores : setoresList) {
                                    if (setores.nome.equals(produto.setor))
                                        setores.produtos.remove(produto);
                                }
                                System.out.println("Digite o novo Setor do Produto");
                                tec.nextLine();
                                String novoSetor = tec.nextLine();
                                boolean setorEncontrado = false;
                                for (Setores setores : setoresList) {
                                    if (setores.nome.equals(novoSetor)) {
                                        setorEncontrado = true;
                                        setores.produtos.add(produto);
                                        produto.setor = novoSetor;
                                        System.out.println("Setor do produto editado!");
                                    }
                                }
                                if(!setorEncontrado) {
                                System.out.println("Setor não existe!");
                            }
                                break;

                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    }
                }
                break;
            case 2:
                System.out.println(" ----- AQUI ESTÁ A LISTA DE SETORES -----");
                for (Setores setores : setoresList) {
                    System.out.println("-" + setores.nome);
                }
                System.out.println("Digite o setor que deseja editar");
                tec.nextLine();
                String nomeDigitado = tec.nextLine();
                boolean nomeEncontrado = false;
                for (Setores setor : setoresList) {
                    if (setor.nome.equals(nomeDigitado)) {
                        nomeEncontrado = true;
                        System.out.println("Digite o novo nome do setor");
                        setor.nome = tec.nextLine();
                        System.out.println("Nome do setor atualizado");
                    }
                }
                if(!nomeEncontrado) {
                    System.out.println("Setor não existe");
                }
                break;
        }
    }
}
