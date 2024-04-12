package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case EUA:
                return new UsDollar();
            case BRASIL:
                return new Real();
            default: throw new IllegalArgumentException("No currency found for this country");
        }
    }
}
