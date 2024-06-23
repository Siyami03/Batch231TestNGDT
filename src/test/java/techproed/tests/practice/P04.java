package techproed.tests.practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import techproed.pages.DhtmlPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExtentReportUtils;

import java.util.List;

public class P04 {

    @Test(description = "US001 - AC-04 Drag and drop functionality test")
    public void dragAndDropTest() {

        //http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html adresine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("dhtmlUrl"));
        ExtentReportUtils.extentTestInfo("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html adresine gidilir");

        //Tüm ülkeleri yazdırınız
        DhtmlPage dhtmlPage = new DhtmlPage();
        List<WebElement> countries = dhtmlPage.countries;
        for(WebElement w: countries){
            System.out.println(w.getText());
        }
        ExtentReportUtils.extentTestInfo("Tum ulkeler yazdirilir");


        //Ülkeler ile şehirleri eşleştiriniz
        Actions actions = new Actions(Driver.getDriver());
        actions.
                dragAndDrop(dhtmlPage.seoul,dhtmlPage.korea).
                dragAndDrop(dhtmlPage.oslo,dhtmlPage.norway).
                dragAndDrop(dhtmlPage.stockholm,dhtmlPage.sweden).
                dragAndDrop(dhtmlPage.washington,dhtmlPage.usa).
                dragAndDrop(dhtmlPage.rome,dhtmlPage.italy).
                dragAndDrop(dhtmlPage.madrid,dhtmlPage.spain).
                dragAndDrop(dhtmlPage.copenhagen,dhtmlPage.denmark).perform();
        ExtentReportUtils.extentTestInfo("Tum ulkeler ilgili yerlere drag and drop yapilabilir");
    }
}
