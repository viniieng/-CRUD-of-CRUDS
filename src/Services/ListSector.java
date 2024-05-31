package Services;

import Objects.Setores;
import Objects.Produto;
import java.util.ArrayList;

public class ListSector {

    public static void listsector(ArrayList<Setores > setoresList) {
        System.out.println("--- SETORES CADASTRADOS ---");
        for (Setores setores : setoresList) {
            System.out.println("----------------------------------------------------------");
            System.out.println("--- NOME DO SETOR ---");
            System.out.println("                                               ");
            System.out.println(" -" + setores.nome);
            System.out.println("--- LISTA DE PRODUTOS DESTE SETOR ---");
            System.out.println("----------------------------------------------------------");
            for (Produto produto : setores.produtos) {
                System.out.println("- " + produto.nome +  " || " + produto.preco + " || " + produto.id);
            }
        }
    }
}