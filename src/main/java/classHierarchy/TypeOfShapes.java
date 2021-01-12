package classHierarchy;

public enum TypeOfShapes {
    BALL (1),
    CYLINDER (2),
    PYRAMID (3);

    private final int numberShape;

    TypeOfShapes(int numberShape) {
        this.numberShape = numberShape;
    }

    @Override
    public String toString() {
        return "{title: " + numberShape + "}";
    }
}
