package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class SeleniumExercise4 {
    public static void main(String[] arg) throws InterruptedException{
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        WebDriver myDriver = new FirefoxDriver();
        myDriver.navigate().to("https://www.youtube.com.mx");
        WebElement myElement =  myDriver.findElement(By.name("search_query"));
        if(myElement.isDisplayed() && myElement.isEnabled()){
            myElement.sendKeys("Selenium");
             myElement.findElement(By.id("search-icon-legacy")).click();
            Thread.sleep(5000);
        }
        else
            System.out.println("No correcto");
        myDriver.close();
    }

}
