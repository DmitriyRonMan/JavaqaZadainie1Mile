public class Main {
    public static void main(String[] args) {
        float ticket = 15_678.75F;
        int priceMile = 20;
        int amountMile = (int) ticket / priceMile;

        System.out.println("Колиечство миль: " + amountMile);
    }
}