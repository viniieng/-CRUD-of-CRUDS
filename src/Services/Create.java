package Services;

import Statics.GlobalArray;

import java.util.Scanner;

public class Create {
    String nomeCrud;
    GlobalArray globalArray = new GlobalArray();
    Scanner tec = new Scanner(System.in);

   public void create() {
       System.out.println("Digite o nome do CRUD:");
       tec.nextLine();
       nomeCrud = tec.next();

       boolean posicaoEncontrada = false;
       for (int i = 0; i < globalArray.idsCruds.size() && !posicaoEncontrada; i++) {
           if (globalArray.idsCruds.isEmpty()) {
               posicaoEncontrada = true;
               globalArray.idsCruds.add(i);
               System.out.println("Produto cadastrado no Sistema a posição dele é: " + i);
           }
       }
   }
}
