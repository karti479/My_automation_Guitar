package MyGuitar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/kartik/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.musicca.com/guitar");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Elements ele = new Elements(driver);
		
		
		ele.clickelements14();
		Thread.sleep(300);
		ele.clickelements10();
		Thread.sleep(300);
		ele.clickelement7();
		Thread.sleep(300);
		ele.clickelements13();
		Thread.sleep(300);
		ele.clickelements15();
		Thread.sleep(300);
		ele.clickelements10();
		Thread.sleep(300);
		ele.clickelements1();
		Thread.sleep(300);
		ele.clickelements19();
		Thread.sleep(300);
		ele.clickelements18();
		Thread.sleep(300);
		ele.clickelements17();
		Thread.sleep(300);
		ele.clickelements12();
		Thread.sleep(300);
		ele.clickelements11();
		Thread.sleep(300);
		ele.clickelements10();
		Thread.sleep(300);
		ele.clickelements1();
		Thread.sleep(300);
		ele.clickelement7();
		Thread.sleep(300);
		ele.clickelement5();
		Thread.sleep(300);
		ele.clickelements2();
		Thread.sleep(300);
		ele.clickelements3();
		Thread.sleep(300);
		ele.clickelements4();
		Thread.sleep(300);
		ele.clickelements6();
		Thread.sleep(300);
		ele.clickelements10();
		Thread.sleep(300);
		ele.clickelements1();
		Thread.sleep(300);
		ele.clickelement7();
		Thread.sleep(300);
		ele.clickelement5();
		Thread.sleep(300);
		ele.clickelements2();
		Thread.sleep(300);
		ele.clickelements3();
		Thread.sleep(300);
		ele.clickelements4();
		Thread.sleep(300);
		ele.clickelements6();
		Thread.sleep(300);
		ele.clickelements16();
		Thread.sleep(300);
		ele.clickelements15();
		Thread.sleep(300);
		ele.clickelements14();
		Thread.sleep(300);
		ele.clickelements13();
		driver.quit();

	}
	

}
