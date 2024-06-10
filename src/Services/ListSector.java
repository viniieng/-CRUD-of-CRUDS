package Services;

import Objects.Setores;
import Objects.Produto;
import java.util.ArrayList;

public class ListSector {

    public static void listsector(ArrayList<Setores> setoresList) {
        System.out.println("--- SETORES CADASTRADOS ---");
        for (Setores setor : setoresList) {
            System.out.println("----------------------------------------------------------");
            System.out.println("NOME DO SETOR: " + setor.nome);
            System.out.println("----------------------------------------------------------");
            if (setor.produtos.isEmpty()) {
                System.out.println("Nenhum produto cadastrado neste setor.");
            } else {
                System.out.println("LISTA DE PRODUTOS DESTE SETOR:");
                System.out.println(String.format("| %-20s | %-10s | %-10s |", "Nome do Produto", "Preço", "ID"));
                System.out.println("----------------------------------------------------------");
                for (Produto produto : setor.produtos) {
                    System.out.println(String.format("| %-20s | R$%-9.2f | %-10d |", produto.nome, produto.preco, produto.id));
                }
            }
        }
    }
}
