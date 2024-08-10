package payments.enums;

public class PaymentTest {
    public static void main(String[] args) {
        Payment pt1 = new Payment(100.0,PaymentMethod.CREDIT_CARD);
        Payment pt2 = new Payment(200.0,PaymentMethod.PAYPAL);
        Payment pt3 = new Payment(300.0,PaymentMethod.DEBIT_CARD);
        System.out.println(pt1.printPaymentDetails());
        System.out.println(pt2.printPaymentDetails());
        System.out.println(pt3.printPaymentDetails());

    }
}
