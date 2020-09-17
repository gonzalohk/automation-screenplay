package elements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tasks.AddElement;
import tasks.RemoveElement;

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
        AddElement.add(webDriver);
        int numberElementsBeforeRemove = RemoveElement.size(webDriver);
        RemoveElement.remove(webDriver);
        int numberElementsAfterRemove = RemoveElement.size(webDriver);
        Assert.assertEquals(numberElementsBeforeRemove - 1, numberElementsAfterRemove);
    }
}