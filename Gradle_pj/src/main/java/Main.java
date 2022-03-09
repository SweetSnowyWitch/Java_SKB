package src.main.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var myClass = new MyClass(0, 0);
        var scanner = new Scanner(System.in);
        var data = scanner.nextLine().split(" ");
        myClass.SetWeight(Integer.parseInt(data[0]));
        myClass.SetPrice(Double.parseDouble(data[1]));
        System.out.println(myClass.GetTotalPrice());
    }
}
