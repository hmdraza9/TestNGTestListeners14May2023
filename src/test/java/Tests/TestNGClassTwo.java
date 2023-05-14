package Tests;

import com.test.Listeners.TestListenerClass;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListenerClass.class)

public class TestNGClassTwo {

    @Test(priority = 1)
    public void test11(){

        System.out.println("In Test11");
        Assert.assertTrue(true);

    }
    @Test(priority = 12)
    public void test12(){

        System.out.println("In Test12");
        Assert.assertTrue(true);

    }
    @Test(priority = 13)
    public void test13(){

        System.out.println("In Test13");
        Assert.assertTrue(true);

    }
    @Test(priority = 14)
    public void test14(){

        System.out.println("In Test14");
        Assert.fail();

    }
    @Test(priority = 15)
    public void test15(){

        System.out.println("In Test15");
        Assert.fail();

    }
    @Test(priority = 16)
    public void test16(){

        System.out.println("In Test16");
        Assert.fail();

    }
    @Test(priority = 17)
    public void test17(){

        System.out.println("In Test17");
        Assert.assertTrue(true);

    }
    @Test(priority = 18)
    public void test18(){

        System.out.println("In Test18");
        Assert.fail();

    }
    @Test(priority = 19)
    public void test19(){

        System.out.println("In Test19");
        Assert.fail();

    }
    @Test(priority = 20)
    public void test20(){

        System.out.println("In Test20");
        Assert.assertTrue(true);

    }

}
