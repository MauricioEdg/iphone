package aparelho;

import aparelhoTelefonico.Telefone;
import navegadorInternet.Internet;
import reprodutorMusical.Musica;

public class Iphone{
    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        Internet internet = new Internet();
        Musica musica = new Musica();

        System.out.println();
        System.out.println("Aparelho telefonico");
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();
        System.out.println("\n");

        System.out.println("Navegador na internet");
        internet.exibirPgaina();
        internet.adicionarNovaAba();
        internet.atualizarPagina();
        System.out.println("\n");


        System.out.println("Reprodutor musical");
        musica.tocar();
        musica.pausar();
        musica.selecionarMusica();
    }
    
   
}
