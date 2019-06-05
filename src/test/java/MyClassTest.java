import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MyClassTest {

    private static MyClass myClass;

    @BeforeClass
    public static void setUp() {
        myClass = new MyClass();
    }

    @Rule
    public final TestName testName = new TestName();

    @Test
    public void testMyClass() {
        assertEquals("testMyClass", testName.getMethodName());
    }

    @Test
    public void myMatcher(){
        assertThat(myClass.compareLinks(), is("Hello"));
    }

    @Test
    public void sum() {
        Assert.assertEquals(5, myClass.sum(2, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void arithException() {
        myClass.arithException(5);
    }

    @Test
    public void subtraction() {
        Assert.assertFalse("Subtraction failed", myClass.subtraction(16, 5) == 10);
    }

    @Test
    public void compareLinks() {
        Assert.assertSame(myClass.compareLinks(), "Hello");
    }
}