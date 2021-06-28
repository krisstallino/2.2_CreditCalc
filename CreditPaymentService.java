public class CreditPaymentService {
    public long calculate(long credit, int month, double percent) {
        double interest = percent / 100 / 12;
        double amount = (1 + interest);
        double degree = month;
        var answer = (Math.pow(amount, degree));
        double creditPayment;
        creditPayment = credit * (interest + (interest / (answer - 1)));
        return (long) creditPayment;
    }
}
