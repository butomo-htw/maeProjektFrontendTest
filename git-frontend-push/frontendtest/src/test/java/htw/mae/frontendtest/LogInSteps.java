package htw.mae.frontendtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Budi Utomo <s0525949@htw-berlin.de>
 *
 */
public class LogInSteps {
	private WebDriver browser;
	
	private static final String DHIS_DASHBOARD_URL_ADDRESS = "dhis-web-dashboard-integration";
	
	@Given("^dhis log in page$")
    public void openBrowser() {
		String givenUrlAddresse = System.getProperty("url");
		browser = new FirefoxDriver();
		//demo live : http://apps.dhis2.org/demo
		//demo tomcat : http://localhost:8081/dhis
		browser.get(givenUrlAddresse);
	}
	
	@When("^user log in$")
    public void logInWithCorrectUsernameAndPassword() {
		WebElement usernameFeld = browser.findElement(By.id("j_username"));
		usernameFeld.sendKeys("admin");
		WebElement userpasswordFeld = browser.findElement(By.id("j_password"));
		userpasswordFeld.sendKeys("district");
		WebElement sendButton = browser.findElement(By.id("submit"));
		sendButton.submit();
    }
	
	@Then("^user should see dashboard page$")
	public void assertDashboardPage() throws Exception
	{
		String getCurrentUrl = browser.getCurrentUrl();
		System.out.println("current url : " + getCurrentUrl);
		//check url
		if(getCurrentUrl.contains(DHIS_DASHBOARD_URL_ADDRESS))
		{
			//check the elements
			WebElement pageHeader = browser.findElement(By.id("header"));
			WebElement dashboardHeader = browser.findElement(By.id("dashboardHeader"));
			WebElement content = browser.findElement(By.id("contentDiv"));
			if(pageHeader==null || dashboardHeader ==null ||content==null)
			{
				throw new Exception();
			}
		}else
		{
			throw new Exception();
		}
		browser.close();
	}
}
