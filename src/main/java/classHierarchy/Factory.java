package classHierarchy;

import static classHierarchy.TypeOfShapes.*;

public class Factory {
    private static Factory factory;

    private Factory() {}

    public static Factory getFactory() {
        if (factory == null) {
            factory = new Factory();
        }
        return factory;
    }

    public Shape create(TypeOfShapes shape, double ...args) {
        if (BALL.equals(shape)) {
            return new Ball(args[0]);
        } else if (CYLINDER.equals(shape)) {
            return new Cylinder(args[0], args[1]);
        } else if (PYRAMID.equals(shape)) {
            return new Pyramid(args[0], args[1]);
        } else {
            return null;
        }
    }
}
