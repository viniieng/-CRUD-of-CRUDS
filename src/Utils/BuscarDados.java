package Utils;

import Objects.Setores;
import Objects.Produto;

import java.util.ArrayList;

public class BuscarDados {
    public static boolean buscarComDados(String setorDigitado, ArrayList<Setores> setoresList,Produto produto) {
        System.out.println("--- BUSCANDO SETOR ---");
        boolean encontrado = false;

        for (Setores setor : setoresList) {
            if (setor.nome.equals(setorDigitado)) {
                encontrado = true;
                setor.produtos.add(produto);

            }
        }
        if (encontrado) {
            System.out.println("Produto adicionado ao setor " + setorDigitado);
        }
        return encontrado;
    }
}
