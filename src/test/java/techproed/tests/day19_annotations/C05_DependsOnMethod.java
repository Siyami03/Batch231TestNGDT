package techproed.tests.day19_annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C05_DependsOnMethod {

    //Class'dan önce calısan method olustur
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));    }

    //test methodu olustur, https://amazon.com sitesine git, arama kutusuna selenium yazdır
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://amazon.com");
        Thread.sleep(3000);
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("selenium", Keys.ENTER);
        Thread.sleep(3000);
        Assert.assertTrue(false); } //Burada kasten fail aldik böylece bu teste bagli olan method calismayacak

    //test methodu olustur, sonuc yazisinin selenium icerdigini test et, önceki method ile ilşkilendir
    @Test(dependsOnMethods = "test01")
    public void test02() {

        String actualResultText=driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]")).getText();
        System.out.println("actualResultText = " + actualResultText);
        Assert.assertTrue(actualResultText.contains("selenium"));    }

}
