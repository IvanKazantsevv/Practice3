package Ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Tester {
    int n;
    Circle[] circles;

    Tester(int n) {
        circles = new Circle[n];
    }

    public void AddCircles() {
        Scanner in = new Scanner(System.in);
        double x;
        double y;
        for (int i = 0; i < circles.length; i++) {
            x = in.nextDouble();
            y = in.nextDouble();
            circles[i] = new Circle(x, y);
        }
    }

    public void Print() {
        for (int i = 0; i < circles.length; i++) {
            circles[i].print();
            System.out.println();
        }
    }

    public void srt()
    {
        Arrays.sort(circles, Comparator.comparing(Circle :: getSquare));
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        Tester tester = new Tester(n);
        tester.AddCircles();
        tester.Print();
        tester.srt();
        tester.Print();

    }
}
