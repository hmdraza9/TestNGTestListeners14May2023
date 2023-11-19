package testAllListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

public class TestAllListeners implements WebDriverListener {

	public static void main(String[] args) {

		String searchTerm = "Selenium";

		System.out.println(new Throwable().getStackTrace()[0].getMethodName());

		WebDriver webDriver = new ChromeDriver();

		WebDriverListener listener = new WebdriverEvantListener();

		WebDriver driver = new EventFiringDecorator<WebDriver>(listener).decorate(webDriver);

		driver.get("https://www.google.com");

		System.out.println("getTitle... " + driver.getTitle());

		System.out.println("getCurrentUrl... " + driver.getCurrentUrl());

		WebElement searchBox = driver.findElement(By.name("q"));

		searchBox.sendKeys(searchTerm);

		System.out.println("Editing element: " + searchBox + ", keys are: " + searchTerm);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();

	}
}
