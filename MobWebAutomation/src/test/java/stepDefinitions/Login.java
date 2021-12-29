package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Hook;

public class Login {
	private WebDriver driver;

	public Login() {
		this.driver = Hook.getDriver();
	}
	
	@Given("^Open https://beta.misli.com in Chrome browser$")
	public void open_https_beta_misli_com_in_chrome_browser() {
		
		
	}
	
	@And("^Click on Daxil Ol button$")
	public void click_on_daxil_ol_button() {
		driver.findElement(By.linkText("DAXİL OL")).click();
	}
	
	@When("^Enter correct phoneNumber and email$")
	public void enter_correct_phone_number_and_email() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("//html[@id='device']//input[@id='username']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//html[@id='device']//input[@id='username']"))
				.sendKeys(Keys.chord(Keys.CONTROL + "a" + Keys.DELETE));

		driver.findElement(By.xpath("//html[@id='device']//input[@id='username']")).sendKeys("0702011125");

		driver.findElement(By.xpath("//html[@id='device']//input[@id='password']")).click();
		driver.findElement(By.xpath("//html[@id='device']//input[@id='password']"))
				.sendKeys(Keys.chord(Keys.CONTROL + "a" + Keys.DELETE));
		driver.findElement(By.xpath("//html[@id='device']//input[@id='password']")).sendKeys("AAss0011");

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@And("^Click on login button$")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Then("^Check result$")
	public void check_result() {
		Assert.assertTrue((driver.findElement(By.xpath("//html[@id='device']//div[@id='misli-app']/header[@class='header']/div[@class='header-top']/div[@class='container']//div[@class='userInfoWrapper']/span")).isDisplayed()));// Profilim field is displayed
														
}
	
	 @When ("^Enter incorrect phoneNumber and email$")	 
	 public void enter_incorrect_phone_number_and_email() throws InterruptedException {
			Thread.sleep(2000);

			driver.findElement(By.xpath("//html[@id='device']//input[@id='username']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//html[@id='device']//input[@id='username']"))
					.sendKeys(Keys.chord(Keys.CONTROL + "a" + Keys.DELETE));

			driver.findElement(By.xpath("//html[@id='device']//input[@id='username']")).sendKeys("0702");

			driver.findElement(By.xpath("//html[@id='device']//input[@id='password']")).click();
			driver.findElement(By.xpath("//html[@id='device']//input[@id='password']"))
					.sendKeys(Keys.chord(Keys.CONTROL + "a" + Keys.DELETE));
			driver.findElement(By.xpath("//html[@id='device']//input[@id='password']")).sendKeys("AAss0011");

			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			
		}
	 
 
	 @Then("^Check result1$")
		public void check_result1() throws InterruptedException {
		 Thread.sleep(1000);
		 
		 String alert = driver.findElement(By.xpath(
				 "//html[@id='device']//div[@id='m-login']/div/div[2]//form[@class='frmLogin row']//div[@class='alert alert-danger']")).getText();
				 				 String sal = alert.substring(0,7);
				 
		 
		 
			Assert.assertEquals(sal,"Mobil n");  // Error is displayed
															
	}
	 
		
}
