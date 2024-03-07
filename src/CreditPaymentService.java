public class CreditPaymentService {
    public double calculate(double creditSum, double interest, int month) {
        return creditSum * interest / 12 * Math.pow(1 + interest / 12, month) / (Math.pow(1 + interest / 12, month) - 1);
    }

}
