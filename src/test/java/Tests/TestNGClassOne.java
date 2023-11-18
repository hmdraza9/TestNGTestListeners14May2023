package Tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.listeners.Listeners.TestListenerClass;

@Listeners(TestListenerClass.class)

public class TestNGClassOne {

    @Test(priority = 1)
    public void test1(){

        System.out.println("In Test1");
        Assert.assertTrue(true);

    }
    @Test(priority = 2)
    public void test2(){

        System.out.println("In Test2");
        Assert.assertTrue(true);

    }
    @Test(priority = 3)
    public void test3(){

        System.out.println("In Test3");
        Assert.assertTrue(true);

    }
    @Test(priority = 4)
    public void test4(){

        System.out.println("In Test4");
        Assert.fail();

    }
    @Test(priority = 5)
    public void test5(){

        System.out.println("In Test5");
        Assert.fail();

    }
    @Test(priority = 6)
    public void test6(){

        System.out.println("In Test6");
        Assert.fail();

    }
    @Test(priority = 7)
    public void test7(){

        System.out.println("In Test7");
        Assert.assertTrue(true);

    }
    @Test(priority = 8)
    public void test8(){

        System.out.println("In Test8");
        Assert.fail();

    }
    @Test(priority = 9)
    public void test9(){

        System.out.println("In Test9");
        Assert.fail();

    }
    @Test(priority = 10)
    public void test10(){

        System.out.println("In Test10");
        Assert.assertTrue(true);

    }

}
