package src.main.java;

public class MyClass {
    private int weight;
    private double price;

    public MyClass(int weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public double GetTotalPrice() {
        return weight * price;
    }

    public void SetWeight(int weight) {
        this.weight = weight;
    }

    public void SetPrice(double price) {
        this.price = price;
    }

    public int GetWeight() {
        return weight;
    }

    public double GetPrice() {
        return price;
    }
}
