package techproed.tests.day19_annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_BeforeGroupAfterGroup {

    //Gruptan önce çalışan method oluştur ve grubunu "chrome" olarak belirle
    WebDriver driver;
    @BeforeGroups("chrome")
    public void chromeSetUp() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    //Gruptan önce çalışan method oluştur ve grubunu "edge" olarak belirle
    @BeforeGroups("edge")
    public void edgeSetUp() {
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    //3 test oluştur ve ikisinin grubunu "chrome" birinin grubunu ise "edge" olarak belirle, amazon,facebook,google git
    @Test(groups = "chrome")

    public void test01() {
        driver.get("https://amazon.com");
    }

    @Test(groups = "edge")
    public void test02() {
        driver.get("https://facebook.com");
    }
    @Test(groups = "chrome")
    public void test03() {
        driver.get("https://google.com");
    }

    //Grup sonrası sayfaları kapatan method oluştur ve grubunu belirle
    /*@AfterGroups("chrome")
    public void tearDown() {
        driver.quit();
    }*/
}
