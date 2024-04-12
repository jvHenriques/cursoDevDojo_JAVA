package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.domain;

// storeName:price:DiscountCode
public final class Quote {
    private final String store;
    private final double price;
    private final Discount.Code discountCode;

    public Quote(String storeName, double price, Discount.Code discountCode) {
        this.store = storeName;
        this.price = price;
        this.discountCode = discountCode;
    }
/*
* create new Quotes object from the value following the pattern storeName:price:DiscountCode
*@param value containing storeName:price:DiscountCode
* @return new Quote with values from @param value
 */
    public static Quote newQuote(String value){
        String[] values = value.split(":");
        return new Quote(values[0], Double.parseDouble(values[1]), Discount.Code.valueOf(values[2]));
    }

    @Override
    public String toString() {
        return "Quote{" +
                "store='" + store + '\'' +
                ", price=" + price +
                ", discountCode=" + discountCode +
                '}';
    }

    public String getStore() {
        return store;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDiscountCode() {
        return discountCode;
    }
}
