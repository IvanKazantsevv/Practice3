package Ex6;

public class Converter {
    double n;

    Converter(double n)
    {
        this.n = n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double dollars()
    {
        n = n/63;
        n = Math.round(n * 100);
        n = n/100;
        return n;
    }

    public double euros()
    {
        n = n/60;
        n = Math.round(n * 100);
        n = n/100;
        return n;
    }
}
