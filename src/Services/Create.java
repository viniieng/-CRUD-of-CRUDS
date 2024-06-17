package Services;

import java.util.HashSet;
import java.util.Random;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import Objects.Produto;
import Objects.Setores;
import Utils.BuscarDados;

public class Create {
    private static Set<Integer> idsGerados = new HashSet<>();
    int opcaoEscolhida;
    Scanner tec = new Scanner(System.in);

    public void create(ArrayList<Setores> setoresList, ArrayList<Produto> produtosList) {
        System.out.println("""
                ----------------------
                MENU
                Escolha uma opção:
                1- Cadastrar Produto
                2- Cadastrar Setor
                               
                ----------------------""");
        opcaoEscolhida = tec.nextInt();

        switch (opcaoEscolhida) {
            case 1:
                System.out.println("--- CADASTRAR PRODUTO ---");
                try {
                    tec.nextLine();

                    System.out.println("Digite o nome do produto:");
                    String nomeProduto = tec.nextLine();

                    boolean produtoExistente = false;
                    for (Produto product : produtosList) {
                        if (product.nome.equalsIgnoreCase(nomeProduto)) {
                            produtoExistente = true;
                            product.quantidade++;
                            System.out.println("Produto " + product.nome + " existente no sistema, adicionado 1 à quantidade... Quantidade em estoque: " + product.quantidade);
                            break;
                        }
                    }

                    if (!produtoExistente) {
                        Produto novoProduto = new Produto();
                        novoProduto.nome = nomeProduto;

                        System.out.println("Digite o preço do produto:");
                        novoProduto.preco = tec.nextDouble();
                        tec.nextLine();

                        System.out.println("Digite a quantidade em estoque do produto: ");
                        novoProduto.quantidade = tec.nextInt();
                        tec.nextLine();

                        System.out.println("Digite o setor do produto:");
                        String setor = tec.nextLine();

                        if (BuscarDados.buscarComDados(setor, setoresList, novoProduto)) {
                            novoProduto.setor = setor;
                        } else {
                            Setores newSetor = new Setores();
                            newSetor.nome = setor;
                            setoresList.add(newSetor);
                            novoProduto.setor = setor;
                        }



                        novoProduto.id = gerarIdUnico();
                        produtosList.add(novoProduto);
                        System.out.println("Produto cadastrado no sistema. ID dele é: " + novoProduto.id);
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Certifique-se de inserir um preço válido.");
                    tec.nextLine();
                }
                break;
            case 2:
                System.out.println("--- CADASTRAR SETOR ---");
                tec.nextLine();
                System.out.println("Digite o nome do setor:");
                String nomeSetor = tec.nextLine();
                Setores setor = new Setores();
                setor.nome = nomeSetor;
                setoresList.add(setor);
                System.out.println("Setor cadastrado no sistema.");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha novamente.");
                break;
        }
    }

    public static int gerarIdUnico() {
        int id;
        Random random = new Random();
        do {
            id = 100000 + random.nextInt(900000);
        } while (idsGerados.contains(id));
        idsGerados.add(id);
        return id;
    }
}