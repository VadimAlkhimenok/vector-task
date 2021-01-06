package vector;

public class Vector {
    private double x;
    private double y;
    private double z;


    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double lengthOfVector() {
        return Math.sqrt((this.getX() * this.getX()) + (this.getY() * this.getY()) + (this.getZ() * this.getZ()));
    }

    public double getScalar(Vector newVector) {
        return (newVector.getX() * this.getX()) + (newVector.getY() * this.getY()) + (newVector.getZ() * this.getZ());
    }

    public Vector crossProduct(Vector newVector) {
        return new Vector(
                this.getY() * newVector.getZ() - this.getZ() * newVector.getY(),
                this.getZ() * newVector.getX() - this.getX() * newVector.getZ(),
                this.getX() * newVector.getY() - this.getY() * newVector.getX()
        );
    }

    public double cos(Vector newVector) {
        return getScalar(newVector) / this.lengthOfVector() * newVector.lengthOfVector();
    }

    public Vector sum(Vector newVector) {
        return new Vector(
                this.getX() + newVector.getX(),
                this.getY() + newVector.getY(),
                this.getZ() + newVector.getZ()
        );
    }

    public Vector dif(Vector newVector) {
        return new Vector(
            this.getX() - newVector.getX(),
            this.getY() - newVector.getY(),
            this.getZ() - newVector.getZ()
        );
    }

    public static Vector[] createVectorsRandom(int number) {
        Vector[] vectors = new Vector[number];
        for (int i = 0; i < number; i++){
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "vector.Vector = " + "x: " + x + ", y: " + y + ", z: " + z;
    }

}
