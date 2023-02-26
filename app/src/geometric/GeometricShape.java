package geometric;

public interface GeometricShape {
    String printBorders(String leftBorder, String rightBorder, String bottomBorder, String topBorder);
    String getShapeInfo();
    double getArea();
    double moveShape();
}

