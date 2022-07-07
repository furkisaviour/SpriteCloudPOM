package com.spriteCloud.tests;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.spriteCloud.utilities.ConfigurationReader;
import com.spriteCloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.*;
import org.testng.annotations.*;
import org.testng.xml.dom.Tag;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;

    protected static ExtentReports report ;

    protected static ExtentHtmlReporter htmlReporter;

    protected static ExtentTest extentLogger;

    @BeforeTest
    public void setUpTest(){
        report = new ExtentReports();

        String projectPath = System.getProperty("user.dir");
        String path = projectPath + "/test-output/report.html";

        htmlReporter = new ExtentHtmlReporter(path);

        report.attachReporter(htmlReporter);

        htmlReporter.config().setReportName("spriteCloud Test");

        report.setSystemInfo("Environment","QA");
        report.setSystemInfo("Browser", ConfigurationReader.get("browser"));
        report.setSystemInfo("OS",System.getProperty("os.name"));
    }

    @BeforeMethod
    public void setup() {
        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.get("url"));
    }

    @AfterMethod
    public void teardown2(){
        Driver.closeDriver();
    }

    @AfterTest
    public void teardownTest(){
        report.flush();
    }

}


