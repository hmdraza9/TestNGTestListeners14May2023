package testAllListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;

public class WebdriverEvantListener implements WebDriverListener {

	public void beforeGet(WebDriver driver, String url) {

		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

	public void afterGet(WebDriver driver, String url) {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

	public void beforeGetCurrentUrl(WebDriver driver) {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

	public void afterGetCurrentUrl(String result, WebDriver driver) {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

	public void beforeGetTitle(WebDriver driver) {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

	public void afterGetTitle(WebDriver driver, String result) {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

}
