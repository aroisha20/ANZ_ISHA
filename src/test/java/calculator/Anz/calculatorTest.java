package calculator.Anz;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import calculator.Anz.Dataelements;
import calculator.Anz.Newstart;

public class calculatorTest extends Newstart {
	
		@BeforeTest
	public void  initialize() throws IOException, InterruptedException
	{
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
	}
		@Test(dataProvider= "getData")
		public void basePageNavigation(CharSequence[] yourincome,CharSequence[] yourotherincome, CharSequence[] livingexpenses, CharSequence[] otherloanrepayments, CharSequence[] totalcreditcardlimits) throws IOException
		{
			
			
			Dataelements dl= new Dataelements(driver);
			
			//dl.getApplicationtype().click();
			//dl.getpropertyyouwouldliketobuy().click();
			dl.getyourincome().sendKeys(yourincome);
			dl.getyourotherincome().sendKeys(yourotherincome);
		
			dl.getlivingexpenses().sendKeys(livingexpenses);
			dl.getotherloanrepayments().sendKeys(otherloanrepayments);
			dl.gettotalcreditcardlimits().sendKeys(totalcreditcardlimits);
			dl.getworkouthowmuchicouldborrow().click();
		
			dl.getstartover().click();
			
			
			
		}
		
		
			
		@DataProvider
		public Object[][] getData()
		{
			Object[][] data= new Object[1][5];
			//0th row
			data[0][0]= "80000";
			data[0][1]= "10000" ;
			data[0][2]= "500";
			data[0][3]= "100";
			data[0][4]= "10000";
					
			
			
			return data;
			
		}
		@AfterTest
		public void down()
		{
			driver.close();
		}
}
