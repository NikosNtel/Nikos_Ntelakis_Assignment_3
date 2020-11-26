
package strategy;


public class CashStrategy implements PaymentStrategy {
    
    @Override
    public void pay(double price) {
        System.out.println("You will pay $" +price + "by cash");
    }
    
}
