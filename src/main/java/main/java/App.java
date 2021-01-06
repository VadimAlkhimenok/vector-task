package main.java;

public class App {
    public static void main(String[] args) {
        Vector[] newVectors = Vector.createVectorsRandom(5);
        System.out.println(newVectors[0].lengthOfVector());
        System.out.println(newVectors[1].getScalar(newVectors[2]));
        System.out.println(newVectors[2].cos(newVectors[3]));
        System.out.println(newVectors[3].sum(newVectors[4]));
        System.out.println(newVectors[4].dif(newVectors[1]));
    }
}
