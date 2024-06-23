package techproed.tests.day19_annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

public class C04_Ignore {

    //Her test methodndan önce calusan method olustur
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    // 3 test methodu olustur, https://youtube.com, https://amazon.com, https://facebook.com sitelerine git ve
    // ıgnore calısması yap

    @Test @Ignore
    public void youtubeTest() {
        driver.get("https://youtube.com");
    }

    @Test(enabled = false)
    public void amazonTest() {
        driver.get("https://amazon.com");
    }

    @Test
    public void facebookTest() {
        driver.get("https://facebook.com");
    }

    //Her test methodundan sonra calısan method olustur ve sayfaları kapat
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
