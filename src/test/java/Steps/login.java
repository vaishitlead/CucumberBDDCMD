package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {


	@Given("user calculate {int}\\/{int}")
	public void user_calculate(Integer int1, Integer int2) {

		int i=1/0;
		System.out.println(i);

	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
	}
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	}
	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
	}
	@Then("error message is displayed -invalid credentials")
	public void error_message_is_displayed_invalid_credentials() {
	}




}
