package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CitiBankSaving {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://citibank.com");
        driver.findElement(By.xpath("//*[@id=\'mobileMenuLink\']")).click();
        driver.findElement(By.xpath("//*[@id='navcreditCardmainAnchor0']")).click();
    }
}
