package Services;

import Objects.Produto;
import java.util.ArrayList;

public class ListProducts {

    public static void listproducts(ArrayList<Produto> produtosList) {
        System.out.println("--- PRODUTOS CADASTRADOS ---");
        System.out.println("----------------------------------------------------------");
        System.out.println(String.format("| %-20s | %-10s | %-10s | %-10s |", "Nome do Produto", "Preço", "Setor", "ID"));
        System.out.println("----------------------------------------------------------");
        for (Produto produto : produtosList) {
            System.out.println(String.format("| %-20s | R$%-9.2f | %-10s | %-10d", produto.nome, produto.preco, produto.setor, produto.id));
        }
        System.out.println("----------------------------------------------------------");
    }
}