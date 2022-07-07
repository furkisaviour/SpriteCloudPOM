package com.spriteCloud.pages;

import com.spriteCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyTextPage extends BasePage {

    public VerifyTextPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//span[@class='badge-secondary'])[4]")
    public WebElement textArea;



}
