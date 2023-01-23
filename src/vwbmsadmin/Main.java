package vwbmsadmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver", "C:\\Program Files\\Java\\jdk-19\\bin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://discovery.vwgroupsupply.com/test/pmweb/Login.aspx");

        //Find User Name and ser User Name
        WebElement txtbx_username1 = driver.findElement(By.name("ctl00$c$MaskLogin$TextBoxFieldElementUserName"));
        txtbx_username1.sendKeys("vwbmsadmin");

        //Password is set
        WebElement txtbx_username2 = driver.findElement(By.id("c_MaskLogin_TextBoxFieldElementPassword"));
        txtbx_username2.sendKeys("vwbmsadmi");

        //driver.findElement(By.name("ctl00$c$MaskLogin$ButtonButtonElementLogin")).sendKeys("musterlieferant");
        driver.findElement(By.id("c_MaskLogin_ButtonButtonElementLogin")).click();
        //driver.findElement(By.xpath("//input@[value='Anmelden' and @type='submit']")).click();
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000240")).click();


    }
}
