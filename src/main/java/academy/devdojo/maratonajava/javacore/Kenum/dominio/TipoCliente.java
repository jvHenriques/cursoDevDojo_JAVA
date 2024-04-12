package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "pessoa física"),
    PESSOA_JURIDICA(1, "pessoa juridica");

    public final int VALOR;
    public final String NOME;


    TipoCliente(int valor, String nome) {
        this.VALOR = valor;
        this.NOME = nome;
    }
}
