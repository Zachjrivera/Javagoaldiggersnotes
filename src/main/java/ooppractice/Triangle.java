package ooppractice;

public class Triangle {
    public int base;
    public int height;

    public Triangle(int base, int height)
    {
        this.height = height;
        this.base = base;
    }

    public int triarea ()
    {
        return (base/2)*height;
    }
}
