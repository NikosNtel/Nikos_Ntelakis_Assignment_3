
package mypackage;

import java.util.ArrayList;
import java.util.List;
import strategy.PaymentStrategy;


public class Cart {
    private List<Tshirt> tshirts;
    private PaymentStrategy strategy;
    
    
    
    
    
    public  Cart(){
        tshirts = new ArrayList<>();
    }
    
    
    public List<Tshirt>getTshirts() {
        return tshirts;
    }
    
    public void addTshirt (Tshirt tshirt){
        tshirts.add(tshirt);
    }
    public PaymentStrategy getStrategy(){
        return strategy;
    }
    public void setStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }
    public void fillCart(int numberOfTshirts){
        for (int i=0; i<numberOfTshirts;i++){
            addTshirt(new Tshirt());
        }
    }
    public void payTotal(){
        double total = getTotalPrice();
        strategy.pay(total);
    }
    public double getTotalPrice(){
        double price = 0;
        for(Tshirt tsh: getTshirts()){
            price+=tsh.getPrice();
        }
        return price;
    }
   
    
   
       
        
        
    }
    
    
    

