package apps.navegador;

public interface NavegadorInternet
{
    void exibirPagina(String url);

    void adicionarNovaAba(String url);

    void atualizarPagina(String url);
}