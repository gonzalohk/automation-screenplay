package checkboxes;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CheckboxesTest extends BaseTest {
    @BeforeMethod
    public void init(){
         webDriver.get(URL + "checkboxes");
    }

    @Test
    public void testCheck(){
        //TODO ADD Logic
        Assert.assertEquals("test", "test");
    }

   @Test
    public void testUncheck(){
        //TODO ADD Logic
        Assert.assertEquals("test", "test");
    }


}