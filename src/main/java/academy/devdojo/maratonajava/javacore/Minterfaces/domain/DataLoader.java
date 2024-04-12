package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    public static final int DATA_MAX_VALUE = 10;
    void load();
    default void checkPermision(){
        System.out.println("Fazendo checagem de permissões ");
    }

    public static void retrievaMaxDataSiza(){
        System.out.println("dentro do retrievaMaxDataSiza na interface");
    }
}
