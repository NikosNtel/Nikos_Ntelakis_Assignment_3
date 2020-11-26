
package mypackage;

import strategy.BankTransferStrategy;
import strategy.CashStrategy;
import strategy.CreditCardStrategy;
import strategy.PaymentStrategy;


public class Assignment3 {
    
    

   
    public static void main(String[] args) {
        
        Cart cart = new Cart();
        
        cart.fillCart(10);
        
    Tshirt tsh1 = new Tshirt("Adventure", Color.INDIGO, Fabric.LINEN, Size.XXXL);
    Tshirt tsh2 = new Tshirt("Adventure", Color.YELLOW, Fabric.WOOL, Size.XL);
    Tshirt tsh3 = new Tshirt("Adventure", Color.GREEN, Fabric.COTTON, Size.M);
    
    cart.addTshirt(tsh1);
    cart.addTshirt(tsh2);
    cart.addTshirt(tsh3);
    
    double price = 0;
    for(Tshirt t: cart.getTshirts()) {
        price += t.getPrice();
    }
        System.out.println("Total price to pay:" + cart.getTotalPrice());
        PaymentStrategy strategy;
        if(cart.getTotalPrice()<50){
            strategy = new CashStrategy();
        }else if (cart.getTotalPrice()<150){
            strategy = new CreditCardStrategy("Visa","987654321",2021,125);
        }else{
            strategy = new BankTransferStrategy("Eurobank","987654321");
        }
        cart.setStrategy(strategy);
        cart.payTotal();
    }
    
}
