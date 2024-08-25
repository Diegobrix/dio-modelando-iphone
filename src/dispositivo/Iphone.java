package dispositivo;

import apps.telefone.AparelhoTelefonico;
import apps.navegador.NavegadorInternet;
import apps.reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet
{
    @Override
    public void ligar(String numeroTelefone)
    {
        System.out.println("Ligando para " + numeroTelefone);
    }

    @Override
    public void atender()
    {
        System.out.println("Atendendo o telefone");
    }

    @Override
    public void iniciarCorreioVoz()
    {
        System.out.println("Correio de voz iniciado!");
    }

    @Override
    public void tocar(String musica)
    {
        System.out.println("Tocando " + musica);
    }

    @Override
    public void pausar()
    {
        System.out.println("Música pausada!");
    }

    @Override
    public void selecionarMusica(String musica)
    {

        System.out.println("Música selecionada " + musica);
    }

    @Override
    public void exibirPagina(String url)
    {
        System.out.println("Exibindo a página " + url);
    }

    @Override
    public void adicionarNovaAba(String url)
    {
        System.out.println("Nova aba adicionada - aba: " + url);
    }

    @Override
    public void atualizarPagina(String url)
    {
        System.out.println("Página " + url + " atualizada!");
    }
}