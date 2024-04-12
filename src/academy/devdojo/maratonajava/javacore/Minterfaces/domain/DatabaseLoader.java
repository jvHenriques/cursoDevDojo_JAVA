package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemove{
    @Override
    public void load() {
        System.out.println("carregando dados de um banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("deletando dados de um banco de dados");
    }

    @Override
    public void checkPermision() {
        System.out.println("checando permissão no banco de dados");
    }

    public static void retrievaMaxDataSiza(){
        System.out.println("dentro do retrievaMaxDataSiza na classe DatabaseLoader");
    }


}
