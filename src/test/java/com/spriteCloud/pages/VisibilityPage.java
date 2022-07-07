package com.spriteCloud.pages;

import com.spriteCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisibilityPage extends BasePage{

    public VisibilityPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "hideButton")
    public WebElement hideButton;

    @FindBy(id = "transparentButton")
    public WebElement transparentButton;

}
