package checkboxes;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tasks.CheckElement;
import tasks.UncheckElement;


public class CheckboxesTest extends BaseTest {
    @BeforeMethod
    public void init(){
         webDriver.get(URL + "checkboxes");
    }

    @Test
    public void testCheck(){
        CheckElement.ClickChecbox1(webDriver);
        CheckElement.isSelectedCheck1(webDriver);
        Assert.assertTrue(CheckElement.isSelectedCheck1(webDriver));
    }

   @Test
    public void testUncheck(){
        UncheckElement.ClickChecbox2(webDriver);
        UncheckElement.isUnSelectedCheck2(webDriver);
        Assert.assertFalse(UncheckElement.isUnSelectedCheck2(webDriver));
    }


}
