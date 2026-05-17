package sample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.out.println("first");
    System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demoqa.com");
	 Thread.sleep(3000);
	 driver.quit();
	 System.out.println("sample Execution complete");
	 
	}

}
