package stepDefinitions;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Hook;

public class RegistrationWithValidCredentials {

	private WebDriver driver;

	public RegistrationWithValidCredentials() {
		this.driver = Hook.getDriver();

	}
	
	@Given("Navigate to beta.misli.az")	
	public void navigate_to_beta_misli_az() {
		driver.get("https://beta.misli.az/");
	}
	
	@When("Press on Qeydiyyat button")
	public void press_on_qeydiyyat_button() {
		driver.findElement(By.linkText("QEYDİYYAT")).click();
	}
	
	@And("Enter name and surname")
	public void enter_name_and_surname() throws InterruptedException {

		Thread.sleep(1000);

		driver.findElement(By.xpath("//html[@id='device']//input[@id='firstName']")).click();
		driver.findElement(By.xpath("//html[@id='device']//input[@id='firstName']")).sendKeys("Rauf");
		driver.findElement(By.xpath("//html[@id='device']//input[@id='lastName']")).click();
		driver.findElement(By.xpath("//html[@id='device']//input[@id='lastName']")).sendKeys("Mirzoeyv");
	}
	
	@And("Enter birth date and e-mail")
	public void enter_birth_date_and_e_mail() {

		driver.findElement(By.xpath("//html[@id='device']//input[@id='birthDate']")).click();
		driver.findElement(By.xpath("//html[@id='device']//input[@id='birthDate']")).sendKeys("01.01.1998");
		driver.findElement(By.xpath("//html[@id='device']//input[@id='email']")).click();
		driver.findElement(By.xpath("//html[@id='device']//input[@id='email']")).sendKeys("Rauf.ire82y39171200y8zkv@zfsze.com");
	}
	
	@And("Enter password and phone number")
	public void enter_password_and_phone_number() {
		driver.findElement(By.xpath("//html[@id='device']//input[@id='mobileNumber']")).click();
		driver.findElement(By.xpath("//html[@id='device']//input[@id='mobileNumber']")).sendKeys("070 0071111");

		driver.findElement(By.xpath("//html[@id='device']//input[@id='password']")).click();
		driver.findElement(By.xpath("//html[@id='device']//input[@id='password']")).sendKeys("AAss0011");

	}
	
	@And("Accept users agreement")
	public void accept_users_agreement() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='signUpWrapper']/div/div/div/div/div/div/form/div[7]/div/label/div[2]"))
				.click();

		Thread.sleep(5000);
	}
	
	@Then("Press Qeydiyyatdan kechin button")
	public void press_qeydiyyatdan_kechin_button() {
		driver.findElement(By.xpath(
				"//html[@id='device']//div[@id='signUpWrapper']/div[@class='container']//form[@class='frmRegister']//button[@type='submit']/span[@class='btn-name']"))
				.click();

	}
	
	@And("Check entered mobile number")
	public void check_entered_mobile_number() {
		String phnNumber = driver.findElement(By.xpath("//html[@id='device']//input[@id='phoneVerify']")).toString();

		System.out.println("------------------------------------------------------------------");
		System.out.println(phnNumber);
		System.out.println("------------------------------------------------------------------");
	}


	
	@Then("Press Gonder button")
	public void press_gonder_button() {
		driver.findElement(By.xpath("//div[@id='emptyHeader']/div/div[2]/div/div/div[2]/div/div[2]/form/div[3]/div/button/span")).click();

	}
	
	@And("Enter OTP code")
	public void enter_otp_code() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//input[@name='activationCode1']")).click();  
		driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//input[@name='activationCode1']")).sendKeys("4");  
		driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//input[@name='activationCode2']")).click();
		driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//input[@name='activationCode2']")).sendKeys("9");
		driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//input[@name='activationCode3']")).click();
		driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//input[@name='activationCode3']")).sendKeys("5");
		driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//input[@name='activationCode4']")).click();
		driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//input[@name='activationCode4']")).sendKeys("3");
		 	
	}


	@Then("Press ENTER button")	
	public void press_enter_button() {
		driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//button[@type='submit']/span[@class='btn-name']")).click();

		driver.findElement(By.linkText("ANA SƏHİFƏYƏ QAYIT")).click();
	}

}
