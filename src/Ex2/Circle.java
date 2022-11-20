package Ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Circle extends Point {
    Random rand = new Random();
    double radius = rand.nextDouble(10);
    double length = rand.nextDouble(10);

    Circle () {
        super(0, 0);
    }

    Circle (double x, double y) {
        super(x,y);
    }

    public double getSquare(){
        return Math.pow(radius, 2) * 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public String getmax(Circle c1, Circle c2)
    {
        if (c1.getSquare() > c2.getSquare())
        {
            return c1.toString();
        }
        else
        {
            return c2.toString();
        }
    }

    public void print() {
        System.out.print(this.toString());
    }

    public String toString() {
        return "Центр окружности: (" + super.getX() + ", " + super.getY() + ") Радиус окружности: " + radius;
    }
}
