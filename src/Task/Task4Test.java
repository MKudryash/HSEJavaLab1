package Task;

import org.junit.Assert;
import org.junit.Test;

public class Task4Test {
    @Test
    public void TestMethods_Task4_Expected0Result0() {
        double a = 0;
        double b = 0;
        double result = Task4.FoundD(a,b);
        double expected = 0.0;
        Assert.assertEquals(expected,result,0);
    }
    @Test
    public void TestMethods_Task4_Expected4Result4() {
        double a = 3.14/4;
        double b = 0;
        double result = Task4.FoundD(a,b);
        double expected = 1.0;
        Assert.assertEquals(expected,result,0.1);
    }
    @Test
    public void TestMethods_Task4_Expected3Result3() {
        double a = 2*3.14/3;
        double b = 1;
        double result = Task4.FoundD(a,b);
        double expected = Math.sqrt(3.0)/-1;
        Assert.assertEquals(expected,result,0.1);
    }

}