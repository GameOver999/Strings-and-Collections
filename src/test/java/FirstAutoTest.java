
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutoTest {
static ChromeDriver driver;
@BeforeClass
public static void initChrome(){
    driver = new ChromeDriver();
}

   @Test
    public void test(){
    driver.get("https://ithillel.ua/");
    if (driver.getTitle().equals("Комп'ютерна школа Hillel у Києві: курси IT-технологій")){
        System.out.println("Title отобразился");
    }else{
        System.out.println("Title не отобразился");
    }
    }
    @AfterClass
    public static void close(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
