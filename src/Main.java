public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double sum = 1_000_000;
        double interest = 0.0999;
        int month = 12;
        double monthlyPayment = service.calculate(sum, interest, month);
        System.out.println(monthlyPayment);
    }
}