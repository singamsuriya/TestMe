package file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginmercury {
	WebDriver driver;

	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\NexGenTesting\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demoaut.com/");
		driver.manage().window().maximize();
	}

	@When("user name {string} and {string}")
	public void user_name_and(String a, String b) {
		 driver.findElement(By.name("userName")).sendKeys(a);
		    driver.findElement(By.name("password")).sendKeys(b);
		    driver.findElement(By.name("login")).click();
	    
	}

	@Then("user does succesfull login")
	public void user_does_succesfull_login() {
		driver.navigate().back();
	  
	}



	
	

}
