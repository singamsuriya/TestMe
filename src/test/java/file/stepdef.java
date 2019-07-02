package file;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
	@Given("I have some cakes in my hand")
	public void i_have_some_cakes_in_my_hand() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("given");
	}

	@When("I wait some cakes in my hand")
	public void i_wait_some_cakes_in_my_hand() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("when");
	}

	@Then("my cakes will disapper")
	public void my_cakes_will_disapper() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("then");
	}



}
