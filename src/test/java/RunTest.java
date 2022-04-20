import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RunTest {

    @Before
    public void before(){
        System.out.println("Старт Теста:");
    }

    @Test
    public void test1(){
        System.out.println("Тестируем");
        Assert.assertEquals(5+5, 10);

    }

    @Test
    public void test2(){
        System.out.println("Тестируем");
        Assert.assertEquals(55+55, 11);

    }
    @After
    public void after(){
        System.out.println("Конец Теста");

    }
}
