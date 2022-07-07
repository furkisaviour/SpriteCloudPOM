package com.spriteCloud.tests.parts;

import com.spriteCloud.pages.VisibilityPage;
import com.spriteCloud.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VisibilityCheck extends TestBase {

    @Test
    public void test3(){
        extentLogger = report.createTest("Visibility Check");
        VisibilityPage obj3 = new VisibilityPage();
        obj3.visibility.click();

        obj3.hideButton.click();

        Assert.assertFalse(obj3.transparentButton.isDisplayed());
        extentLogger.pass("Visibility check test is passed");
    }

}
