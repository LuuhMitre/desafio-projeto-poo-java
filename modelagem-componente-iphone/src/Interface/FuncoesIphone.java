package Interface;

import Apps.AparelhoTelefonico;
import Apps.NavegadorInternet;
import Apps.ReprodutorMusical;

public class FuncoesIphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    // Aparelho Telefonico

    public void ligar() {
        System.out.println("Realizando uma ligação");
    }

    public void atender() {
        System.out.println("Atendendo uma ligação"); 
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando um correio de voz");
    }


    // Navegador de Internet

    public void exibirPagina() {
        System.out.println("Acessando site");
    }

    public void adicionarNovaAba() {
        System.out.println("Abrindo uma nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
    

    // Reprodutor Musical

    public void tocar() {
        System.out.println("Tocando musica");
    }
    public void pausar() {
        System.out.println("Pausando musica");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando a musica");
    }    
}
