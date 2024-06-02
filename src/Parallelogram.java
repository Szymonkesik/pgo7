public class Parallelogram implements Figure {
    private double Baseside;
    private double side;
    private double height;

    public Parallelogram(double baseside, double side, double height) {
        Baseside = baseside;
        this.side = side;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return side*2 + Baseside*2;
    }

    @Override
    public double getArea() {
        return side*Baseside;
    }

    @Override
    public String getType() {
        return "Parallelogram";
    }
}