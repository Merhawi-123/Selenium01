package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	
	private WebDriver driver;
	
		@Given("I have entered 70 into the calculator")
		public void i_have_entered_into_the_calculator(Integer int1) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium2\\chromedriver.exe");

		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.math.net/calculators/addition");
		    Thread.sleep(5000);  // Let the user actually see something!
		    WebElement field1 =driver.findElement(By.id("cval1"));
		    field1.sendKeys("70");
		    field1.submit();
		   
		   
		    
		}

		@And("I have also entered 50 into the calculator")
		public void i_have_also_entered_into_the_calculator(Integer int1) {
			WebElement field2 =driver.findElement(By.id("cval2"));
		    field2.sendKeys("50");
		    field2.submit();
		   
		}
		@When("I press add")
		public void i_press_add() {
		    
		}
		@Then("the result should be {int} on the screen")
		public void the_result_should_be_on_the_screen(Integer int1) {
		     boolean scissorDisplayed= scissor.isDisplayed();
		    assertEquals("579",element.getText());
		    driver.quit();
			
		}


}

