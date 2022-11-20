package Ex3;

import java.util.Random;

public class n3 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < 4; i++)
        {
            array[i] = (int)(Math.random()*90+10);
            System.out.println(array[i]);
        }
        int k = 0;
        for (int i = 0; i < 3; i++)
        {
            if (array[i] > array[i+1])
            {
                k = 1;
                break;
            }
        }
        if (k == 0) System.out.println("Строго возрастающая");
        else System.out.println("Не строго возрастающая");

    }
}
