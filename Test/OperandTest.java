package Test;

import Main.Operand;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class OperandTest {

    Operand operand = new Operand();

    @Test
    public void parse_Test() {
        String[] result = operand.parse("8 + 4");
        assertArrayEquals(result, new String[] {"8","+","4"});
    }
}
