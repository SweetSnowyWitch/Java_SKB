public class MyClass {
    private int weight;
    private double price;

    MyClass(int weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public double GetTotalPrice() {
        return Math.abs(weight * price);
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
