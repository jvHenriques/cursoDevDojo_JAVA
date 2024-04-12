package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {

    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));


    public static void main(String[] args) {
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("Green");
//            }
//        });

        List<Car> redCars = filter(cars, car -> car.getColor().equals("Red"));
        List<Car> greenCarsLambda = filter(cars, car -> car.getColor().equals("Green"));
        List<Car> carByDate = filter(cars, car -> car.getYear() < 2015);

        System.out.println(redCars);
        System.out.println(greenCarsLambda);
    }


//    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

}
