package geometric;
public class RectangleShape implements GeometricShape {

    double x;
    double y;
    double w;
    double h;

    public RectangleShape(double _x, double _y, double _w, double _h){
        x = _x;
        y = _y;
        w = _w;
        h = _h;
    }

    
    public String getShapeInfo() {
        return ("Rectangle: x=" + Double.toString(x) + " y=" + Double.toString(y) + " w=" + Double.toString(w) + " h=" + Double.toString(h));
    }

    @Override
    public double getArea() {
        return (w*h);
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
        return (x - (w / 2));
    }

    @Override
    public double getRightmostPoint() {
        return (x + (w / 2));
    }
    
}
