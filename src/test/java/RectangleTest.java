import org.example.Rectangle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void testCalculateAreaCorrectly() {

        // Arrange
        int width = 4;
        int height = 5;
        int expectedArea = 20;
        Rectangle rectangle = new Rectangle(width, height);

        // Act
        int area = rectangle.getArea();

        // Assert
        assertEquals(expectedArea, area);
    }


    @Test
    public void testCanGetWithAndHeight() {
        // Arrange
        int width = 4;
        int height = 5;
        Rectangle rectangle = new Rectangle(width, height);

        // Act
        int rectangleWidth = rectangle.getWidth();
        int rectangleHeight = rectangle.getHeight();

        // Assert
        assertEquals(height, rectangleHeight);
        assertEquals(width, rectangleWidth);
    }

    @Test
    public void testCanSetHeightAndWidth() {
        int width = 4;
        int height= 5;
        Rectangle rectangle = new Rectangle(0, 0);

        rectangle.setWidth(width);
        rectangle.setHeight(height);

        assertEquals(width, rectangle.getWidth());
        assertEquals(height, rectangle.getHeight());
    }

}
