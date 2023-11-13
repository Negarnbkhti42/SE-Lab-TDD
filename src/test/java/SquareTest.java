import org.example.Rectangle;
import org.example.Square;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test
    public void testCalculatesAreaCorrectly() {
        // arrange
        int side = 4;
        int expectedArea = side * side;
        Square square = new Square(side);

        // act
        int area = square.computeArea();

        // assert
        assertEquals(expectedArea, area);
    }

    @Test
    public void testCanGetWithAndHeight() {
        // Arrange
        int side =4;
        Square square = new Square(side);

        // Act
        int squareSide = square.getSide();

        // Assert
        assertEquals(side, squareSide);
    }

    @Test
    public void testCanSetHeightAndWidth() {
        int side = 4;
        Square square = new Square(0);

        square.setSide(side);

        assertEquals(side, square.getSide());
    }
}
