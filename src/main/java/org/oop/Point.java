package org.oop;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceBetweenTwoPoints(Point to) {
        double xDistance = getxDistance(to);
        double yDistance = getyDistance(to);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    private double getyDistance(Point to) {
        return this.y - to.y;
    }

    private double getxDistance(Point to) {
        return this.x - to.x;
    }
}
