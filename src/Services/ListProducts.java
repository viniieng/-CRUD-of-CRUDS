package Services;

import Objects.Produto;
import java.util.ArrayList;

public class ListProducts {

    public static void listproducts(ArrayList<Produto> produtosList, double capitalTotal) {
        System.out.println("--- PRODUTOS CADASTRADOS ---");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(String.format("| %-20s | %-10s | %-10s | %-10s | %-10s | %-10s |", "Nome do Produto", "Preço", "Setor", "ID", "Quantidade", "Total"));
        System.out.println("----------------------------------------------------------------------------------------");
        for (Produto produto : produtosList) {
            System.out.println(String.format("| %-20s | R$%-9.2f | %-10s | %-10d | %-10d | R$%-9.2f |",
                    produto.nome,
                    produto.preco,
                    produto.setor,
                    produto.id,
                    produto.quantidade,
                    produto.capital
            ));
        }
        System.out.println("VALOR TOTAL EM PRODUTOS: R$" + capitalTotal);
        System.out.println("----------------------------------------------------------");
    }
}