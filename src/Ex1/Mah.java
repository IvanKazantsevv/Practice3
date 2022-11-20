package Ex1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mah {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Random rand = new Random();

        double array[] = new double[n];
        for (int i = 0; i < n; i++)
        {
            //array[i] = rand.nextDouble(100);
            array[i] = ((double) (Math.random() * 100) - 15);
            System.out.println(array[i] + ' ');
        }
        Arrays.sort(array);
        System.out.println();
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i] + ' ');
        }
    }
}
