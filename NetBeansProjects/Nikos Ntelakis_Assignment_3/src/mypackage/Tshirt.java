
package mypackage;

import java.util.Random;


public class Tshirt {
    
    private String name;
    private Color color;
    private Fabric fabric;
    private Size size;
    private double price;

    Tshirt() {
       
    }
    public double calculatePrice(){
        double price;
        price = this.getColor().getColorPrice();
        price += getFabric().getPrice();
        price += getSize().getPrice();
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    private Color randomColor(){
        Random random = new Random();
        Color[]colors = Color.values();
        int numberOfColors = colors.length;
        int indexOfColor = random.nextInt(numberOfColors);
        return colors[indexOfColor];
        
    }
    private Size randomSize(){
        Random random = new Random();
        return Size.values()[random.nextInt(Size.values().length)];
    }
    
    private Fabric randomFabric(){
        Random random = new Random();
        return Fabric.values()[random.nextInt(Fabric.values().length)];
    }

    public Tshirt(String name, Color color, Fabric fabric, Size size, double price) {
        this.name = name;
        this.color = color;
        this.fabric = fabric;
        this.size = size;
        this.price = price;
    }

    public Tshirt(String name, Color color, Fabric fabric, Size size) {
        this.name = name;
        this.color = color;
        this.fabric = fabric;
        this.size = size;
        this.price = calculatePrice();
    }
    
    
    
}
