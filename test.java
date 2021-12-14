
	package appiumTest;

	import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.MobileElement;

	public class test {

		static AppiumDriver<MobileElement> driver;

		public static void main(String[] args) {
			try {

				openCalculator();
				
				
			} catch (Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				
				exp.printStackTrace();

			}

		}

		public static void openCalculator() throws Exception {

			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "61f0bd13");
			cap.setCapability("udid", "61f0bd13");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "10.0");
			cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
			cap.setCapability("appActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");

			driver = new AppiumDriver<MobileElement> (url, cap);

			System.out.println("application started...");
		}
	}


