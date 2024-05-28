package Services;

import Objects.Produto;
import java.util.ArrayList;

public class ListProducts {

    public static void listproducts(ArrayList<Produto> produtosList) {
        System.out.println("--- PRODUTOS CADASTRADOS ---");
        System.out.println("----------------------------------------------------------");
        System.out.println(" Nome do Produto  ||    Preço     ||    Setor    ||    ID");
        System.out.println("----------------------------------------------------------");
        for (Produto produto : produtosList) {
            System.out.println("      " + produto.nome + "           R$" + produto.preco + "           " + produto.setor + "           " + produto.id);
        }
    }
}
