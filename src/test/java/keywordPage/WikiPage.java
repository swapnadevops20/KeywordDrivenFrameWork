package keywordPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiPage {
	
	//create a base class---> initialmethod()--> driver object
	//extends base class here
	//create an object repository
	
	public static WebDriver driver;
	
	//every keyword -----> Action methods for the wiki page
	
	public static void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
				
	}
	
	//action methods
  public static void NavigateMethod()
  {
	  driver.get("https://www.wikipedia.org/");
  }
  public static void searchInputMethod()
  {
	  driver.findElement(By.id("searchInput")).sendKeys("Selenium Automation");
  }
  public static void searchButtonMethod()
  {
	  driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();
  }
  public static void clickMainPage()
  {
	  driver.findElement(By.linkText("Main page")).click();
  }
  public static void closeBrowser()
  {
	  driver.close();
  }
  
  public static void search1InputMethod()
  {
	  
  }
}
