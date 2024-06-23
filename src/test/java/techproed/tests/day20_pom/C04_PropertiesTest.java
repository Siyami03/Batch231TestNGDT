package techproed.tests.day20_pom;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C04_PropertiesTest {

    @Test
    public void testName() {

        String url = ConfigReader.getProperty("amazonUrl");
        System.out.println("url = " + url);
        Driver.getDriver().get(url);
        Driver.getDriver().get(ConfigReader.getProperty("techproedUrl"));

    }

}
