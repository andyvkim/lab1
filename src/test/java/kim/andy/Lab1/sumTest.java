package kim.andy.Lab1;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by andykim on 1/12/17.
 */
public class sumTest {

    Sum sum;
    @Before
    public void setUp()

    {
        sum = new Sum();
    }
    @Test
    public void getSumTest(){

        int expected = 6;
        int actual = sum.getSum(3);
        assertEquals(expected, actual);
    }






}
