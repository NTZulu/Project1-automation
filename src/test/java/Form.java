import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class Form {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nzulu\\.IntelliJIdea2019.1\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        FormPage formPage = new FormPage();
        FormPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        ConfirmationPage.waitforAlertBanner(driver);
        assertEquals("The form was successfully submitted!",
                GetAlertBannerText(driver));
        driver.quit();
    }

    public static String GetAlertBannerText(WebDriver driver){
       return driver.findElement(By.className("alert")).getText();
    }
}