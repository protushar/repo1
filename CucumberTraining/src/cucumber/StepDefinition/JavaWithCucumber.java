package cucumber.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class JavaWithCucumber {

	@Given("^I navigate to login page of application$")
	public void i_navigate_to_login_page_of_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
	}

	@Given("^I entered username and password$")
	public void i_entered_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("^i click login button$")
	public void i_click_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^i should see home page$")
	public void i_should_see_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}


	}
