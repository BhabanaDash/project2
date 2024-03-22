package Step_Definations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hotel {
	WebDriver driver;
	@Before
	public void before() {
		
		driver=new ChromeDriver(); 
		driver.get("https://adactinhotelapp.com/");
		System.out.println("Hello");
		
	}
	
	@Given("I am on Hotel App Login Page")
	public void i_am_on_hotel_app_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		  
		  String url=driver.getCurrentUrl();
		  Assert.assertEquals(url,"https://adactinhotelapp.com/");
		  }
	


	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("username")).sendKeys(string);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("I click Login")
	public void i_click_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.id("login")).click();
	}

	@Then("I am logged in succesfully")
	public void i_am_logged_in_succesfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		String greeting=driver.findElement(By.id("username_show")).getAttribute("value");
		//Assert.assertEquals(greeting, "Hello sriyaseth");
	}

	@Given("I am on Search Hotel Page")
	public void i_am_on_search_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	

	@When("I search location as {string}")
	public void i_search_location_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement e1= driver.findElement(By.id("location"));
		   Select locations = new Select(e1);
		   locations.selectByVisibleText(string);
	}

	@When("click on the search button")
	public void click_on_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("Submit")).click();
	}

	@Then("I can see the hotel")
	public void i_can_see_the_hotel() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	/*
	 * @After public void after() { driver.quit(); }
	 */



}
