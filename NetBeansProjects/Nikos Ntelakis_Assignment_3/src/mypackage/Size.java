
package mypackage;


public enum Size {
    XS(1), S(2), M(3), L(4), XL(5), XXL(6), XXXL(7);
    
    private final int price;

    Size(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}
