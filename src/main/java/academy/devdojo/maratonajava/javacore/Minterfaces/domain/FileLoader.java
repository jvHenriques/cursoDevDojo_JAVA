package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemove{
    @Override
    public void load() {
        System.out.println("carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("deletando dados de um arquivo");
    }

    @Override
    public void checkPermision() {
        System.out.println("checando permissão no arquivo");
    }
}
