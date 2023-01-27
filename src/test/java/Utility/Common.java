package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Common {

	protected WebDriver driver;
	
	public Common(WebDriver driver) {
		this.driver=driver;
	}
	public boolean get(String url) {
		try {
			driver.get(url);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean pageScroll() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1200)", "");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
