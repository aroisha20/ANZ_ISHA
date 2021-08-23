package stepdefinations;



import calculator.Anz.Dataelements;
import calculator.Anz.Newstart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination extends Newstart {
	
	
	 @Given("^Open URL$")
	    public void open_url() throws Throwable {
		 driver= initializeDriver();
		 driver.get(prop.getProperty("url"));
	    }

	 @When("^After entering all details your_income \"([^\"]*)\",your_otherincome \"([^\"]*)\",living_expenses \"([^\"]*)\",other_loan_repayments \"([^\"]*)\",total_creditcardlimits \"([^\"]*)\" and click on How much i could borrow button$")
	    public void after_entering_all_details_yourincome_somethingyourotherincome_somethinglivingexpenses_somethingotherloanrepayments_somethingtotalcreditcardlimits_something_and_click_on_how_much_i_could_borrow_button(String strArg1, String strArg2, String strArg3, String strArg4, String strArg5) throws Throwable {

		 Dataelements dl= new Dataelements(driver);
			//dl.getApplicationtype().click();
			//dl.getpropertyyouwouldliketobuy().click();
			dl.getyourincome().sendKeys(strArg1);
			dl.getyourotherincome().sendKeys(strArg2);
		
			dl.getlivingexpenses().sendKeys(strArg3);
			dl.getotherloanrepayments().sendKeys(strArg4);
			dl.gettotalcreditcardlimits().sendKeys(strArg5);
			dl.getworkouthowmuchicouldborrow().click(); 
			
	    }

	 @Then("^Total borrow amount should calculate as borrowResultTextAmount \"([^\"]*)\"$")
	    public void total_borrow_amount_should_calculate_as_borrowresulttextamount_something(String strArg1) throws Throwable { 
		 Dataelements dl= new Dataelements(driver);
		 System .out.println("borrowResultTextAmount");
	        System .out.println(strArg1);
	        Thread.sleep(1000);
	        dl.getstartover().click();
	     
	      
	        
	    }
	    
	
}
	 