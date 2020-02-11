package Test;

import Main.Operation;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class OperationTest {

    @Mock
    private Operation operation = mock(Operation.class);

    @Test
    public void returnsSum_whenAdditionSelected() {
        Double result = operation.addition(15, 15);
        assertEquals(result, new Double (30));
    }

    @Test
    public void returnsSub_whenSubtractionSelected() {
        Double result = operation.subtraction(25, 15);
        assertEquals(result, new Double (10));
    }

    @Test
    public void returnsMult_whenMultiplicationSelected() {
        Double result = operation.multiplication(4, 5);
        assertEquals(result, new Double (20));
    }

    @Test
    public void returnsDiv_whenDivisionSelected() {
        Double result = operation.division(30, 3);
        assertEquals(result, new Double (10));
    }

    @Test
    public void returnsPow_whenPowerSelected() {
        Double result = operation.power(5, 2);
        assertEquals(result, new Double (25));
    }

}
