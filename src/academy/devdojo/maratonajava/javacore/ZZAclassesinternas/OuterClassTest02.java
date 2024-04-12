package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class OuterClassTest02 {
    private String nome = "Midorya";
    public void print(final String parametro){
        String lastName = "Izuku";

        class LocalClass{
            public void printLocal(){
                System.out.println(parametro); // não pode ser alterado | é final por padrão
                System.out.println(nome +" " + lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassTest02 outerClassTest02 = new OuterClassTest02();
        outerClassTest02.print("p");

    }
}
