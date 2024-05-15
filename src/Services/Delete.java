package Services;

import java.util.Scanner;

public class Delete {
    int arrayIds = Statics.GlobalArray.array[10];
    int deleteCrud;

    Scanner tec = new Scanner(System.in);

    public void delete(){
        System.out.println("Digite o ID do CRUD:");
        deleteCrud = new tec.nextInt;
        boolean crudEncontrado = false;
        for (int i = 0; i < arrayIds.length; i++){
            if (arrayIds[i] == deleteCrud){
                crudEncontrado = true;
                System.out.printf("CRUD encontrado! CRUD removido");
                arrayIds[i] = null;
                break;
            }

        }

    }

}