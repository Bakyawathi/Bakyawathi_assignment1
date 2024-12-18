package stepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonCategory {
	ChromeDriver driver;
	WebElement category;

	@Given("Set the test environment")
	public void setEnvironment()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}

	
	@When("Click on the categories dropdown")
	public void clickAllDropDown()
	{
		category=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	}
	
	@Then("List the available categories")
	public void listCategories()
	{
		Select categoryDD=new Select(category);
		List<WebElement> categoryList=categoryDD.getOptions();
		for (WebElement iterateList : categoryList) {
			System.out.println(iterateList.getText());
	}
	}
}


