package musterlieferant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerticalCheckModules {
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
        // Open Module ARBEITSPLATZ
        driver.findElement(By.id("CXMaskMenu_ButtonLink_SCM_eurolog_MenuItemDashboard")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

        // Open Module STORNIERT
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000294")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
        // Open Module DISPOSITIONSUEBERSICHT LEERGUT
        driver.findElement(By.id("CXMaskMenu_ButtonLink_PM_MenuRPOrderPosition")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

        // Open Module SONDERBESTELLUNG
        driver.findElement(By.id("CXMaskMenu_ButtonLink_PM_MenuTAOrder")).click();
        driver.findElement(By.className("button_main_small")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

        // Open Module BESTANDSUEBERSICHT
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000187")).click();
        driver.findElement(By.className("button_main_small")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

        // Open Module STANDORTAUSZUG
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000191")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

        // Open Module REKLAMATION ERFASSEN
        driver.findElement(By.id("CXMaskMenu_ButtonLink_PM_MenuTAClaimUnified")).click();
        //driver.findElement(By.className("button_main_small")).click();
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
        }

        // Open Module REKLAMATIONSUEBERSICHT
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000270")).click();
        driver.findElement(By.className("button_main_small")).click();
        try{
            Thread.sleep(8800);
        }
        catch(InterruptedException ie){
        }

        // Open Module REKLAMATIONSVORSCHLAEGE
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000192")).click();
        //driver.findElement(By.className("button_main_small")).click();
        try{
            Thread.sleep(7000);
        }
        catch(InterruptedException ie){
        }

        // Open Module STORNIERTE MATs
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000214")).click();
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException ie){
        }

        // Open Module ABRECHNUNGSUEBERSICHT
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000228")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

        // Open Module NEUE INVENTUR
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000244")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

        // Open Module INVENTURERFASSUNG
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000242")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

        // Open Module INVENTURHISTORIE
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000240")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

        // Open Module NEUER BROWSER-REITER
        //driver.findElement(By.id("CXMaskMenu_ButtonLink_PM_MenuNewSession")).click();
        //try{
        //    Thread.sleep(1000);
        //}
        //catch(InterruptedException ie){
        //}

        //Logout mit click auf "Abmelden"
        driver.findElement(By.id("LinkButtonLogoff")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
        driver.quit();
    }
}