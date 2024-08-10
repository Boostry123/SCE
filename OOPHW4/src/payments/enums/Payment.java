package payments.enums;

public class Payment {
    private double amount;
    private PaymentMethod method;
    private String referenceNumber;

    Payment(double amount,PaymentMethod method){
        this.amount = amount;
        this.method = method;
        String rnd ="";
        for(int i = 0 ; i < 6; i++){
            rnd += Integer.toString((int)(Math.random()*10));
        }
        this.referenceNumber = "REF"+rnd;
    }

    public String printPaymentDetails(){
        return """
                amount : %f
                payment method : %s
                reference number: %s
                """.formatted(amount,method,referenceNumber);
    }


}
