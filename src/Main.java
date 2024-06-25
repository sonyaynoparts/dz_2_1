public class Main {
    public static void main(String[] args) {
        double price = 5099.99;
        int rubles = 20;
        int bonus = (int) (price / rubles);
        System.out.println("Начисленные мили:" + bonus);
    }
}
