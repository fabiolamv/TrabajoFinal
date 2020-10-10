package TestBasic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasicMovil {

    /**
     {
     "deviceName": "Xiaomi de Faby",
     "platformVersion": "10",
     "appPackage": "com.vrproductiveapps.whendo",
     "appActivity": ".ui.HomeActivity",
     "platformName": "Android"
     }
     **/
    private AppiumDriver driver;

    @Before
    public void before() throws MalformedURLException {
        System.out.println("Before Iniciando Conexion...");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Xiaomi de Faby");
        capabilities.setCapability("platformVersion","10");
        capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity",".ui.HomeActivity");
        capabilities.setCapability("platformName","Android");

        this.driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        this.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    @Test
    public void myfirstTest(){
        //press +
       this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();

       // verificacion
        //String actualResult = this.driver.findElement(By.id("")).getText();
       // String expectedResult = "Juan";

       // Assert.assertEquals("Error, dato incollrecto",expectedResult,actualResult);


    }

    @After
    public void after(){
        System.out.println("After...");
        //this.driver.quit();
    }

}
