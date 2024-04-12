package academy.devdojo.maratonajava.javacore.Zgenerics.test;
abstract class Animal{
    public abstract void consultando();
}
class Cachorro extends Animal{
    @Override
    public void consultando() {
        System.out.println("Consultando Doguinho");
    }
}
class Gato extends Animal{
    @Override
    public void consultando() {
        System.out.println("consultando gatinho");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatoes = {new Gato(), new Gato()};

        printConsulta(cachorros);
        printConsulta(gatoes);

    }

    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consultando();
        }

    }
}

