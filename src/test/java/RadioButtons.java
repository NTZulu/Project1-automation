import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nzulu\\.IntelliJIdea2019.1\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement Radiobutton1 = driver.findElement(By.id("radio-button-1"));
        Radiobutton1.click();

        WebElement Radiobutton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        Radiobutton2.click();

        WebElement Radiobutton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        Radiobutton3.click();

        driver.quit();
    }
}