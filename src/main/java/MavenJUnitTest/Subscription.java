package MavenJUnitTest;


import java.util.function.BiFunction;

public class Subscription {

    private int price; // subscription total price in euro-cent
    private int length; // length of subscription in months

    public Subscription() {

    }
    // constructor :
    public Subscription(int p, int n) {
        price = p ;
        length = n ;
    }

    /**
     * Calculate the monthly subscription price in euro,
     * rounded up to the nearest cent.
     */
    public double pricePerMonth() {
        double r = (double) price / (double) length ;
        BiFunction<Integer, Integer, Double> f = (x,y) -> (double) x / (double) y;
        return f.apply(price, length);
    }

    /**
     * Call this to cancel/nulify this subscription.
     */
    public void cancel() { length = 0 ; }

}