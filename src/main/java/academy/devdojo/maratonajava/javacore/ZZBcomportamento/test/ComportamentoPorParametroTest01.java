package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));


    public static void main(String[] args) {
        System.out.println(listGreenCars(cars));
        System.out.println(listRedCars(cars));
        System.out.println(listCarsByColor(cars, "Green"));
        System.out.println(listCarsByColor(cars, "Red"));

        System.out.println("---------");

        System.out.println(filterByYearBefore(cars, 2015));
    }


    private static List<Car> listGreenCars(List<Car> cars) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Green")) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> listRedCars(List<Car> cars) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Green")) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> listCarsByColor(List<Car> cars, String color) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> oldCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                oldCar.add(car);
            }
        }
        return oldCar;
    }

}
