package techproed.tests.day20_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.Driver;

public class C03_PageClassTest {

    //Go to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    //Log in by locating the UserName, UserPassword, submitButton elements
    //user=Admin
    //userPassword=admin123
    //Test that the Login Test is successful
    //close the page


    @Test
    public void test01() {

        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim login olalım
        //kullanici=Admin
        //kullaniciSifre=admin123
        OpenSourcePage openSourcePage = new OpenSourcePage();
        openSourcePage.userName.sendKeys("Admin");
        openSourcePage.password.sendKeys("admin123");
        openSourcePage.loginButton.submit();

        //Login Testinin basarili oldugunu test edelim
        Assert.assertTrue(openSourcePage.dashboard.isDisplayed());

        //sayfayı kapatalim
        Driver.closeDriver();


    }
}
