package lesson24;

import junit.framework.TestCase;
import lesson24.Calculator;
import lesson24.DrobnoeChislo;
import org.junit.*;

public class TestSuite extends TestCase {

    @BeforeClass
    public void testAdd() {
        DrobnoeChislo number1 = new DrobnoeChislo();
        number1.setChislitel(2);
        number1.setZnamenatel(4);

        DrobnoeChislo number2 = new DrobnoeChislo();
        number2.setChislitel(3);
        number2.setZnamenatel(5);

        DrobnoeChislo expectedResult = new DrobnoeChislo();
        expectedResult.setChislitel(22);
        expectedResult.setZnamenatel(20);

        Calculator calculator = new Calculator();
        DrobnoeChislo actualResult = calculator.summa(number1, number2);

        assertEquals(expectedResult, actualResult);
    }


    @AfterClass
    public void testAdd1() {
        DrobnoeChislo number1 = new DrobnoeChislo();
        number1.setChislitel(2);
        number1.setZnamenatel(4);

        DrobnoeChislo number2 = new DrobnoeChislo();
        number2.setChislitel(3);
        number2.setZnamenatel(5);

        DrobnoeChislo expectedResult = new DrobnoeChislo();
        expectedResult.setChislitel(22);
        expectedResult.setZnamenatel(20);

        Calculator calculator = new Calculator();
        DrobnoeChislo actualResult = calculator.summa(number1, number2);

        assertEquals(expectedResult, actualResult);
    }


    @After
    public void testAdd1dfdf() {
        DrobnoeChislo number1 = new DrobnoeChislo();
        number1.setChislitel(2);
        number1.setZnamenatel(4);

        DrobnoeChislo number2 = new DrobnoeChislo();
        number2.setChislitel(3);
        number2.setZnamenatel(5);

        DrobnoeChislo expectedResult = new DrobnoeChislo();
        expectedResult.setChislitel(22);
        expectedResult.setZnamenatel(20);

        Calculator calculator = new Calculator();
        DrobnoeChislo actualResult = calculator.summa(number1, number2);

        assertEquals(expectedResult, actualResult);
    }


    @Before
    public void testAdd1dff() {
        DrobnoeChislo number1 = new DrobnoeChislo();
        number1.setChislitel(2);
        number1.setZnamenatel(4);

        DrobnoeChislo number2 = new DrobnoeChislo();
        number2.setChislitel(3);
        number2.setZnamenatel(5);

        DrobnoeChislo expectedResult = new DrobnoeChislo();
        expectedResult.setChislitel(22);
        expectedResult.setZnamenatel(20);

        Calculator calculator = new Calculator();
        DrobnoeChislo actualResult = calculator.summa(number1, number2);

        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testAdd333() {
        DrobnoeChislo number1 = new DrobnoeChislo();
        number1.setChislitel(2);
        number1.setZnamenatel(4);

        DrobnoeChislo number2 = new DrobnoeChislo();
        number2.setChislitel(3);
        number2.setZnamenatel(5);

        DrobnoeChislo expectedResult = new DrobnoeChislo();
        expectedResult.setChislitel(22);
        expectedResult.setZnamenatel(20);

        Calculator calculator = new Calculator();
        DrobnoeChislo actualResult = calculator.summa(number1, number2);

        assertEquals(expectedResult, actualResult);
    }
}
