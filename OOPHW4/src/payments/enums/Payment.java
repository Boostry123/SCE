package payments.enums;
//Assignment : 4
//Author : Yanir Latyshev 207325093

public class Payment {
    private double amount;
    private PaymentMethod method;
    private String referenceNumber;

    /**
     * Construcotr of the Payment.
     * Will set a new reference Number of each new instance. Example: REF111111.
     * @param amount
     * @param method
     */
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
