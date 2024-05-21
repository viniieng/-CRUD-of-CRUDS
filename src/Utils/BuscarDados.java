package Utils;

public class BuscarDados {
    public static Pessoa buscarComDados(int idPessoa){
        System.out.println("--- BUSCAR ---");
        if(idPessoa <= 0 || idPessoa > pessoas.size()){
            System.out.println("Cadastro não encontrado!");
            return null;
        }
}
