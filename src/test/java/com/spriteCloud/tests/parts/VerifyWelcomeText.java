package com.spriteCloud.tests.parts;

import com.spriteCloud.pages.VerifyTextPage;
import com.spriteCloud.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyWelcomeText extends TestBase {

    @Test
    public void test2() {
        extentLogger= report.createTest("Verify Welcome Text");
        VerifyTextPage obj2 = new VerifyTextPage();
        obj2.verifyText.click();

        String text = obj2.textArea.getText();

        Assert.assertTrue(text.contains("Welcome"));
        extentLogger.pass("Verify text test is passed ");
    }
}
