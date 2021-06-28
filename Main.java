public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long creditPaymentOne = service.calculate(1_000_000, 12, 9.99);
        System.out.println("При сроке кредита 1 год Ваш ежемесячный платеж составит " + creditPaymentOne + " руб.");
        long creditPaymentTwo = service.calculate(1_000_000, 24, 9.99);
        System.out.println("При сроке кредита 2 года Ваш ежемесячный платеж составит " + creditPaymentTwo + " руб.");
        long creditPaymentThree = service.calculate(1_000_000, 36, 9.99);
        System.out.println("При сроке кредита 3 года Ваш ежемесячный платеж составит " + creditPaymentThree + " руб.");
    }
}
