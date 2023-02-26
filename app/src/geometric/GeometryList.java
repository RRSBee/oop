package geometric;

public class GeometryList {
    GeometricShape[] shapes = {};  //needs to have a fixed size

    public int getSize() {
        return this.shapes.length;
    }

    public GeometricShape[] getGeometricShapes() {
        return shapes;
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
}
