import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var myClass = new MyClass(0, 0);
        var random = new Random();
        myClass.SetWeight(random.nextInt());
        myClass.SetPrice(random.nextDouble());
        System.out.println(myClass.GetTotalPrice());
    }
}
