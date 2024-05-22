package Utils;

import java.util.ArrayList;

public class BuscarDados {
    public static boolean buscarComDados(String setor, ArrayList<String> setoresList) {
        System.out.println("--- BUSCANDO SETOR ---");
        boolean encontrado = false;

        for (String lista : setoresList) {
            if (lista.equals(setor)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Produto adicionado ao setor " + setor);
        } else {
            System.out.println("O setor " + setor + " não foi encontrado na lista!");
        }
        return encontrado;
    }
}
