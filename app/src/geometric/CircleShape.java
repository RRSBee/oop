package geometric;

public class CircleShape implements GeometricShape {
    
    double x;
    double y;
    double r;
    public CircleShape(double _x, double _y, double _r) {
        x = _x;
        y = _y;
        r = _r;
    }
    public void printBorders() {

    }
    public double getArea() {
        return Math.PI*(r*r);
    }
    public boolean moveShape() {
        return false;
    }
}
