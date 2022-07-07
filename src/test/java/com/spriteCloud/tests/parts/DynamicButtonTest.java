package com.spriteCloud.tests.parts;

import com.spriteCloud.pages.DynamicIdPage;
import com.spriteCloud.tests.TestBase;
import com.spriteCloud.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicButtonTest extends TestBase {

    @Test
    public void test1(){
        extentLogger = report.createTest("Dynamic Button");
        DynamicIdPage obj1 = new DynamicIdPage();
        obj1.dynamicId.click();

        obj1.dynamicButton.click();
        Assert.assertTrue(obj1.dynamicButton.isEnabled(),"Dynamic Button is not enabled");
        extentLogger.pass("Dynamic Button test is passed");
    }
}
