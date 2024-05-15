package Services;

import java.util.Scanner;

public class Create {
    int arrayIds = Statics.GlobalArray.array[10];
    String nomeCrud;

    Scanner tec = new Scanner(System.in);

   public void create(){
        System.out.println("Digite o nome do CRUD:");
       tec.nextLine();
       nomeCrud = tec.next();

    }

}
