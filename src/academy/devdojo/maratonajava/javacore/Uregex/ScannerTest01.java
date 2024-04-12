package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String anime = "Levi,Eren,Mikassa,true,200";
        Scanner scanner = new Scanner(anime);
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("int "+i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean " + b);
            }else {
                System.out.println(scanner.next());
            }
        }
    }
}
