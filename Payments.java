public class Payments {
    private double amount;
    public Payments() {
        amount = 0;
    }
    public Payments(double amount) {
        this.amount = amount;
    }
    public void setPayments(double amount) {
        this.amount = amount;
    }
    public double getPayments() {
        return amount;
    }
    public void paymentDetails() {
        System.out.println("Payment Amount is: "+amount);
    }
}

class CashPayments extends Payments {
    public CashPayments() {
        super();
    }
    public CashPayments(double amt) {
        super(amt);
    }
    public void paymentDetails() {
        System.out.println("Amount payed in Cash is: Rs."+getPayments());
        System.out.println("____________________________________");
    }
}

class CreditCardPayments extends Payments {
    private String name;
    private String expiry;
    private String CrediCardNum;
    private String Store;
    public CreditCardPayments() {
        super();
        name = "";
        expiry = "";
        CrediCardNum = "";
        Store = "";
    }
    public CreditCardPayments(double amt, String name, String expiry, String CreditCardNum, String Store) {
        super(amt);
        this.name = name;
        this.expiry = expiry;
        this.CrediCardNum = CreditCardNum;
        this.Store = Store;
    }
    public void paymentDetails() {
        System.out.println("Amount spent by Credit Card at "+this.Store+": Rs."+getPayments());
        System.out.println("Credit Card Number: "+CrediCardNum);
        System.out.println("Name on the Card: "+name);
        System.out.println("Credit Card Expiry: "+expiry);
        System.out.println("____________________________________________________________");
    }
}

class CardPayments {
    public static void main(String[] args) {
        CashPayments cash1 = new CashPayments(9870), cash2 = new CashPayments(8765), cash3 = new CashPayments(7568);
        CreditCardPayments credit1 = new CreditCardPayments(12000, "Rohan Sharma", "12/2026", "1234 5678 9875 0987", "Amazon Inc ");
        CreditCardPayments credit2 = new CreditCardPayments(13450, "Karthik Vankadara", "12/2029", "5674 5839 9284 0948","Flipkart ");
        CreditCardPayments credit3 = new CreditCardPayments(23420, "Habeeb Ur Rahman", "22/2024", "7648 4839 5972 0949", "Reliance ");

        System.out.println("Cash Payment 1 Details:");
        cash1.paymentDetails();
        System.out.println();

        System.out.println("Cash Payment 2 Details:");
        cash2.paymentDetails();
        System.out.println();

        System.out.println("Cash Payment 3 Details: ");
        cash3.paymentDetails();
        System.out.println();

        System.out.println("Credit Card Payment 1 Details:\n");
        credit1.paymentDetails();
        System.out.println();

        System.out.println("Credit Card Payment 2 Details:\n");
        credit2.paymentDetails();
        System.out.println();

        System.out.println("Credit Card Payment 3 Details:\n");
        credit3.paymentDetails();
        System.out.println();
    }
}