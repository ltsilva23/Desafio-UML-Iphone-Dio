package iphone;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        System.out.println("Reprodutor Musical\n");
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();
        
       System.out.println("\nAparelho telefônico\n");
        meuIphone.ligar("555-1234");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
       System.out.println("\nNavegador de internet\n");
        meuIphone.exibirPagina("www.google.comm");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
