package com.spriteCloud.pages;

import com.spriteCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(xpath = "//a[@href='/verifytext']")
    public WebElement verifyText;

    @FindBy(xpath = "//a[@href='/dynamicid']")
    public WebElement dynamicId;

    @FindBy(xpath = "//a[@href='/visibility']")
    public WebElement visibility;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
