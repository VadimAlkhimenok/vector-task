package classHierarchy;

import static classHierarchy.TypeOfShapes.*;

public class Factory {
    public Shape create(TypeOfShapes shape, double ...args) {
        if (BALL.equals(shape)) {
            return new Ball(args[0]);
        } else if (CYLINDER.equals(shape)) {
            return new Cylinder(args[0], args[1]);
        } else if (PYRAMID.equals(shape)) {
            return null;
//            return new Pyramid(args[0], args[1]);
        } else {
            return null;
        }
    }
}