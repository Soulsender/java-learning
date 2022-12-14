package SquareRootFinder;

public class SquareRootFinder {
    double n;
    int interations;

    public void setNumber(double number) {
        n = number;
        interations = 7;
        if (n < 10) {
            interations++;
        }
    }

    public double getRoot() {
        double x = n/4;
        for (int i = 0; i < interations; i++) {
            x = (x+(n/x))/2.0;
        }
        return x;
    }
}
