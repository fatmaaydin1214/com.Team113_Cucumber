package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
   private static WebDriver driver;
   private Driver(){
       /*Singleton Pattern kull istenmeyn yontemlerle driver objesine erisilmesini engelledik

       Constructor'i private yaparak bu class'tan obje olusturarak class uyelerinin kullanilmasinin önune gectik
        */

   }
    public static WebDriver getDriver(){
        String istenenBrowser = ConfigReader.getProperty("browser");

       if (driver==null){

           switch (istenenBrowser){
               case "firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driver=new FirefoxDriver();
                   break;
               case "safari":
                   WebDriverManager.safaridriver().setup();
                   driver=new SafariDriver();
                   break;
               case "edge":
                   WebDriverManager.edgedriver().setup();
                   driver=new EdgeDriver();
                   break;
               default:
                   WebDriverManager.chromiumdriver().setup();
                   driver=new ChromeDriver();


           }

           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       }

        return driver;
    }
    public static void closeDriver(){

        if (driver!=null) {
            driver.close();
            driver = null;
        }
    }

    public static void quitDriver(){

        if (driver!=null) {
            driver.quit();
            driver = null;
        }
    }
}
