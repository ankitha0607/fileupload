package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fileuploadpage {
	WebDriver driver;
	
	By browsebutton = By.xpath("//*[@id=\"uploadfile_0\"]");
	By termofservicescheckbox = By.xpath("//*[@id=\"terms\"]");
	By submitbutton = By.xpath("//*[@id=\"submitbutton\"]");
	By filesubmissionmessage = By.xpath("//*[@id=\"res\"]");
	
	 public fileuploadpage(WebDriver driver) {
			
			this.driver = driver;
		}
	 
	 public void fileupload(String link) {
		 WebElement element = driver.findElement(browsebutton);
		 element.sendKeys(link); 
	
		 
	 }
	 public void checkbox() {
		 driver.findElement(termofservicescheckbox).click();
	 }
	 public void clickonsubmitbutton() {
		 driver.findElement(submitbutton).click();
	 }
	 public boolean checkdisplaymsg() {
		 boolean l = driver.findElement(filesubmissionmessage).isDisplayed();
		 return l;
	 }

}
