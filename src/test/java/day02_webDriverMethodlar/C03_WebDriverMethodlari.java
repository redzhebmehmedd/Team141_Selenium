package day02_webDriverMethodlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WebDriverMethodlari {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        System.out.println(driver.getCurrentUrl());
        // driver'in icinde oldugu sayfanin Url'ini getirir
        // https://www.testotomasyonu.com/

        System.out.println(driver.getTitle());
        // driver'in icinde oldugu sayfanin title'ini getirir
        // Test Otomasyonu - Test Otomasyonu


        System.out.println("=======SayfaKaynagi======");
        System.out.println(driver.getPageSource());
        // butun sayfa kaynagini getirir
        // testlerde cok kullanilmaz

        System.out.println(driver.getWindowHandle()); //6AE802D74D6A18291C9302E18E023570
        System.out.println(driver.getWindowHandles()); // [6AE802D74D6A18291C9302E18E023570]
        /*
          Bunu ayri bir konu olarak isleyecegiz
          getWindowHandle() driver'in icinde oldugu sayfayi atadigi
          unique WindowHandleDegerini getirir

          eger test sirasinda
          birden fazla browser acilisrsa
          acilan tum sayfalarin WindowHandelDegerlerini
          bir set olarak getirir

         */


        Thread.sleep(3000);

        driver.quit();
    }
}
