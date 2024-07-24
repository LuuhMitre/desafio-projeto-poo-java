package Interface;

public class InterfaceIphone extends FuncoesIphone {
    public static void main(String[] args) {
        InterfaceIphone iphone = new InterfaceIphone();

        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();
        
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();

        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
        
    }
}
