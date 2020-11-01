
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class TestCalculator {
    private Calculator calc;

    @BeforeEach
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void TestSumIsCorrect() {
        Assert.assertEquals(calc.Sum(1, 2), 3);
    }

    @Test
    public void TestSumIsCorrectForNegative() {
        Assert.assertEquals(calc.Sum(1, -2), -3);
    }

    @Test
    public void TestSumIsIncorrect() {
        Assert.assertEquals(calc.Sum(2, 2), 5);
    }

    @Test
    public void TestDivIsCorrect() throws Exception {
        Assert.assertEquals(calc.Div(10, 2), 5);
    }

    @Test
    public void TestDivIsIncorrect() throws Exception {
        Assert.assertEquals(calc.Div(10, 2), 3);
    }

    @Test
    public void TestDivIsCorrectForNegative() throws Exception {
        Assert.assertEquals(calc.Div(10, -2), -5);
    }

    @Test
    public void TestDivToZero() throws Exception {
        try {
            calc.Div(10, 0);
        } catch (Exception e) {

        }
        try {
            calc.Div(10, 0);
            fail("Unhandled zero division exception");
        } catch (Exception expectedException) {
        }
    }
}
