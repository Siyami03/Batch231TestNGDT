package techproed.tests.smoke;

import org.testng.annotations.*;

public class C01_Notasyonlar {

    //Herşeyden önce çalışan method oluştur ve "Herseyden önce 1 kez calisir" yazdır
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Herseyden önce @BeforeSuite notasyonuna sahip method 1 kez calisir ");
    }

    //Herşeyden sonra çalışan method oluştur ve "Herseyden sonra 1 kez calisir" yazdır
    @AfterSuite
    public void afterSuite(){
        System.out.println("Herseyden sonra @AfterSuite notasyonuna sahip method 1 kez calisir ");
    }

    //Testlerden önce çalışan method oluştur ve "Testlerden önce 1 kez calisir" yazdır
    @BeforeTest
    public void beforeTest(){
        System.out.println("Testlerden önce @BeforeTest notasyonuna sahip method 1 kez calisir ");
    }

    //Testlerden sonra çalışan method oluştur ve "Testlerden sonra 1 kez calisir" yazdır
    @AfterTest
    public void afterTest(){
        System.out.println("Testlerden sonra @AfterTest notasyonuna sahip method 1 kez calisir ");
    }

    //Class'dan önce çalışan method oluştur ve "Her Class'dan önce 1 kez calisir" yazdır
    @BeforeClass
    public void beforeClass(){
        System.out.println("Her class dan önce @BeforeClass notasyonuna sahip method 1 kez calisir ");
    }

    //Class'dan sonra çalışan method oluştur ve "Her Class'dan sonra 1 kez calisir" yazdır
    @AfterClass
    public void afterClass(){
        System.out.println("Her class dan sonra @AfterClass notasyonuna sahip method 1 kez calisir ");
    }

    //Her test methodun önce çalışan method oluştur ve "Her test methodun önce 1 kez calisir" yazdır
    @BeforeMethod
    public void setUp() {
        System.out.println("Her test methodun önce  @BeforeMethod notasyonuna sahip method 1 kez calisir ");
    }

    //Her test methodun sonra çalışan method oluştur ve "Her test methodun sonra 1 kez calisir" yazdır
    @AfterMethod
    public void tearDown() {
        System.out.println("Her testmethodun sonra  @AfterMethod notasyonuna sahip method 1 kez calisir ");
    }

    //test01 olustur ve "test01 methodu calisti" yazdır
    @Test
    public void test01() {
        System.out.println("test01 methodu calisti");
    }

    //test02 olustur ve "test02 methodu calisti" yazdır
    @Test
    public void test02() {
        System.out.println("test02 methodu calisti");
    }

    //test03 olustur ve "test03 methodu calisti" yazdır
    @Test(groups = "smoke")
    public void test03() {
        System.out.println("test03 methodu calisti");
    }

}
