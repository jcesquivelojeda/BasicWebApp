package tutorial;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
/**
 * Created by nick on 2/09/15.
 */
public class CalculatorTest {
    @Mock
    private Calculator calc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAbs(){
        when(calc.abs(-20)).thenReturn(20);
        assertEquals(20,calc.abs(-20));
    }

}
