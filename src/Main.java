import dispositivo.Iphone;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Iphone iPhone = new Iphone();

        //Funções Telefone
        System.out.print("Digite o número que deseja ligar: ");
        String numeroTelefone = scanner.next();

        iPhone.ligar(numeroTelefone);
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        //Funções Reprodutor Musical
        System.out.print("Digite a música que deseja ouvir: ");
        String musica = scanner.next();

        iPhone.selecionarMusica(musica);
        iPhone.tocar(musica);
        iPhone.pausar();

        //Funções Navegador
        System.out.print("Digite a url da página que deseja: ");
        String url = scanner.next();
        scanner.close();

        iPhone.exibirPagina(url);
        iPhone.adicionarNovaAba(url);
        iPhone.atualizarPagina(url);
    }
}