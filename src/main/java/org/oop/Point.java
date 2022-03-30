package org.oop;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point to) {
        double xDistance = xDifference(to);
        double yDistance = yDifference(to);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    private double yDifference(Point to) {

        return this.y - to.y;
    }

    private double xDifference(Point to) {
        return this.x - to.x;
    }

    public double directionTo(Point to) {
        double xDistance = xDifference(to);
        double yDistance = yDifference(to);
        return Math.atan2(yDistance, xDistance);
    }
}
