package ooppractice;

public class Circle {
    public double radius;

    public Circle(double radius)
    {
        this.radius= radius;
    }

    public double cirArea()
    {
        return  Math.PI *(radius*radius);
    }
}
