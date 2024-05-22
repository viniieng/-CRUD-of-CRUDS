package Services;

import Objects.Produto;
import Utils.BuscarDados;

import java.util.ArrayList;
import java.util.Scanner;

public class Create {

   public void create(ArrayList<String> setoresList ) {

       Scanner tec = new Scanner(System.in);
       System.out.println("--- CADASTRAR ---");
       Produto produto = new Produto();
       System.out.println("Digite o nome do produto:");
       produto.nome = tec.nextLine();
       System.out.println("Digite o preço do produto:");
       produto.preco = tec.nextDouble();
       System.out.println("Digite o setor do produto:");
       String setor = tec.next();
       BuscarDados.buscarComDados(setor,setoresList);

   }
}
