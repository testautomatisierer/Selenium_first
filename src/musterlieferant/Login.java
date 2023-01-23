package musterlieferant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver", "C:\\Program Files\\Java\\jdk-19\\bin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://discovery.vwgroupsupply.com/test/pmweb/Login.aspx");

        //Find den User Name und gib dem Username ein
        WebElement txtbx_username1 = driver.findElement(By.name("ctl00$c$MaskLogin$TextBoxFieldElementUserName"));
        txtbx_username1.sendKeys("musterlieferant");

        //Find das Passwort und gib das Passwort ein
        WebElement txtbx_username2 = driver.findElement(By.id("c_MaskLogin_TextBoxFieldElementPassword"));
        txtbx_username2.sendKeys("musterlieferant");

        //Login mit click auf "Anmelden"
        driver.findElement(By.id("c_MaskLogin_ButtonButtonElementLogin")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
        //Logout mit click auf "Abmelden"
        driver.findElement(By.id("LinkButtonLogoff")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

    }
}