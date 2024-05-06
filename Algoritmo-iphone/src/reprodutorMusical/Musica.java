package reprodutorMusical;

public class Musica implements ReprodutorMusical{

    @Override
    public void tocar(){
        System.out.println("TOCANDO MUSICA");
    };

    @Override
    public void pausar(){
        System.out.println("PAUSANDO MUSICA");
    }

    @Override
    public void selecionarMusica(){
        System.out.println("SELECIONAR MUSICA");
    }

}
