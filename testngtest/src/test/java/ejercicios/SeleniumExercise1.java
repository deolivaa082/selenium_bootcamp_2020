package ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

public class SeleniumExercise1 {
    public static void main(String[] arg) throws InterruptedException{
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        WebDriver myDriver = new FirefoxDriver();
        myDriver.get("https://www.google.com.mx");
        System.out.println(myDriver.getTitle());
        System.out.println(myDriver.getCurrentUrl());
        System.out.println(myDriver.getPageSource());
        Thread.sleep(2000);
        myDriver.close();
    }

}
