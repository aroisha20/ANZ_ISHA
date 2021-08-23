package calculator.Anz;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Dataelements {
	public WebDriver driver;
	
	//By Applicationtype=  By.id("application_type_single");
	//By propertyyouwouldliketobuy=  By.xpath("//input[@id= 'borrow_type_home']");
	By yourincome=  By.xpath("//input[@aria-labelledby='q2q1']");
	By yourotherincome= By.xpath("//input[@aria-labelledby='q2q2']");
	By livingexpenses=  By.xpath("//input[@aria-labelledby='q3q1']");
	By otherloanrepayments= By.xpath("//input[@aria-labelledby='q3q3']");
	

	
	By totalcreditcardlimits=By.xpath("//input[@aria-labelledby='q3q5']");

	By workouthowmuchicouldborrow=By.xpath("//button[@class='btn btn--action btn--borrow__calculate']");
	By startover=By.xpath("//span[@class='icon icon_restart']");

	public Dataelements(WebDriver driver)
	{
		this.driver=driver;
	}

	//public WebElement getApplicationtype()
	//{
	//	return driver.findElement(Applicationtype);
	//}
	//public WebElement getpropertyyouwouldliketobuy()
	//{
	//	return driver.findElement(propertyyouwouldliketobuy);
	//}
	public WebElement getyourincome()
	{
		return driver.findElement(yourincome);
	}
	public WebElement getyourotherincome()
	{
		return driver.findElement(yourotherincome);
	}
	public WebElement getlivingexpenses()
	{
		return driver.findElement(livingexpenses);
	}
	public WebElement getotherloanrepayments()
	{
		return driver.findElement(otherloanrepayments);
	}
	public WebElement gettotalcreditcardlimits()
	{
		return driver.findElement(totalcreditcardlimits);
	}
	
	public WebElement getworkouthowmuchicouldborrow()
	{
		return driver.findElement(workouthowmuchicouldborrow);
	}
	public  WebElement getstartover()
	{
		return driver.findElement(startover);
	}
	
}
