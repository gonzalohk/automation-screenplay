package elements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddRemoveElementsTest extends BaseTest {
    @BeforeMethod
    public void init(){
         webDriver.get(URL + "add_remove_elements/");
    }

    @Test
    public void testAddElement(){
        //TODO ADD Logic
        Assert.assertEquals("test", "test");
    }

   @Test
    public void testRemoveElement(){
        //TODO ADD Logic
        Assert.assertEquals("test", "test");
    }


}