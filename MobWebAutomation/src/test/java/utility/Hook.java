package utility;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class Hook {

	private static WebDriver driver;

	@Before
	public void setUp() {
		try {

			DesiredCapabilities caps = new DesiredCapabilities();

			caps.setCapability("deviceName", "61f0bd13");

			caps.setCapability("udid", "61f0bd13");

			caps.setCapability("platformName", "ANDROID");

			caps.setCapability("platformVersion", "10.0");

			caps.setCapability("automationName", "UiAutomator1");

			caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");

		   // caps.setCapability("appActivity",
			 //"org.chromium.chrome.browser.document.ChromeLauncherActivity");

			 ChromeOptions chromeOptions = new ChromeOptions();
			 chromeOptions.setExperimentalOption("w3c", false);
		 caps.merge(chromeOptions);

			URL url = new URL("http://localhost:4723/wd/hub");

			driver = new AppiumDriver<MobileElement>(url, caps);

			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		} catch (Exception exp) {

			System.out.println("Cause is: " + exp.getCause());
			System.out.println("Message is: " + exp.getMessage());
			exp.printStackTrace();
		}

	}

	@After
	public void tearDown() throws InterruptedException {

		Thread.sleep(3000);
		driver.quit();

	}
	
	public static WebDriver getDriver() {
		
		return driver;
	}

}
