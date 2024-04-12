package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("meercedes", 275);
        Carro carro3 = new Carro("Audi", 290);
        carro1.imprime();
        System.out.println(" ");
        carro2.imprime();
        System.out.println(" ");
        carro3.imprime();


    }
}
