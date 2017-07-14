import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DiamondTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    Diamond diamond;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        diamond = new Diamond();
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testRightTriangle3Lines() {
        String rightTriangle = diamond.rightTriangle(3);
        assertEquals("*  \n** \n***", rightTriangle);
    }

    @Test
    public void testRightTriangle4Lines() {
        String rightTriangle = diamond.rightTriangle(4);
        assertEquals("*   \n**  \n*** \n****", rightTriangle);
    }


    @Test
    public void testLeftTriangle3Lines() {
        String leftTriangle = diamond.leftTriangle(3);
        assertEquals("  *\n **\n***", leftTriangle);
    }

    @Test
    public void testIsoscelesTriangle3Lines() {
        String isoscelesTriangle = diamond.isoscelesTriangle(3);
        assertEquals("  *  \n *** \n*****", isoscelesTriangle);
    }

    @Test
    public void testIsoscelesTriangle4Lines() {
        String isoscelesTriangle = diamond.isoscelesTriangle(4);
        assertEquals("   *   \n  ***  \n ***** \n*******", isoscelesTriangle);
    }

    @Test
    public void testIsoscelesTriangle5Lines() {
        String isoscelesTriangle = diamond.isoscelesTriangle(5);
        assertEquals("    *    \n   ***   \n  *****  \n ******* \n*********", isoscelesTriangle);
    }

//    @Test
//    public void testDiamond4Lines() {
//        String diamondTriangle = diamond.diamondTriangle(3);
////        new StringBuilder(rightTriangle).reverse().reverse().toString()
//        assertEquals("  *  \n *** \n*****\n *** \n  *  ", diamondTriangle);
//    }

    @Test
    public void testDiamond4Lines() {
        String diamondTriangle = diamond.diamondTriangle(3);
//        new StringBuilder(rightTriangle).reverse().reverse().toString()
        assertEquals("  *  \n *** \n*****\n *** \n  *  ", diamondTriangle);
    }


}