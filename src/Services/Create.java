package Services;

import Objects.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Create {
    Scanner tec = new Scanner(System.in);

   public void create(ArrayList<String> setoresList ) {
       System.out.println("--- CADASTRAR ---");
       Produto produto = new Produto();
       System.out.println("Digite o nome do produto:");
       tec.nextLine();
       produto.nome = tec.nextLine();
       System.out.println("Digite o preço do produto:");
       tec.nextDouble();
       produto.preco = tec.nextDouble();
       System.out.println("Digite o setor do produto:");
       String setor = tec.nextLine();
       if (setoresList.contains(setor)) {
           System.out.println("O setor " + setor + " está presente na lista.");
       } else {
           System.out.println("O setor " + setor + " não está presente na lista.");
       }

   }
}
