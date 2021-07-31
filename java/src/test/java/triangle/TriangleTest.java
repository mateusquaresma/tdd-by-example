package triangle;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TriangleTest {


    @Test
    public void isEquilateral() {
        Triangle triangle = new Triangle(3, 3, 3);
        assertTrue(triangle.isEquilateral());
    }

    @Test
    public void isIsoceles() {
        Triangle triangle = new Triangle(3, 3, 2);
        assertTrue(triangle.isIsosceles());
    }

    @Test
    public void isScalene() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertTrue(triangle.isScalene());
    }

    @Test(expected = RuntimeException.class)
    public void isTriangle() {
        new Triangle(1,10,12);
    }

    @Test(expected = RuntimeException.class)
    public void triangleWithNegativeSide() {
        new Triangle(-1,10,12);
    }
}
