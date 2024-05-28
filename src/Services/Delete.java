package Services;

import Objects.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class Delete {
    Scanner tec = new Scanner(System.in);

    public void delete(ArrayList<Produto> produtosList) {
        System.out.println("Digite o ID do produto:");
        int idInput = tec.nextInt();

        boolean idEncontrado = false;
        for (int i = 0; i < produtosList.size(); i++) {
            Produto produto = produtosList.get(i);

            if (produto.id == idInput) {
                idEncontrado = true;
                produtosList.remove(i);
                System.out.println("Produto " + produto.nome + " removido.");
                break;
            }
        }

        if (!idEncontrado) {
            System.out.println("ID não encontrado no sistema!! Nenhum produto encontrado com o ID: " + idInput);
        }
    }
}