package techproed.tests.day20_pom;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.AmazonPage;
import techproed.utilities.Driver;

public class C02_PageClassUsage {

    //Diger test methodlarindada tekrar tekrar olusturmamak icin class seviyesinde olusturduk
    AmazonPage amazonPage = new AmazonPage();

    @Test
    public void test01() {

        //https://amazon.com sayfasina gidelim
        Driver.getDriver().get("https://amazon.com");

        //arama kutusunda iphone aratalim
        amazonPage.searchbox.sendKeys("iphone", Keys.ENTER);

        //Sayfayı kapat
        Driver.closeDriver();

    }



}
