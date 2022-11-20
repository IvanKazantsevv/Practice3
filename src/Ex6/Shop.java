package Ex6;

import java.util.Scanner;

public class Shop {

    Product[] products = new Product[2];
    Shop()
    {
        String s1 = "Компьютер";
        int n1 = 60000;
        products[0] = new Product(s1,n1);
        String s2 = "Мышка";
        int n2 = 10000;
        products[1] = new Product(s2,n2);
    }

    public Product Find(String s)
    {
        for (int i = 0; i < products.length; i++)
        {
            if (s.equals(products[i].getS())) return products[i];
        }
        return null;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String val, name;
        System.out.print("Введите название товара: ");
        name = in.next();
        Shop shop = new Shop();
        if (shop.Find(name) != null && shop.Find(name).getS().equals(name))
        {
            System.out.print("Введите валюту: ");
            val = in.next();
            if (val.equals("Доллар")) System.out.println("Название товара: " + shop.Find(name).getS() + " цена: " + new Converter(shop.Find(name).getN()).dollars() + "$");
            if (val.equals("Евро")) System.out.println("Название товара: " + shop.Find(name).getS() + " цена: " + new Converter(shop.Find(name).getN()).euros() + "€");
        }
    }
}
