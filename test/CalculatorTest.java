import junit.framework.TestCase;
import lesson24.Calculator;
import lesson24.DrobnoeChislo;
import org.junit.Test;

public class CalculatorTest extends TestCase {
    @Test
    public void add1() {
        Calculator calculator = new Calculator();

        DrobnoeChislo chislo1 = new DrobnoeChislo();
        chislo1.setChislitel(1);
        chislo1.setZnamenatel(4);

        DrobnoeChislo chislo2 = new DrobnoeChislo();
        chislo1.setChislitel(3);
        chislo1.setZnamenatel(5);

        DrobnoeChislo ozhidaemResult = new DrobnoeChislo();
        ozhidaemResult.setChislitel(17);
        ozhidaemResult.setZnamenatel(20);

        DrobnoeChislo faktResult = calculator.summa(chislo1, chislo2);

        assertEquals(ozhidaemResult, faktResult);

    }
}
