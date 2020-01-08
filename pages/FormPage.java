import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {

    public static void submitForm(WebDriver driver){
        driver.findElement(By.id("first-name")).sendKeys("Lelo");
        driver.findElement(By.id("last-name")).sendKeys("Zulu");
        driver.findElement(By.id("job-title")).sendKeys("QA");
        driver.findElement(By.id("radio-button-3")).click();
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("05/01/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
    }

}
