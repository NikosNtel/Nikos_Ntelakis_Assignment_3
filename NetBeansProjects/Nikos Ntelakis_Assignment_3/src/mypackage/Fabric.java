
package mypackage;


public enum Fabric {
    WOOL(1), COTTON(2), POLYESTER(3), RAYON(4), LINEN(5), CASHMERE(6), SILK(7);
    
    private final int price;

    private Fabric(int price) {
        this.price = price;
    }
    
    public int getPrice(){
        return price;
    }
    
}
