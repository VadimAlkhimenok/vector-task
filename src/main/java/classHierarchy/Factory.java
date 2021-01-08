package classHierarchy;

public class Factory {
    public Shape create(TypeOfShapes shape, double ...args) {
        if (TypeOfShapes.BALL.equals(shape)) {
            return new Ball(args[0]);
        } else if (TypeOfShapes.CYLINDER.equals(shape)) {
            return new Cylinder(args[0], args[1]);
        } else if (TypeOfShapes.PYRAMID.equals(shape)) {
            return new Pyramid(args[0], args[1]);
        } else {
            return null;
        }
    }
}