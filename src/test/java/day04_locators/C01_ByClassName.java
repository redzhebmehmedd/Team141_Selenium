package day04_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_ByClassName {
    public static void main(String[] args) throws InterruptedException {

        // gerekli ayarlari yapin
        //System.setProperty("Webdriver.Chrome.driver","src/test/kurulumdosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // testotomasyonu anasayfaya gidin

        driver.get("https://www.testotomasyonu.com");


        // phone arama icin yapin
        WebElement aramaKutusu =  driver.findElement(By.id("global-search"));

        aramaKutusu.sendKeys("phone" + Keys.ENTER);

        // category bolumunde 8 element oldugunu test edin

        List<WebElement> categoryElementlerList =  driver.findElements(By.className("panel-list"));

        // category isimlerini yazdirin

       // System.out.println(categoryElementlerList);
        // Liste WebElementlerden olusuyor ve biz webelementleri direk yazdiramayiz
        // yazdirmak icin bir loop ile her bir webelementi ele alip, getText() ile
        //uzerindeki yazili konsola yazdirabiliriz

        for (WebElement eachElement: categoryElementlerList){

            System.out.println(eachElement.getText());
        }

        // arama sonucunda bulunan elemntlerin isimlerini yazdirin

        // List<WebElement> urunIsimElementleriList = driver.findElements(By.className("prod-title mb-3 "));

        // System.out.println(urunIsimElementleriList);

        // class attribute'unun degerinde karakterler arasinda space varsa
        // By.className() genelde hata verir
        // Yani class degerinde bosluk varsa kullanmamayi tercih ederiz
        // sayfayi kapatin

        Thread.sleep(3000);

        driver.quit();






    }
}
