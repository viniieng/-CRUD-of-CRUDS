package Services;
import java.util.HashSet;
import java.util.Random;
import Objects.Produto;
import Utils.BuscarDados;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Create {
    private static Set<Integer> idsGerados = new HashSet<>();

    public void create(ArrayList<String> setoresList, ArrayList<Produto> produtosList) {

        Scanner tec = new Scanner(System.in);
        System.out.println("--- CADASTRAR ---");
        Produto produto = new Produto();
        System.out.println("Digite o nome do produto:");
        produto.nome = tec.nextLine();
        System.out.println("Digite o preço do produto:");
        produto.preco = tec.nextDouble();
        System.out.println("Digite o setor do produto:");
        String setor = tec.next();
        BuscarDados.buscarComDados(setor, setoresList);
        produto.id = gerarIdUnico();
        produtosList.add(produto);
        System.out.println("Produto cadastrado no Sistema o ID dele é: " + produto.id);
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
