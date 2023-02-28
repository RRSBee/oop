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

    public String getShapeInfo() {
        return ("Circle: x="+Double.toString(x) + " y=" + Double.toString(y) + " r=" + Double.toString(r));
    }

    @Override
    public double getArea() {
        return Math.PI*(r *r);
    }

    @Override
    public boolean moveShape(double dx, double dy) {
        x += dx;
        y += dy;
        return true;
    }

    @Override
    public int compareTo(GeometricShape other) {
        if (this.getArea() == other.getArea()) { return 0; }
        else if (this.getArea() > other.getArea()) { return 1; }
        else { return -1; }
    }

    @Override
    public double getLeftmostPoint() {
        return (x - r);
    }

    @Override
    public double getRightmostPoint() {
        return (x + r);
    }
}
