package bankInfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankOfAmerica {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver","C://Users//alimu//IdeaProjects//ShiponBhaiSelenium//driver//chromedriver.exe");


        WebDriver driver= new ChromeDriver();
        driver.get("https://ebay.com");
    }

}
