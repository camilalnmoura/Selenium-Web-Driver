import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Navegacao {

    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver" , "C:\\Users\\55819\\Desktop\\Java\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage() .window() .maximize();
		System.out.println(driver.getTitle());
		driver.navigate() .refresh();
		driver.quit();


    }
}
