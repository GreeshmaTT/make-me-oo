package org.oop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class DistanceAndDirectionCalculatorTest {
    @Test
    void shouldHaveADistanceOfZeroWhenTwoPointsWithSameXAndYCoordinates() {

        double expectedDistance = 0.0;

        Point origin = new Point(0,0);

        double actualDistance = origin.distanceBetweenTwoPoints(origin);

        Assertions.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void shouldHaveUnitDistanceBetweenOriginAndPointsOnUnitCircle() {
        double expectedDistance = 1.0;

        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);

        double actualDistance = origin.distanceBetweenTwoPoints(point1);

        Assertions.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void shouldHaveDoubledDistanceBetweenTwoOppositePointsOnUnitCircle() {
        double expectedDistance = 2.0;

        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        double actualDistance = point1.distanceBetweenTwoPoints(point2);

        Assertions.assertEquals(expectedDistance, actualDistance);

    }
}
