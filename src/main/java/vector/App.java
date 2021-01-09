package vector;

public class App {
    public static void main(String[] args) {
        Vector[] newVectors = Vector.createVectorsRandom(5);
        System.out.println("vector.Vector: " + newVectors[0]);
        System.out.println("vector.Vector with length method: " + newVectors[0].lengthOfVector());
        System.out.println("vector.Vector with scalar produce method: " + newVectors[1].getScalar(newVectors[2]));
        System.out.println("vector.Vector with cosine method: " + newVectors[2].cos(newVectors[3]));
        System.out.println("vector.Vector with sum method: " + newVectors[3].sum(newVectors[4]));
        System.out.println("vector.Vector with difference method: " + newVectors[4].dif(newVectors[1]));
        System.out.println("vector.Vector with cross produce method: " + newVectors[1].crossProduct(newVectors[2]));
    }
}