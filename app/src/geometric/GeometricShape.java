package geometric;

public interface GeometricShape extends Comparable<GeometricShape> {
    String getShapeInfo();
    double getArea();
    double getLeftmostPoint();
    double getRightmostPoint();
    boolean moveShape(double dx, double dy);
    int compareTo(GeometricShape other);
}

