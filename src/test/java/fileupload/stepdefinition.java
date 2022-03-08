package fileupload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.fileuploadpage;

public class stepdefinition {
	WebDriver driver;
	
	@Given("I open the file upload demo site")
	public void i_open_the_file_upload_demo_site() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	    
	}
	@When("I upload the file")
	public void i_upload_the_file() {
		fileuploadpage page1 = new fileuploadpage(driver);
		page1.fileupload("C:/Users/ANKITHA/Desktop/java-selenium/testing.docx");
	    
	}


	@When("click on the term of services and submit")
	public void click_on_the_term_of_services_and_submit() {
		fileuploadpage page1 = new fileuploadpage(driver);
		page1.checkbox();
		page1.clickonsubmitbutton();
	    
	}



	@Then("verify the display of file upload successfully")
	public void verify_the_display_of_file_upload_successfully() throws InterruptedException {
		Thread.sleep(1000);
		fileuploadpage page1 = new fileuploadpage(driver);
		if(page1.checkdisplaymsg()) {
			System.out.println("message is displayed");
		}
		else{
			System.out.println("message is not displayed");
		}
	}



}
