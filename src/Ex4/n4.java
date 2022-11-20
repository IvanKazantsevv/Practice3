package Ex4;

import java.util.Random;
import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int n = 0;
        while (n <= 0)
        {
            System.out.print("Введите число: ");
            n = in.nextInt();
        }
        int array[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++)
        {
            array[i] = rand.nextInt(0, n);
            if (array[i]%2 == 0) k++;
            System.out.println(array[i]);
        }
        if (k > 0)
        {
            int array1[] = new int[k];
            for (int i = 0; i < k; i++)
            {
                if (array[i]%2 == 0) array1[i] = array[i];
            }
            for (int i = 0; i < k; i++)
            {
                System.out.println(array1[i]);
            }
        }

    }
}
