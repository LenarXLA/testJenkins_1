import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Test cases")
public class CalcTest {
    // test 3
    private Calc calc = new Calc();

    @Test(description = "Test 1 - success")
    public void testSum1() throws Exception {
        Assert.assertEquals(5, calc.sum(2,3));
    }
    @Test(description = "Test 2")
    public void testSum2() throws Exception {
        Assert.assertEquals(7, calc.sum(3,4));
    }
    @Test(description = "Test 3")
    public void testSum3() throws Exception {
        Assert.assertEquals(10, calc.sum(5,5));
    }
}
