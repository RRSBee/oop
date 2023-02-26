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
        return ("Circle x="+Double.toString(x) + " y=" + Double.toString(y) + " r=" + Double.toString(r));
    }

    @Override
    public double getArea() {
        return Math.PI*(r *r);
    }

    @Override
    public double moveShape() {
        return 0.0;
    }


    @Override
    public String printBorders(String leftBorder, String rightBorder, String bottomBorder, String topBorder) {
        leftBorder = Double.toString(x - r);
        rightBorder = Double.toString(x + r);
        bottomBorder = Double.toString(y - r);
        topBorder = Double.toString(y + r );

        throw new UnsupportedOperationException("Unimplemented method 'printBorders'");
    }
}
