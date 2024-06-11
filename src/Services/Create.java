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
                Produto produto = new Produto();
                try {
                    System.out.println("Digite o nome do produto:");
                    tec.nextLine();
                    String nomeProduto = tec.nextLine();

                    boolean produtoExistente = false;
                    for (Produto product : produtosList) {
                        if (product.nome.equals(nomeProduto)) {
                            produtoExistente = true;
                            break;
                        }
                    }

                    if (produtoExistente) {
                        System.out.println("Erro: Produto já existe na lista.");
                    } else {
                        produto.nome = nomeProduto;

                        System.out.println("Digite o preço do produto:");
                        produto.preco = tec.nextDouble();
                        tec.nextLine();

                        System.out.println("Digite o setor do produto:");
                        String setor = tec.nextLine();

                        if (BuscarDados.buscarComDados(setor, setoresList, produto)) {
                            produto.setor = setor;
                            produto.id = gerarIdUnico();
                            produtosList.add(produto);
                            System.out.println("Produto cadastrado no Sistema o ID dele é: " + produto.id);
                        } else {
                            Setores newSetor = new Setores();
                            newSetor.nome = setor;
                            produto.setor = setor;
                            produto.id = gerarIdUnico();
                            produtosList.add(produto);
                            newSetor.produtos.add(produto);
                            setoresList.add(newSetor);
                            System.out.println("Setor " + setor + " criado no Sistema!!");
                            System.out.println("Produto cadastrado no Sistema o ID dele é: " + produto.id);
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Certifique-se de inserir um preço válido.");
                    tec.nextLine();
                }
                break;
            case 2:
                System.out.println("--- CADASTRAR SETOR ---");
                Setores setores = new Setores();
                System.out.println("Digite o nome do setor:");
                tec.nextLine();
                setores.nome = tec.nextLine();
                setoresList.add(setores);
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