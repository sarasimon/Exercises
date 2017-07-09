import org.junit.*;
import java.io.*;
import static org.junit.Assert.*;

public class TriangleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    Triangle triangle;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        triangle = new Triangle();
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }


    @Test
    public void testPrintOneAsterisk(){
        triangle.printOneAsterisk();
        assertEquals("*", outContent.toString().trim());
    }

    @Test
    public void testPrintLineOf6Asterisk(){
        Triangle triangle = new Triangle();
        triangle.printHorizontalLine(6);
        assertEquals("******", outContent.toString().trim());
    }

    @Test
    public void testVerticalLineOf6Asterisk(){
        Triangle triangle = new Triangle();
        triangle.printVerticalLine(6);
        assertEquals("*\n*\n*\n*\n*\n*", outContent.toString().trim());
    }

    @Test
    public void testRightTriangle6Lines(){
        Triangle triangle = new Triangle();
        triangle.printRightTriangle(6);
        assertEquals("*\n**\n***\n****\n*****\n******", outContent.toString().trim());
    }

}