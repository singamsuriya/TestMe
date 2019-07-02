package file;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class login {
	WebDriver driver;
	String exp="Find a Flight: Mercury Tours:";
	
	@Given("open the application")
	public void open_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\NexGenTesting\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demoaut.com/");
		driver.manage().window().maximize();
	}

	@When("entering the credentials")
	public void entering_the_credentials() {
	    driver.findElement(By.name("userName")).sendKeys("mercury");
	    driver.findElement(By.name("password")).sendKeys("mercury");
	    driver.findElement(By.name("login")).click();
	}

	@Then("successful login")
	public void successful_login() {
	  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   WebDriverWait wa=new WebDriverWait(driver,20);
		Assert.assertEquals(exp, driver.getTitle());
	}



}
