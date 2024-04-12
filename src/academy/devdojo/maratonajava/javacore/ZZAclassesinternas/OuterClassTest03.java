package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class OuterClassTest03 {

    private String name = "William";

    static class Nested {
        private String lastName = "Suane";
        void print() {
            System.out.println(new OuterClassTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
