package step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class postSteps {
    @Given("^User should be logged in and should be present on his wall$")
    public void user_should_be_logged_in_and_should_be_present_on_his_wall() throws Throwable {
        System.out.println("user_should_be_logged_in_and_should_be_present_on_his_wall()......");
    }

    @When("^I type the message in the box$")
    public void i_type_the_message_in_the_box() throws Throwable {
        System.out.println("i_type_the_message_in_the_box()");

    }

    @When("^Click on the Post button$")
    public void click_on_the_Post_button(){
        System.out.println("click_on_the_Post_button()");

    }
    @Then("^the message should get posted\\.$")
    public void the_message_should_get_posted(){
        System.out.println("the_message_should_get_posted()");
    }

}
