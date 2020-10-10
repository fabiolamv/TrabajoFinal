package deviceFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android implements IDevice {
    @Override
    public AppiumDriver create() throws MalformedURLException {
        System.out.println("Iniciando Conexion...");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Xiaomi de Faby");
        capabilities.setCapability("platformVersion","10");
        capabilities.setCapability("appPackage","com.bolivia365.bolivia365");
        capabilities.setCapability("appActivity",".views.SplashActivity");
        capabilities.setCapability("platformName","Android");

        AppiumDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        return driver;
    }
}
