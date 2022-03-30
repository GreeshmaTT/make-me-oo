package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DistanceAndDirectionCalculatorTest {
    @Test
    void shouldHaveZeroDistanceWhenTwoPointsWithSameXAndYCoordinates() {

        double expectedDistance = 0.0;

        Point origin = new Point(0, 0);

        double actualDistance = origin.distanceTo(origin);

        Assertions.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void shouldHaveUnitDistanceBetweenOriginAndPointsWhenOnUnitCircle() {
        double expectedDistance = 1.0;

        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);

        double actualDistance = origin.distanceTo(point1);

        Assertions.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void shouldHaveTwiceDistanceBetweenTwoOppositePointsOnAUnitCircle() {
        double expectedDistance = 2.0;

        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        double actualDistance = point1.distanceTo(point2);

        Assertions.assertEquals(expectedDistance, actualDistance);

    }

    @Test
    void shouldHaveDirectionOfPiRadiansWhenOriginAndPointIsOnNegativeXAxis() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);

        double actualDistance = point1.directionTo(origin);

        Assertions.assertEquals(Math.PI, actualDistance);

    }

    @Test
    void shouldHaveDirectionOfHalfPiRadiansWhenOriginAndPointOnYAxis() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);

        double actualDistance = point1.directionTo(origin);

        Assertions.assertEquals(Math.PI / 2, actualDistance);
    }
}
