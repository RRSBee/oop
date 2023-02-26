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
        return (Double.toString(x) + " " + Double.toString(y) + " " + Double.toString(w) + " " + Double.toString(h));
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArea'");
    }

    @Override
    public double moveShape() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveShape'");
    }


    @Override
    public String printBorders(String leftBorder, String rightBorder, String bottomBorder, String topBorder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printBorders'");
    }
    
}
