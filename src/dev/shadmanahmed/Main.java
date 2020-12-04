package dev.shadmanahmed;

public class Main {

    public static void main(String[] args) {
        double kilometers = (100 * 1.60);
        int highScore = 50;

        if (highScore == 50) {
            System.out.println("This is an expression " + kilometers);
        }
        calculateScore(highScore);

    }

    public static void calculateScore(int highScore) {
        System.out.println("Hello World " + highScore);
    }
}
