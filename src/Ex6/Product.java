package Ex6;

public class Product {
    String s;
    int n;

    Product(String s, int n)
    {
        this.s = s;
        this.n = n;
    }

    public String getS()
    {
        return s;
    }

    public void setS(String s) {this.s = s;}

    public double getN()
    {
        return n;
    }

    public void setN(String s) {this.n = n;}

    public String toStirng()
    {
        return "Название товара: " + getS() + ", стоимость товара в рублях: " + n;
    }
}
