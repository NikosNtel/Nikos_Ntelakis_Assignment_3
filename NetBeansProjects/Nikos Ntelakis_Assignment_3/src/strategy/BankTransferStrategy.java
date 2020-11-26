
package strategy;


public class BankTransferStrategy implements PaymentStrategy{
    private final String bank;
    private final String accountNumber;

    public BankTransferStrategy(String bank, String accountNumber) {
        this.bank = bank;
        this.accountNumber = accountNumber;
    }
    
    

    @Override
    public void pay(double price) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "BankTransferStrategy{" + "bank=" + bank + ", accountNumber=" + accountNumber + '}';
    }
    
    
}
