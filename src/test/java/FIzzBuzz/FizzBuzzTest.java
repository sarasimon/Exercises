package FIzzBuzz;

import org.junit.*;
import java.util.ArrayList;
import static org.junit.Assert.*;


public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testListOfNumbers1to100SizeIs100() {
        ArrayList<String> list = fizzBuzz.play();
        assertEquals(100, list.size());
    }

    @Test
    public void testListOfNumbers1to100FirstElementIs1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        ArrayList<String> list = fizzBuzz.play();
        assertEquals("1", list.get(0));
    }

    @Test
    public void testListOfNumbers1to100ElementRandomNumberIsTheSameRandomNumber() {
        ArrayList<String> list = fizzBuzz.play();
        assertEquals("13", list.get(12));
    }

    @Test
    public void testElement9IsFizz() {
        ArrayList<String> list = fizzBuzz.play();
        assertEquals("Fizz", list.get(8));
    }

    @Test
    public void testElement5IsBuzz() {
        ArrayList<String> list = fizzBuzz.play();
        assertEquals("Buzz", list.get(4));
    }

    @Test
    public void testElement15IsFizzBuzz() {
        ArrayList<String> list = fizzBuzz.play();
        assertEquals("FizzBuzz", list.get(14));
    }

}