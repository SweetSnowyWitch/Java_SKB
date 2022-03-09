import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var data = scanner.nextLine().split(" ");
        var newClass = new MyClass(0, 0);
        newClass.SetWeight(Integer.parseInt(data[0]));
        newClass.SetPrice(Double.parseDouble(data[1]));
        System.out.println(newClass.GetTotalPrice());
    }
}