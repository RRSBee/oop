package geometric;

import java.util.Arrays;

public class GeometryList {
    GeometricShape[] shapes = {};  //needs to have a fixed size

    public int getSize() {
        return this.shapes.length;
    }

    public GeometricShape[] getAllGeometricShapes() {
        return shapes;
    }

    public GeometricShape getGeometricShapeByIndex(int index) {
        return shapes[index];
    }

    public boolean removeShape(int index) {
        GeometricShape[] newShapes = new GeometricShape[shapes.length - 1];
        for (int i=0, k=0; i < shapes.length; i++) {
            if (i != index) {
                newShapes[k] = shapes[i];
                k++;
            }
        }
        shapes = newShapes;
        return true;
    }

    public GeometricShape[] addShape(GeometricShape shape) {
        GeometricShape[] newShapes = new GeometricShape[shapes.length + 1];
        for (int i = 0; i < shapes.length; i++) {
            newShapes[i] = shapes[i];
        }
        newShapes[newShapes.length - 1] = shape;
        shapes = newShapes;
        return shapes;
    }

    public GeometricShape[] sort(char token) {
        if (token == '0') { Arrays.sort(shapes); }
        else if (token == 'x') {
            // ----- sorts the point values, but not the objects -----
            // double[] points = new double[shapes.length];
            // for (int i = 0; i < shapes.length; i++) {
            //     points[i] = shapes[i].getLeftmostPoint();
            //     Arrays.sort(points);
            // }
        }
        int shapesSize = shapes.length;
        for (int i = 0; i < shapesSize; i++) {
            System.out.println(shapes[i].getShapeInfo() + " Area=" + shapes[i].getArea());
        }
        return shapes;
    }
}
