package apptests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import objectrepository.PageObjects;

public class Pageobject1Test {
  @Test
  public void searchTest1() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
	  PageObjects po =new PageObjects(driver);
	  po.search().sendKeys("banana");
	  po.searchButton().click();
	  System.out.println("searched banana");
  }
}
