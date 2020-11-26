
package mypackage;


public enum Color {
    
    VIOLET(1), INDIGO(2), BLUE(3), GREEN(4), YELLOW(5), ORANGE(6), RED(7);
    
    private final int colorPrice;

    private Color(int colorPrice) {
        this.colorPrice = colorPrice;
    }
    public int getColorPrice() {
        return colorPrice;
    }
    
}
