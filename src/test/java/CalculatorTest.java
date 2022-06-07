import com.company.Calculator;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

        Calculator calculator = Calculator.instance.get();

        @org.junit.jupiter.api.Test
        public void testCalculatorPow(){
            int a = 9;
            int ex = 81;
            int result = (int) calculator.pow.apply(a);
            Assertions.assertEquals(ex,result);
            Assertions.assertNotNull(ex);
        }

    @org.junit.jupiter.api.Test
    public void testCalculatorAbs(){
        int a = 9;
        int ex = 9;
        int result = (int) calculator.abs.apply(a);
        Assertions.assertEquals(ex,result);
    }

        @org.junit.jupiter.api.Test
        public void testCalculatorPositive(){
            int a = 9;
            boolean ex = true;
            boolean result = calculator.isPositive.test(a);
            Assertions.assertTrue(ex==result);
        }

    }
