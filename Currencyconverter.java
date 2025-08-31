import java.util.HashMap;
import java.util.Scanner;
public class Currencyconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> rates = new HashMap<>();
        rates.put("USD", 83.0);
        rates.put("EUR", 90.0);
        rates.put("INR", 1.0);
        rates.put("JPY", 0.56);
        rates.put("GBP", 105.0);
        System.out.println(" Welcome to the Currency Converter");
        System.out.print("Enter base currency (USD, EUR, INR, JPY, GBP): ");
        String base = scanner.next().toUpperCase();
        System.out.print("Enter target currency (USD, EUR, INR, JPY, GBP): ");
        String target = scanner.next().toUpperCase();
        if (!rates.containsKey(base) || !rates.containsKey(target)) {
            System.out.println(" Unsupported currency entered.");
            return;
        }
        System.out.print("Enter amount in " + base + ": ");
        double amount = scanner.nextDouble();
        double inINR = amount * rates.get(base);
        double converted = inINR / rates.get(target);
        System.out.printf(" %.2f %s = %.2f %s\n", amount, base, converted, target);
        scanner.close();
    }
}