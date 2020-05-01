package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class HandsOn2 {

    public static void main(String[] arg) throws InterruptedException{
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        WebDriver myDriver = new FirefoxDriver();
        myDriver.navigate().to("https://www.google.com.mx");

        System.out.println(myDriver.getCurrentUrl());

        if(myDriver.getCurrentUrl().equals("https://www.google.com.mx/")){
            myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            WebElement myElement =  myDriver.findElement(By.name("q"));
            myElement.sendKeys("Selenium");
            myElement.submit();
            Thread.sleep(10000);
        }
        else
            System.out.println("No correcto");
        myDriver.close();
    }
}
