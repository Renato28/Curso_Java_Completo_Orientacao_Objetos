package execiciofixacao.entities;

public class CurrencyConverter {

    private static double IOF = 0.06;

    public static double converter(double dollarPrice, double amount) {
        return amount * dollarPrice * (1.0 + IOF);
    }
}
