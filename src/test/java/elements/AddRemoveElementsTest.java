package elements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tasks.AddElement;

public class AddRemoveElementsTest extends BaseTest {
    @BeforeMethod
    public void init(){
         webDriver.get(URL + "add_remove_elements/");
    }

    @Test
    public void testAddElement(){
        int numberElementsBeforeAdd = AddElement.size(webDriver);
        AddElement.add(webDriver);
        int numberElementsAfterAdd = AddElement.size(webDriver);
        Assert.assertEquals(numberElementsBeforeAdd + 1, numberElementsAfterAdd);
    }

   @Test
    public void testRemoveElement(){
        //TODO ADD Logic
        Assert.assertEquals("test", "test");
    }


}