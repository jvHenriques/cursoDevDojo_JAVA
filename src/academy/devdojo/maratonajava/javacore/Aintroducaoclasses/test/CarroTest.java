package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
//https://app.santanderopenacademy.com/pt/program/santander-bootcamp-2024

        carro1.ano = 2012;
        carro1.nome = "unoespecial";
        carro1.modelo = "chevrolet";

        carro2.nome = "Fusca bala";
        carro2.modelo = "Sport";
        carro2.ano = 1996;



        System.out.println("Ano do carro: " + carro1.ano +   "\nmodelo do carro: "
                                 +carro1.modelo + "\nnome do carro: " +carro1.nome);

        System.out.println("\nAno do carro: " + carro2.ano +   "\nmodelo do carro: "
                +carro2.modelo + "\nnome do carro: " +carro2.nome);

    }
}
