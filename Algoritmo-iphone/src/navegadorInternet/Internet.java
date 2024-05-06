package navegadorInternet;

public class Internet implements NavegadorInternet {

    @Override
    public void exibirPgaina(){
        System.out.println("EXIBINDO PAGINA DA INTERNET");
    }
     @Override
     public void adicionarNovaAba(){
        System.out.println("ADICIOANDO UMA NOVA ABA");
     }
     @Override
     public void atualizarPagina(){
        System.out.println("ATUALIZANDO A PAGINA");
     }
}
