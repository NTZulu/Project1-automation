import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nzulu\\.IntelliJIdea2019.1\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //driver.get("https://formy-project.herokuapp.com/datepicker");

//        WebElement datefield = driver.findElement(By.id("datepicker"));
//        datefield.sendKeys("03/03/2020");
//        datefield.sendKeys(Keys.RETURN); //close datepicker

        //Dropdown
//        driver.get("https://formy-project.herokuapp.com/dropdown");
//        WebElement DropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
//        DropDownMenu.click();
//
//        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
//        autocomplete.click();


        //File upload
        driver.get("https://formy-project.herokuapp.com/fileupload");
        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("file-to-upload.png");

        driver.quit();
    }




}