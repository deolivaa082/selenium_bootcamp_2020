package ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class SeleniumExercise3 {


    public static void main(String[] arg) throws InterruptedException{
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        WebDriver myDriver = new FirefoxDriver();
        myDriver.navigate().to("https://www.google.com.mx");
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().to("https://www.facebook.com.mx ");
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().to("https://www.espn.com.mx");
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().back();
        myDriver.navigate().back();
        myDriver.navigate().forward();
        myDriver.navigate().refresh();
        System.out.println(myDriver.getCurrentUrl());
        myDriver.close();
    }
}
