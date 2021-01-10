package classHierarchy;

public enum TypeOfShapes {
    BALL (1),
    CYLINDER (2),
    PYRAMID (3);

    private int numberShape;

    TypeOfShapes(int numberShape) {
        this.numberShape = numberShape;
    }

    public void setNumberShape(int numberShape) {
        this.numberShape = numberShape;
    }

    public int setNumberShape() {
        return numberShape;
    }

    @Override
    public String toString() {
        return "{title: " + numberShape + "}";
    }
}
