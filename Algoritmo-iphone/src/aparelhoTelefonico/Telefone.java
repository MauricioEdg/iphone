package aparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

    @Override
    public void ligar(){
        System.out.println("LIGANDO PELO TELEFONE");
    }
    @Override
    public void atender(){
        System.out.println("ATENDENDO PELO TELEFONE");
    }
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("ATENDENDO PELO TELEFONE");
    }
}
