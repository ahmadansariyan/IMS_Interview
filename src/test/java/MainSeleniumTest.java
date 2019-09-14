/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author ahmad
 */
public class MainSeleniumTest {
    
    
    WebDriver driver;
    @Test
    public void testSimple() throws Exception {
        
    // Optional. If not specified, WebDriver searches the PATH for chromedriver.
    System.setProperty("webdriver.chrome.driver", "C:/My Drive/Downloads/chromedriver_win32 (2)/chromedriver.exe");

    driver = new ChromeDriver();
    
    driver.get("https://github.com/ahmadansariyan");
    /*
    Thread.sleep(10000);  // Let the user actually see something!
    WebElement username = driver.findElement(By.name("user[login]"));    
    WebElement email = driver.findElement(By.name("user[email]"));    
    WebElement password = driver.findElement(By.name("user[password]"));    

    
    username.sendKeys("ahmadansariyan");
    username.submit();
    email.sendKeys("ahmadansariyan@gmail.com");
    email.submit();
    password.sendKeys("@2259586a");
    password.submit();
    //password.submit();
    */
    clickLinkByHref("JDeveloper");
    //WebElement login = driver.findElement(By.cssSelector("a href=\"/ahmadansariyan/JDeveloper\" class=\"text-bold flex-auto"));
    //login.click();
    
    Thread.sleep(50000);  // Let the user actually see something!
    System.out.print("Ahmad "+driver.getTitle());
    driver.quit();
    }
    public void clickLinkByHref(String href) {
        List<WebElement> anchors = driver.findElements(By.tagName("a"));
        Iterator<WebElement> i = anchors.iterator();

        while(i.hasNext()) {
            WebElement anchor = i.next();
            if(anchor.getAttribute("href").contains(href)) {
                anchor.click();
                break;
            }
        }
    }
    
}
