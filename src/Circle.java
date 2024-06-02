public class Circle implements Figure{
    private double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radious;
    }

    @Override
    public double getArea() {
        return Math.pow(radious,2)*Math.PI;
    }

    @Override
    public String getType() {
        return "Circle";
    }
}